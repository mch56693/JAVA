package figurasGeometricasV3;

import java.awt.geom.*;

public class Circulo extends Figura
{
    private int diametro;
    
    public Circulo(int xPos, int yPos, String color, int diametro)
    {
       super(xPos,yPos,color);
       this.diametro = diametro;
    }
    
    public int getDiametro()
    {
        return this.diametro;
    }
    public void setDiametro (int diametro)
    {
        this.diametro = diametro;
    }
             
    /**
     * hay que hacer en la clase círculo los métodos que dependen del diámetro, que es un atributo específico de la clase círculo
     * 
     * cambiarTamaño()  y dibujar()
    */
    
    
    public void cambiaTamaño(int nuevoDiametro)
    {
        borrar();
        setDiametro(nuevoDiametro);
        dibujar();
    }
    
    @Override
    public void dibujar()
    {
        if(getVisible()) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, getColor(), new Ellipse2D.Double(getXPos(), getYPos(), getDiametro(), getDiametro()));
            canvas.wait(10);
        }
    }
}