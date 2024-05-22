package clases.pieza;
import clases.Tablero;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Pieza {
    public int col, row;
    public int xPos, yPos;

    public boolean isWhite;
    public String name;
    public int value;

    BufferedImage sheet;
    {
        try{
            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("pieces.png"));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    protected int sheetScale = sheet.getWidth() / 6;
    Image sprite;
    Tablero tablero;
    public Pieza(Tablero tablero){
        this.tablero = tablero;
    }

}
