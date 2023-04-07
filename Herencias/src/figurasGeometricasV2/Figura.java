package figurasGeometricasV2;

import java.awt.*;
import java.awt.geom.*;

/**
 * OPTIMIZAMOS EL EJERCICIO INICIAL CREANDO UNA CLASE "PADRE" "Figura". 
 * Las clases "Circulo" "Cuadrado" "Rectángulo"(NUEVA) y "Triangulo" HEREDAN (EXTENDS) de "Figuras" 
 * 
 * Tan sólo necesitamos escribir en cada clase los métodos "cambiaTamaño()" y dibujar()
 * para adaptarlos a cada figura geométrica. Todos los demás métodos relativos al 
 * color, posición y desplazamientos de cada figura geométrica se heredan de esta la clase "Figuras"
 * 
 */

public class Figura
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
    
       
    /*
     * Dibujar es un método que dependerá de cada tipo de figura geométrica,
     * se SOBREESCRIBE @Overrides en cada clase
     */
    public void dibujar()
    {
    
    }
}
