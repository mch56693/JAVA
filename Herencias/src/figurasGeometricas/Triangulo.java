package figurasGeometricas;

import java.awt.*;


public class Triangulo
{
    private int xPos;
    private int yPos;
    private String color;
    private boolean visible;
    private int base;
    private int altura;
    
    public Triangulo(int xPos, int yPos, String color, int base, int altura)
    {
       this.xPos = xPos;
       this.yPos = yPos;
       this.color= color;
       visible = false;
       this.base=base;
       this.altura=altura;
    }

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
              
    public int getBase()
    {
        return base;
    }
    public void setBase (int base)
    {
        this.base = base;
    }
    
    public int getAltura()
    {
        return altura;
    }
    public void setAltura (int altura)
    {
        this.altura = altura;
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
    
    //CAMBIAR EL TAMAÑO DEL TRIÁNGULO
    public void cambiaTamaño(int altura, int base)
    {
        borrar();
        setAltura(altura);
        setBase(base);
        dibujar();
    }

    /*
     * DIBUJAR EL TRIÁNGULO EN VENTANA GRÁFICA HACIENDO USO DE 
     * LA CLASE Canvas
     */
    private void dibujar()
    {
        if(getVisible()) {
            Canvas canvas = Canvas.getCanvas();
            int[] xpoints = { getXPos(), getXPos() + (getBase()/2), getXPos() - (getBase()/2) };
            int[] ypoints = { getYPos(), getYPos() + getAltura(), getYPos() + getAltura()};
            canvas.draw(this, getColor(), new Polygon(xpoints, ypoints, 3));
            canvas.wait(10);
        }
    }

}
