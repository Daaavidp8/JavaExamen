import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class actividad1 extends JFrame {

    private JPanel panel1;
    private JSlider slider1;
    private JTextField ValorSlider;
    private JLabel Estado;
    private JButton siguiente;
    private int accept = 1;

    actividad1(){
        crear ventana = new crear();
        crear.CrearVentana(ventana,panel1,"Ventana Principal",800,600);
        ValorSlider.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        Estados();

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                ValorSlider.setText(String.valueOf(slider1.getValue()));
                Estados();

            }
        });
        ValorSlider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    slider1.setValue(Integer.parseInt(String.valueOf(ValorSlider.getText())));
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null,"Introduce un Numero","Ventana de error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                actividad2 ventana2 = new actividad2();
            }
        });
    }

    public void Estados(){
        Font font = new Font("Arial",Font.BOLD,25);
        Estado.setFont(font);
        if (slider1.getValue() <= 1000 ){
            Estado.setText("ESTABLE");
            Estado.setForeground(Color.GREEN);
        } else if (slider1.getValue() >= 1001 && slider1.getValue() <= 1500 ) {
            Estado.setText("PRECAUCIÓN");
            Estado.setForeground(Color.YELLOW);
        } else if (slider1.getValue() > 1500) {
            Estado.setText("RIESGO DE FUSION");
            Estado.setForeground(Color.RED);
            if (accept == 1){
                accept = JOptionPane.showConfirmDialog(null,"Estas en riesgo de fusion,desea continuar?","WARNING!",JOptionPane.YES_NO_OPTION);
                if (accept == 1){
                    slider1.setValue(1499);
                }
            }
        }
    }
}
