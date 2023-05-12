import javax.swing.*;
import java.awt.*;

public class crear extends JFrame{
    static JFrame CurrentWindow;

    public static void CrearVentana(JFrame ventana,JPanel NamePanel,String Title,int Width,int Height){
        int[] dimensiones = new int[2];
        ventana.setTitle(Title);
        ventana.setContentPane(NamePanel);
        ventana.setSize(Width,Height);
        ventana.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        dimensiones[0] = screenSize.width /2 - Width / 2;
        dimensiones[1] = screenSize.height /2 - Height / 2;
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocation(dimensiones[0],dimensiones[1]);
        if (CurrentWindow != null){
            CurrentWindow.setVisible(false);
        }
        CurrentWindow = ventana;
    }
}
