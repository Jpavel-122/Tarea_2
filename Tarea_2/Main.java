// Programa Principal
public class Main {
    public static void main(String[] args) {
        // Crear diferentes formas
        Forma rectangulo = new Rectangulo("Rojo", new Punto(5, 5), "Rectángulo", 4, 6);
        Forma elipse = new Elipse("Azul", new Punto(2, 3), "Elipse", 5, 3);
        Forma cuadrado = new Cuadrado("Verde", new Punto(7, 8), "Cuadrado", 4);
        Forma circulo = new Circulo("Amarillo", new Punto(1, 1), "Círculo", 3);

        // Agregar formas a un vector
        Forma[] formas = { rectangulo, elipse, cuadrado, circulo };

        // Recorrer todas las formas, calcular y mostrar la distancia recorrida al
        // moverlas
        for (Forma forma : formas) {
            System.out.println("\n--- " + forma.getClass().getSimpleName() + " ---");
            forma.imprimir();
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());

            // Guardar posición inicial
            Punto posicionInicial = new Punto(forma.getCentro().getX(), forma.getCentro().getY());

            // Mover la forma y calcular la distancia recorrida
            forma.mover(10, 10);
            double distanciaRecorrida = posicionInicial.distancia(forma.getCentro());
            System.out.println("Nueva posición: " + forma.getCentro());
            System.out.println("Distancia recorrida: " + distanciaRecorrida);
        }
    }
}