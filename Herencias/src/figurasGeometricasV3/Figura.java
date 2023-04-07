package figurasGeometricasV3;

import java.awt.*;
import java.awt.geom.*;

public abstract class Figura
{
    private int xPos;
    private int yPos;
    private String color;
    private boolean visible;

    public Figura(int xPos, int yPos, String color)
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.color = color;
        visible = true;
    }
    public int getXPos()
    {
        return xPos;
    }
    public void setXPos(int x)
    {
        this.xPos=x;
    }
    
    public int getYPos()
    {
        return yPos;    
    }
    public void setYPos(int y)
    {
        this.yPos=y;
    }
    
    public String getColor()
    {
        return color;    
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    
    public boolean getVisible()
    {
        return visible;    
    }
    public void setVisible(boolean v)
    {
        this.visible=v;
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
    
    //CAMBIAR EL COLOR a "rojo", "amarillo", "azul", "verde","magenta","negro"
    public void cambiaColor(String color)
    {
        setColor(color);
        dibujar();
    }

    //BORRAR Y ELIMINAR HACIENDO USO DE LA CLASE Canvas
    public void borrar()
    {
        if(visible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
             
    /**
     * Dibujar es un método ABSTRACTO que dependerá de cada tipo de figura geométrica, se SOBREESCRIBE @Overrides en cada clase
     */
    public abstract void dibujar();
            
}
