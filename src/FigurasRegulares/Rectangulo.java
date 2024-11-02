package FigurasRegulares;

public class Rectangulo {
     double base;
     double altura;

    // Constructor sin vacío
    public Rectangulo() {}

    // Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Getters y Setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Cálculo del área y perímetro

    public void atributosrectangulo(){
        System.out.println("La base es " + this.base);
        System.out.println("La altura es " + this.altura);
        System.out.println("--------------------");
    }
    public void arearectangulo(){
        System.out.println("El área del rectángulo es: " + this.base * this.altura);
    }

    public void perimetrorectangulo() {
        System.out.println("El perímetro del rectángulo es: " + 2 *(base+altura));
        System.out.println("--------------------");

    }
    // Solo devuelve el área para poder realizar la suma con el método personalizado
    public double calculoAreaRectangulo() {
        return this.base * this.altura; // Devuelve el área sin imprimir
    }
}
