package FigurasRegulares;

import java.util.Scanner;

//José Vargas
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se crea el objeto cuadrado sin inicializarlo

        Cuadrado cuadrado = new Cuadrado();

        // Seteo de los valores ingresados por el usuario mediante teclado


        System.out.print("Ingresa el lado del cuadrado: ");
        cuadrado.setLado(scanner.nextDouble());

        // Imprimir el lado, área y perímetro del cuadrado
        cuadrado.ladocuadrado();
        cuadrado.areacuadrado();
        cuadrado.perimetrocuadrado();

        // Rectángulo

        Rectangulo rectangulo = new Rectangulo();

        System.out.print("Ingrese la base del rectángulo: ");
        rectangulo.setBase(scanner.nextDouble());
        System.out.print("Ingrese la altura del rectángulo: ");
        rectangulo.setAltura(scanner.nextDouble());

        // Imprimir atributos, área y perímetro del rectángulo
        rectangulo.atributosrectangulo();
        rectangulo.arearectangulo();
        rectangulo.perimetrorectangulo();


        // Círculo
        Circulo circulo = new Circulo();
        System.out.print("Ingresa el radio del círculo: ");
        circulo.setRadio(scanner.nextDouble());

        circulo.radiocirculo();
        circulo.areacirculo();
        circulo.perimetrocirculo();

        // Triángulo
        Triangulo triangulo = new Triangulo();
        System.out.print("Ingresa la base del triángulo: ");
        triangulo.base = scanner.nextDouble();
        System.out.print("Ingresa la altura del triángulo: ");
        triangulo.altura = scanner.nextDouble();


        // Imprimir el radio, área y perímetro del círculo
        triangulo.areatriangulo();
        triangulo.areatriangulo();
        triangulo.perimetrotriangulo();

        // Sumatoria de las áreas de las 4 figuras con método personalizado

        double SumatoriaAreas = cuadrado.calculoAreaCuadrado() + rectangulo.calculoAreaRectangulo() + circulo.calculoAreaCirculo() + triangulo.calculoAreaTriangulo();
        System.out.println("La sumatoria de las áreas de las 4 figuras es: " + SumatoriaAreas);

    }
}