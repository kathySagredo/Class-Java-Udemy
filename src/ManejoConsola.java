import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        // Introducir valores por consola
        var consola = new Scanner(System.in);

        // Leer distintos tipos de datos
        System.out.print("Ingresa tu edad: "); // Diferencia entre println y print, sin salto de linea
        var edad = consola.nextInt(); // tipo entero
        System.out.println("edad = " + edad);
        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble(); // Se espera con ,
        System.out.println("altura = " + altura);
        consola.nextLine();
        System.out.print("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversion de datos
        System.out.print("Proporciona un valor entero: ");
        // Codigo var enteroString = consola.nextLine();
        // var entero = Integer.parseInt(enteroString);

        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        // Tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine()); // Se espera con .
        System.out.println("flotante = " + flotante);


    }
}
