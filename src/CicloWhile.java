public class CicloWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo while ***");
        var contador = 1;
        while (contador <= 5) { // Condición
            System.out.println(contador++); // Bloque de instrucción
            // Evitar ciclos infinitos contador++
        }
        System.out.println("*** Ciclo do-while ***");
        var i = 1;
        do { // Bloque de instrucción
            System.out.println(i);
            i++;
        } while (i <= 3); // Condición: Imprime y luego evalua la condición
    }
}
