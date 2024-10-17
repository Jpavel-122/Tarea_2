
// Clase Forma
abstract class Forma {
    private String color;
    private Punto centro;
    private String nombre;

    public Forma(String color, Punto centro, String nombre) {
        this.color = color;
        this.centro = centro;
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getCentro() {
        return centro;
    }

    public void mover(int x, int y) {
        centro.mover(x, y);
    }

    public void imprimir() {
        System.out.println("Forma: " + nombre + ", Color: " + color + ", Centro: " + centro);
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}

// Clase Cuadrado (Hereda de Rectangulo)
class Cuadrado extends Rectangulo {
    public Cuadrado(String color, Punto centro, String nombre, double lado) {
        super(color, centro, nombre, lado, lado);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Cuadrado - Lado: " + calcularArea());
    }
}

// Clase Circulo (Hereda de Elipse)
class Circulo extends Elipse {
    public Circulo(String color, Punto centro, String nombre, double radio) {
        super(color, centro, nombre, radio, radio);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Círculo - Radio: " + calcularArea());
    }
}
