package figurasGeometricasV3;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.*;

/**
* La clase Canvas permitirá dibujar figuras simples en un "lienzo"
*/
public class Canvas
{
    private static Canvas canvasSingleton;

    /**
     * método factory para obtener el objeto Canvas que es un Singleton
    */
    public static Canvas getCanvas()
    {
        if(canvasSingleton == null) {
            canvasSingleton = new Canvas("Figuras", 800, 600, 
                    Color.white);
        }
        canvasSingleton.setVisible(true);
        return canvasSingleton;
    }

    private JFrame frame;
    private CanvasPane canvas;
    private Graphics2D graphic;
    private Color backgroundColour;
    private Image canvasImage;
    private List<Object> objects;
    private HashMap<Object, ShapeDescription> shapes;
    
    /**
     * Crear un Canvas.
     * @param title  
     * @param width 
     * @param height  
     * @param bgClour  
     */
    private Canvas(String title, int width, int height, Color bgColour)
    {
        frame = new JFrame();
        canvas = new CanvasPane();
        frame.setContentPane(canvas);
        frame.setTitle(title);
        canvas.setPreferredSize(new Dimension(width, height));
        backgroundColour = bgColour;
        frame.pack();
        objects = new ArrayList<Object>();
        shapes = new HashMap<Object, ShapeDescription>();
    }

    /**
     * cambia la visibilidad del canvas
     */
    public void setVisible(boolean visible)
    {
        if(graphic == null) {
            Dimension size = canvas.getSize();
            canvasImage = canvas.createImage(size.width, size.height);
            graphic = (Graphics2D)canvasImage.getGraphics();
            graphic.setColor(backgroundColour);
            graphic.fillRect(0, 0, size.width, size.height);
            graphic.setColor(Color.black);
        }
        frame.setVisible(visible);
    }

    /**
     * Dibuja una figura geométrica en el canvas.
     * @param  referenceObject  
     * @param  color            
     * @param  shape            
     */
    
    public void draw(Object referenceObject, String color, Shape shape)
    {
        objects.remove(referenceObject);   
        objects.add(referenceObject);      
        shapes.put(referenceObject, new ShapeDescription(shape, color));
        redraw();
    }
 
    
    public void erase(Object referenceObject)
    {
        objects.remove(referenceObject);   
        shapes.remove(referenceObject);
        redraw();
    }

    
    public void setForegroundColor(String colorString)
    {
        if(colorString.equals("rojo"))
            graphic.setColor(Color.red);
        else if(colorString.equals("negro"))
            graphic.setColor(Color.black);
        else if(colorString.equals("azul"))
            graphic.setColor(Color.blue);
        else if(colorString.equals("amarillo"))
            graphic.setColor(Color.yellow);
        else if(colorString.equals("verde"))
            graphic.setColor(Color.green);
        else if(colorString.equals("magenta"))
            graphic.setColor(Color.magenta);
        else if(colorString.equals("blanco"))
            graphic.setColor(Color.white);
        else
            graphic.setColor(Color.black);
    }

    /**
     * Espera un tiempo. Util para producir animaciones
     */
    public void wait(int milliseconds)
    {
        try
        {
            Thread.sleep(milliseconds);
        } 
        catch (Exception e)
        {
            
        }
    }

    /**
     * Redibuja las figuras en el Canvas.
     */
    private void redraw()
    {
        erase();
        for(Iterator i=objects.iterator(); i.hasNext(); ) {
            ((ShapeDescription)shapes.get(i.next())).draw(graphic);
        }
        canvas.repaint();
    }
       
    /**
     * Borra en canvas completo
     */
    private void erase()
    {
        Color original = graphic.getColor();
        graphic.setColor(backgroundColour);
        Dimension size = canvas.getSize();
        graphic.fill(new Rectangle(0, 0, size.width, size.height));
        graphic.setColor(original);
    }


    /************************************************************************
     * class CanvasPane - El componente Canvas contenido actualmente en el marco.
     * Es un JPanel con capacidad para refrescar la imagen contenida en él
     */
    private class CanvasPane extends JPanel
    {
        public void paint(Graphics g)
        {
            g.drawImage(canvasImage, 0, 0, null);
        }
    }
    
    private class ShapeDescription
    {
        private Shape shape;
        private String colorString;

        public ShapeDescription(Shape shape, String color)
        {
            this.shape = shape;
            colorString = color;
        }

        public void draw(Graphics2D graphic)
        {
            setForegroundColor(colorString);
            graphic.fill(shape);
        }
    }

}
