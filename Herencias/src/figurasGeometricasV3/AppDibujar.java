package figurasGeometricasV3;

import java.util.ArrayList;

public class AppDibujar
{
  public static void main (String[] args) throws InterruptedException
  {
       
    ArrayList<Figura>  dibujo;
    dibujo=new ArrayList();
    
    //Creo el campo verde "fijo" y lo muestro en el Lienzo
    Figura campo = new Rectangulo(0,400,"verde",200,800);
    campo.mostrar();
    
    //Creamos los objetos de la casita en un ArrayList de Figuras - Polimorfismo
    dibujo.add(new Cuadrado(200,200,"azul",200));
    dibujo.add(new Cuadrado(310,230,"magenta",70));
    dibujo.add(new Rectangulo(220,275,"negro",125,70));
    dibujo.add(new Rectangulo(220,100,"negro",60,40));
    dibujo.add(new Triangulo(300,100,"rojo", 100,300));
    dibujo.add(new Circulo(500,80,"amarillo",100));
   
    //Dibujamos la casita
    for (Figura f:dibujo){
        f.mostrar();
    }
    
    //Esperamos 3 Seg y desplazamos todos los objetos de la casita 200 px a la derecha
    Thread.sleep(3000);
    for (Figura f:dibujo){
        f.moverHorizontal(+200);
    }
  }
}