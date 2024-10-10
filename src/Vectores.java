public class Vectores {
    public static void main(String[] args) {
        // Vectores => conjunto de elementos que se puede almacenar información
        // Para acceder a los elementos se utiliza indices que empieza desde 0
        // tipo_dato [] nombre_variable
        // nombre_variable = new tipo_de_dato[dimensión]
        // tipo_dato [] nombre_variable = new tipo_de_dato[dimensión]
        String [] Nombres = new String[3];
        Nombres[0] = "Victor";
        Nombres[1] = "Carlos";
        Nombres[2] = "Juan";
        for(int i = 0; i <= 2; i++){
            System.out.println(Nombres[i]);
        }

        // Sintaxis simplificada para definir arreglos
        // int[] enteros = {100,200,300,400,500};
        // Si usamos var igual debemos especificar el tipo de dato que se trabajará
        var enteros = new int[]{100,200,300,400,500};
        //for(var i = 0; i < enteros.length;i++){
        for (int entero : enteros) {
            System.out.println(entero);
        }
    }
}
