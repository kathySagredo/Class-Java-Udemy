public class MetodosCadenas {
    public static void main(String[] args) {
        // Metodo de cadenas
        var cadena1 = "Hola mundo";

        // Obtener el largo de una candena
        var longitud = cadena1.length(); System.out.println("longitud = " + longitud);
        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o','a'); System.out.println("nuevaCadena = " + nuevaCadena);
        // Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase(); System.out.println("mayusculas = " + mayusculas);
        // Convertir a minusculas
        System.out.println("minusculas = " + cadena1.toLowerCase());
        // Eliminar espacios al inicio y al final
        var cadena2 = " Leo Reyes  ";
        System.out.println("cadena2 = " + cadena2.trim());
        // Tema de subcadenas
        var cadena = "Hola Mundo";
        var subcadena = cadena.substring(0,4);
        System.out.println("subcadena = " + subcadena);
        var subcadena2 = cadena.substring(5); // (5,10)

        // Buscar subcadenas
        var indice1 = cadena.indexOf("hola");
        System.out.println("indice1 = " + indice1);
        var indice2 = cadena.lastIndexOf("mundo"); // Devuelve el indice de la ultima aparición de la subcadena
        // Subcadena no encontrada devuelve -1

        // Remplazar subcadenas
        var nuevaCadena2 = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena2 = " + nuevaCadena2);

    }
}
