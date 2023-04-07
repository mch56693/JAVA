package figurasGeometricas;

import java.awt.*;
import java.awt.geom.*;

public class Circulo
{
    private int xPos;
    private int yPos;
    private String color;
    private boolean visible;
    private int diametro;

    // CONSTRUCTOR
    public Circulo(int xPos, int yPos, String color, int diametro)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.color= color;
        visible = false;
        this.diametro=diametro;
    }

    // GETTERS Y SETTERS
    public int getXPos()
    {
        return this.xPos;
    }
    public void setXPos (int xPos)
    {
        this.xPos = xPos;
    }
   
    public int getYPos()
    {
        return this.yPos;
    }
    public void setYPos (int yPos)
    {
        this.yPos = yPos;
    }   
    
    public String getColor()
    {
        return this.color;
    }
    public void setColor (String color)
    {
        this.color = color;
    }   
    
    public boolean getVisible()
    {
        return this.visible;
    }
    public void setVisible (boolean visible)
    {
        this.visible = visible;
    }
      
    public int getDiametro()
    {
        return this.diametro;
    }
    public void setDiametro (int diametro)
    {
        this.diametro = diametro;
    }
    
    //MOSTRAR EN PANTALLA
    public void mostrar()
    {
        setVisible(true);
        dibujar();
    }

    //OCULTAR
    public void ocultar()
    {
        borrar();
        setVisible(false);
    }

    //MOVER HORIZONTALMENTE UN NÚMERO DE PIXELS 
    public void moverHorizontal(int distancia)
    {
        borrar();
        setXPos(getXPos() + distancia);
        dibujar();
    }

    //MOVER VERTICALMENTE UN NÚMERO DE PIXELS 
    public void moverVertical(int distancia)
    {
        borrar();
        setYPos(getYPos() + distancia);
        dibujar();
    }
    
    //CAMBIAR EL COLOR
    public void cambiaColor(String color)
    {
        setColor(color);
        dibujar();
    }

    //BORRAR Y ELIMINAR HACIENDO USO DE LA CLASE Canvas
    private void borrar()
    {
        if(visible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
    
    //CAMBIAR EL TAMAÑO DEL CÍRCULO
    public void cambiaTamaño(int nuevoDiametro)
    {
        borrar();
        setDiametro(nuevoDiametro);
        dibujar();
    }
    
    /*
     * DIBUJAR EL CIRCULO EN VENTANA GRÁFICA HACIENDO USO DE 
     * LA CLASE Canvas
     */
    public void dibujar()
    {
        if(getVisible()) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, getColor(), new Ellipse2D.Double(getXPos(), getYPos(), getDiametro(), getDiametro()));
            canvas.wait(10);
        }
    }
}
