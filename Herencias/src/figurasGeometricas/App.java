package figurasGeometricas;

public class App
{
  public static void main (String[] args)
  {
    Cuadrado fachada = new Cuadrado(200,200,"azul",200);
    Cuadrado ventana = new Cuadrado(310,230,"magenta",70);
    Cuadrado puerta = new Cuadrado(220,275,"negro",70);
    Triangulo tejado = new Triangulo(300,100,"rojo", 300,100);
    Circulo sol = new Circulo(500,80,"amarillo",100);
    fachada.mostrar();
    ventana.mostrar();
    puerta.mostrar();
    tejado.mostrar();
    sol.mostrar();
  }
}