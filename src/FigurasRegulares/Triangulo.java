package FigurasRegulares;

public class Triangulo {
    double base;
    double altura;

    // Constructor vacío
    public Triangulo() {}

    // Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

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

    public void atributostriangulo(){
        System.out.println("La base es " + this.base);
        System.out.println("La altura es " + this.altura);
        System.out.println("--------------------");
    }
    public void areatriangulo(){
        System.out.println("El área del triángulo es: " + (this.base * this.altura)/2);
    }
    public void perimetrotriangulo() {
        System.out.println("El perímetro del triángulo es: " + this.base + 2*(this.altura));
        System.out.println("--------------------");

    }

    // Solo devuelve el área para poder realizar la suma con el método personalizado
    public double calculoAreaTriangulo() {
        return (this.base * this.altura) / 2;
    }
}