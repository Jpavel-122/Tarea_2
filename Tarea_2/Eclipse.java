// Clase Elipse
class Elipse extends Forma {
    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, Punto centro, String nombre, double radioMayor, double radioMenor) {
        super(color, centro, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Elipse - Radio Mayor: " + radioMayor + ", Radio Menor: " + radioMenor);
    }

    @Override
    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * Math.sqrt((radioMayor * radioMayor + radioMenor * radioMenor) / 2);
    }
}