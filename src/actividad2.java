import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class actividad2 {
    private JPanel panel2;
    private JPanel color;
    private JPanel choosecolor;
    private JPanel checkfont;
    private JPanel choosefont;
    private JRadioButton rojoRadioButton;
    private JRadioButton marronRadioButton;
    private JRadioButton naranjaRadioButton;
    private JRadioButton azulRadioButton;
    private JRadioButton amarilloRadioButton;
    private JRadioButton verdeRadioButton;
    private JLabel test;
    private JRadioButton broadwayRadioButton;
    private JRadioButton comicSansRadioButton;
    private JRadioButton SeriffRadioButton;
    private JRadioButton MagnetoRadioButton;
    private JRadioButton valor1;
    private JRadioButton valor2;
    private JRadioButton valor3;
    private JRadioButton valor4;
    private JRadioButton valor5;
    private JRadioButton valor6;
    private Color colorPanel;
    private int size;
    private String NameFont;

    static HashMap<String, Color> mapaColores = new HashMap<>(){{
       put("Rojo", Color.RED);
       put("Azul", Color.BLUE);
       put("Amarillo", Color.YELLOW);
       put("Verde", Color.GREEN);
       put("Naranja", Color.ORANGE);
       put("Marron", new Color(92, 64, 51));
    }};

    public actividad2(){
        crear ventana2 = new crear();
        crear.CrearVentana(ventana2,panel2,"Actividad2",800,600);
        ActionListener CambioColor = actionEvent -> {
            AbstractButton botonActual = (AbstractButton) actionEvent.getSource();
            color.setBackground(mapaColores.get(botonActual.getText()));
        };
        rojoRadioButton.addActionListener(CambioColor);
        azulRadioButton.addActionListener(CambioColor);
        amarilloRadioButton.addActionListener(CambioColor);
        marronRadioButton.addActionListener(CambioColor);
        naranjaRadioButton.addActionListener(CambioColor);
        verdeRadioButton.addActionListener(CambioColor);

        ActionListener Cambioletra = actionEvent -> {
            AbstractButton letraActual = (AbstractButton) actionEvent.getSource();
            try {
                size = Integer.parseInt(letraActual.getText());
            }catch (NumberFormatException exception){
                NameFont = letraActual.getText();
            }
            Font font = new Font(NameFont,Font.PLAIN,size);
            test.setFont(font);
        };

        comicSansRadioButton.addActionListener(Cambioletra);
        broadwayRadioButton.addActionListener(Cambioletra);
        SeriffRadioButton.addActionListener(Cambioletra);
        MagnetoRadioButton.addActionListener(Cambioletra);
        valor1.addActionListener(Cambioletra);
        valor2.addActionListener(Cambioletra);
        valor3.addActionListener(Cambioletra);
        valor4.addActionListener(Cambioletra);
        valor5.addActionListener(Cambioletra);
        valor6.addActionListener(Cambioletra);
    }
}
