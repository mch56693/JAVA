package figurasGeometricasV2;

public class Appmostrar
{
  public static void main (String[] args)
  {
    Cuadrado fachada = new Cuadrado(200,200,"azul",200);
    Cuadrado ventana = new Cuadrado(310,230,"magenta",70);
    Rectangulo puerta = new Rectangulo(220,275,"negro",125,70);
    Rectangulo chimenea = new Rectangulo(220,100,"negro",60,40);
    Triangulo tejado = new Triangulo(300,100,"rojo", 100,300);
    Circulo sol = new Circulo(500,80,"amarillo",100);
    Rectangulo campo= new Rectangulo(0,400,"verde",200,800);
    fachada.mostrar();
    ventana.mostrar();
    puerta.mostrar();
    chimenea.mostrar();
    tejado.mostrar();
    sol.mostrar();
    campo.mostrar();
  }

}