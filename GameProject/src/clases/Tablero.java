package clases;
public class Tablero extends Jpanel{
    public int cuadrado = 85;
    int columna = 8;
    int filas = 8;
    public Tablero(){
        this.setPreferredSize(new Dimension(columna * cuadrado, filas * cuadrado));
    }
    public void pintarComponentes(Graphics g){
        Graphics2D g2d = (Graphics2d) g;
        for(int r = 0 ; r < filas; r++)
            for(c = 0 ; c < columna; c++){
                g2d.setColor((c + r)% 2 == 0; Color.white: Color.black);
                g2d.fillRect(c * cuadrado, r * cuadrado, cuadrado, cuadardo);
            }

    }
}

