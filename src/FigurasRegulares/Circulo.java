package FigurasRegulares;

public class Circulo {
    double radio;

    // Constructor vacío
    public Circulo() {}

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getter y Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Cálculo del área y perímetro

    public void radiocirculo(){
        System.out.println("El radio es " + this.radio);
        System.out.println("--------------------");
    }
    public void areacirculo(){
        System.out.println("El área del círculo es: " + Math.PI * (this.radio * this.radio));
    }

    public void perimetrocirculo() {
        System.out.println("El perímetro del círculo es: " + 2*Math.PI * this.radio);
        System.out.println("--------------------");


    }

    // Solo devuelve el área para poder realizar la suma con el método personalizado
    public double calculoAreaCirculo() {
        return Math.PI * this.radio * this.radio; // Devuelve el área sin imprimir
    }


}