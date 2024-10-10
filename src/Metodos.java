import java.util.Scanner;

public class Metodos {
    // [acceso] [modificador] tipo nombreMetodo ([tipo argumento, [tipo argumento], ...])
    static void Mensaje(String dTexto, String dNombre) {
        System.out.println(dTexto);
        System.out.println(dNombre);
    }
    // Debe retornar un entero
    static int Sumar(int Valor1, int Valor2){
        return Valor1 + Valor2;
    }

    static String EvaluarEdad(int xEdad){
        String cTexto;
        if (xEdad >= 18){
            cTexto = "Eres un adulto";
        } else if (xEdad > 13) {
            cTexto = "Eres un adolescente";
        } else {
            cTexto = "Eres un niño";
        }
        return cTexto;

        }


    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese un mensaje: ");
        var mensaje = consola.nextLine();
        System.out.print("Ingrese un nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Ingrese dos numeros");
        var a = consola.nextInt();
        var b = consola.nextInt();
        Mensaje(mensaje, nombre);
        System.out.println(Sumar(a,b));
        System.out.println(EvaluarEdad(a));

    }
}
