// En esta sección se puede ver los siguientes contenidos:
/* Definición de variables
* Reglas de variables
* Tipos de datos
* Concatenación de cadenas
* Indices de una cadena y comparación de cadenas
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
        // Concat
        var cad1 = "hola"; var cad2 = "mundo";
        var cad3 = cad1.concat(" ").concat("mundo");
        System.out.println("cad3 = " + cad3);
        // Stringbuilder
        var constructorDeCadenas = new StringBuilder();
        constructorDeCadenas.append(cad1);
        constructorDeCadenas.append(" ");
        constructorDeCadenas.append(cad2);
        System.out.println("constructorDeCadenas = " + constructorDeCadenas);
        // Stringbuffer
        var stringBuffer = new StringBuffer(); // Para trabajar con varios hilos a la vez
        stringBuffer.append(cad1).append(" ").append(cad2);
        System.out.println("stringBuffer = " + stringBuffer);
        // Join
        var resultado = String.join(" ", cad1, cad2, "adios");
        System.out.println("resultado = " + resultado);

        // Para cadenas de multiples lineas se utiliza tres comillas """ text block """
        // Recuerda que las cadenas son inmutables en JAVA

        // Indices de una cadena
        var cadena1 = "Hola Mundo";
        var primerCaracter = cadena1.charAt(0); // Recupera el primer caracter
        System.out.println("primerCaracter = " + primerCaracter);
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        cadena1 = "Adios Mundo"; // Cadenas son inmutables, se crea una nuevo objeto de tipo cadena con ese valor.

        // Comparación de cadenas
        var cadena2 = "Java";
        var cadena3 = "Java"; // Basicamente ambas cadenas apuntan al mismo objeto, Java reconoce el valor.
        // System.out.println(cadena2 == cadena3); true
        // Esto no funciona si se asigna a la variable de la siguiente forma: var cadena4 = new String("Java")
        // Pero si funcionaría con el metodo equals.

        // Sintaxis para definir una constante: final tipo nombreContstante = valor
        final int DIAS_EN_SEMANA = 7; System.out.println("DIAS_EN_SEMANA = " + DIAS_EN_SEMANA);
        final double PI = 3.14159; System.out.println("PI = " + PI);
        // No se puede volver asignar un valor diferente a una variable de tipo final
    }
}
