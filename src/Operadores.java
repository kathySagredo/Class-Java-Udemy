public class Operadores {
    public static void main(String[] args) {
        // Operadores aritmeticos
        System.out.println("*** Operadores Aritmeticos ***");
        int a = 5, b = 3, resultado;
        resultado = a + b; System.out.println(resultado);
        resultado = a - b; System.out.println(resultado);
        resultado = a * b; System.out.println(resultado);
        resultado = a / b; System.out.println(resultado);
        resultado = a % b; System.out.println(resultado);

        // Operadores unarios
        System.out.println("*** Operadores Unarios ***");
        int c = -2;
        c = -c; // Invierte signo
        System.out.println(c);
        resultado = ++b; // Pre-incremento b = 4
        System.out.println(resultado);
        c = b++; // Post-incremento b = 4 y luego será b = 5
        System.out.println(c);
        System.out.println(b);

        // Operadores de asignación: Asignar valores a variables
        System.out.println("*** Operadores de Asignación ***");
        // Asignación compuesto
        var miNum = 10;
        miNum += 5; // miNum = miNum + 5
        System.out.println("miNum = " + miNum);
        // -=, *=, /=, %=
        miNum *= 2; System.out.println("miNum = " + miNum);
        // Asignación de variables multiples
        int x = 10, y = 15, z = 20;
        System.out.printf("x= %d, y=%d, z=%d", x, y, z);


        // Operadores de comparación
        // System.out.println("*** Operadores de comparación ***");
        // a = 3; b = 2;
        // var resultComparacion = a == b; System.out.println("resultComparacion = " + resultComparacion);
        // resultComparacion = a != b; System.out.println("resultComparacion = " + resultComparacion);
        // >, >=, <=, <

        // Operadores Lógicos
        // System.out.println("*** Operadores AND y OR, ! ***");
        // System.out.println(5 == 5  && 6 == 5); // false
        // System.out.println(5 == 5 || 6 == 5); // true
        // System.out.println(!(5 == 5)); // false

        // Operadores ternarios
        // Condición ? si es true : si es false
        // Variables int m = 5, n = 6;
        // Variable String respuesta;
        // Condicional ternario respuesta = (m > n ? "Es Mayor" : "Es menor");
        // System.out.println(respuesta);

    }
}
