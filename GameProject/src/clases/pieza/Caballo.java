package clases.pieza;

import clases.Tablero;

import java.awt.image.BufferedImage;

public class Caballo extends Pieza{
    public Caballo(Tablero tablero, int col , int row , boolean isWhite){
        super(tablero);
        this.col = col;
        this.row = row;
        this.xPos = col * tablero.cuadrado;
        this.yPos = col * tablero.cuadrado;
        this.isWhite = isWhite;
        this.name = "Caballo";
        this.sprite = sheet.getSubimage(3 * sheetScale, isWhite ? 0 : sheetScale,sheetScale,sheetScale).getScaledInstance(sheetScale,sheetScale, BufferedImage.SCALE_SMOOTH);
    }

}
