package figurasGeometricasV2;

import java.awt.*;

public class Cuadrado extends Figura
{
    private int lado;
   
    public Cuadrado(int xPos, int yPos, String color, int lado)
    {
        super(xPos,yPos,color);
        this.lado = lado;
    }
    
    public int getLado()
    {
        return this.lado;
    }
    public void setLado (int lado)
    {
        this.lado = lado;
    }
        
    
    /**
     * hay que hacer en la clase Cuadrado los métodos que dependen del lado, que es un atributo específico de la clase
     * 
     * cambiarTamaño()  y dibujar()
    */    
    public void cambiaTamaño(int nuevoLado)
    {
        borrar();
        setLado(nuevoLado);
        dibujar();
    }
    
    @Override
    public void dibujar()
    {
        if(getVisible()) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, getColor(), new Rectangle(getXPos(), getYPos(), getLado(), getLado()));
            canvas.wait(10);
        }
    }
}   
