import javax.swing.*;
import java.awt.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jframe frame = new Jframe();
        frame.
        frame.setLayout(new  GridBagLayout());
        frame.setMinumSize(new Dimension(1000,1000));
        frame.setLocationRelativeTo(Null);

        Tablero tablero = new Tablero();
        frame.add(Tablero);

        frame.setVisible(true);
    }
}