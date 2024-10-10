// En esta sección se puede ver los siguientes contenidos:
/* Definición de variables
* Reglas de variables
* Tipos de datos
* Concatenación de cadenas
* Constantes
*/
public class Variables {
    public static void main(String[] args) {
        // Variables => se asigna mediante tipo nombrevariable = valor;
        int edad = 31; boolean disponible = true; // true/false
        char genero;
        genero = 'F'; // Asignación posterior
        System.out.println(edad);
        System.out.println(disponible);
        System.out.println(genero);

        // Reglas de Variables
        String NombreCompleto = "Juan Carlos";
        /* String nombre_cliente = "Juan"; No aplica buenas practicas
        String _apellid = "Perez"; // Correcto y aceptable
        String $apellido = "Juarez"; // Correcto y aceptable
        int totPzs = 10; // No aplica buenas practicas
        boolean casado = true; // Puede mejorar mediante esCasado, utilizar prefijos is o has */


        // Tipos de datos en Java
        // Enteros
        byte tipoByte = 127; System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000; System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647; System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321; System.out.println("tipoLong = " + tipoLong);

        // Punto flotante
        float tipoFloat = 3.14F; // F o f para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315; // D o d para indicar tipo double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        // tipoChar = 65; System.out.println("tipoChar = " + tipoChar); // Tambien imprimirá A
        tipoChar = '@'; System.out.println("tipoChar = " + tipoChar);

        // Booleano
        // boolean tipoBoolean = true; System.out.println("tipoBoolean = " + tipoBoolean);
        // tipoBoolean = false; System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos Object
        // String nombre = null; // Valor por default
        // System.out.println("nombre = " + nombre);
        // nombre = "Juan Perez"; System.out.println("nombre = " + nombre);

        // Ejemplos con var para asignar variable
        // El tipo de dato al utilizar var no puede ser cambiado
        // Al utilizar var no se puede asignar despues el valor y no puede ser null
        var numero = 10; System.out.println("numero = " + numero);

        // Contatenacion de cadenas (se utiliza +)
        System.out.println(NombreCompleto + " tiene " + edad);

        // Sintaxis para definir una constante: final tipo nombreContstante = valor
        final int DIAS_EN_SEMANA = 7; System.out.println("DIAS_EN_SEMANA = " + DIAS_EN_SEMANA);
        final double PI = 3.14159; System.out.println("PI = " + PI);
        // No se puede volver asignar un valor diferente a una variable de tipo final
    }
}
