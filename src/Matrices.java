public class Matrices {
    public static void main(String[] args) {
        // Definimos una matriz
        // int[][] matriz = new int[2][3];
        var matriz = new int[2][3];
        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;

        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        final var RENGLONES = 2; // matriz.length
        final var COLUMNAS = 3; // matriz[ren].length

        // Recorrer una matriz
        for(var ren = 0; ren < RENGLONES; ren++){
            for(var col = 0; col < COLUMNAS; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }

        // Sintaxis simplificada
        var matriz1 = new int[][]{{100,200,300},{400,500,600}};
        System.out.println(matriz1[0][2]);

    }
}
