package FigurasRegulares;

public class Cuadrado {

    double lado;

    // Constructor vacío
    public Cuadrado() {}

    // Constructor con parámetros
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Getter y Setter

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Cálculo del área y perímetro del cuadrado mediante métodos personalizados


    public void ladocuadrado(){
        System.out.println("El lado del cuadrado es " + this.lado);
        System.out.println("--------------------");
    }
    public void areacuadrado(){
        System.out.println("El área del cuadrado es: " + this.lado * this.lado);
    }

    public void perimetrocuadrado() {
        System.out.println("El perímetro del cuadrado es: " + 4* this.lado);
        System.out.println("--------------------");

    }

    // Solo devuelve el área para poder realizar la suma con el método personalizado

    public double calculoAreaCuadrado() {
        return this.lado * this.lado;
    }
}