package figurasGeometricasV2;

import java.awt.*;

public class Triangulo extends Figura
{
    private int altura;
    private int base;
    
    public Triangulo(int xPos, int yPos, String color, int altura, int base)
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
     * hay que hacer en la clase Triángulo los métodos que dependen de base y altura, que son los atributos específicos de la clase
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
            int[] xpoints = { getXPos(),  getXPos() + (getBase()/ 2),  getXPos() - (getBase()/ 2) };
            int[] ypoints = { getYPos(), getYPos() + getAltura(), getYPos() + getAltura() };
            canvas.draw(this, getColor(), new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }
}
