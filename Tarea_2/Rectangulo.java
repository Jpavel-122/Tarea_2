// Clase Rectangulo
class Rectangulo extends Forma {
    private double ladoMenor;
    private double ladoMayor;

    public Rectangulo(String color, Punto centro, String nombre, double ladoMenor, double ladoMayor) {
        super(color, centro, nombre);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Rectángulo - Lado Menor: " + ladoMenor + ", Lado Mayor: " + ladoMayor);
    }

    @Override
    public double calcularArea() {
        return ladoMenor * ladoMayor;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ladoMenor + ladoMayor);
    }

    public void cambiarTamano(double factor) {
        ladoMenor *= factor;
        ladoMayor *= factor;
    }
}