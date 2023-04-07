package figurasGeometricasV3;

import java.awt.*;

public class Rectangulo extends Figura
{
    private int base, altura;
   
    public Rectangulo (int xPos, int yPos, String color, int altura, int base)
    {
        super(xPos,yPos,color);
        this.altura=altura;
        this.base=base;
    }      
    
    public int getBase()
    {
        return this.base;
    }
    public void setBase (int base)
    {
        this.base = base;
    }
    
    public int getAltura()
    {
        return this.altura;
    }
    public void setAltura (int altura)
    {
        this.altura = altura;
    }
    /**
     * hay que hacer en la clase Rectángulo los métodos que dependen de base y altura, que son los atributos específicos de la clase
     * 
     * cambiarTamaño()  y dibujar()
    */
    
    
    public void cambiaTamaño(int nuevaAltura, int nuevaBase)
    {
        borrar();
        setAltura(nuevaAltura);
        setBase(nuevaBase);
        dibujar();
    }
    
    @Override
    public void dibujar()
    {
        if(getVisible()) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, getColor(), new Rectangle(getXPos(), getYPos(), getBase(), getAltura()));
            canvas.wait(10);
        }
    }
}  