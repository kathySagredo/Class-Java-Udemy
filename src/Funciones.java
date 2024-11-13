public class Funciones {
    static void saludar(String mensaje){
        // void indica retorno vacío
        // static que esta asociado a la clase funciones
        // public indica que puede ser utilizado fuera del archivo.
        // En este caso estas funciones no requieren definir modo public
        System.out.println("mensaje: "+mensaje);
    }
    static int sumar(int a, int b){
        // int retorna un entero
        var resultado = a + b;
        return resultado;
    }

    public static void main(String[] args) {
        saludar("Hola mundo");
        saludar("Hola, otro mensaje");
        var resultado_funcion = sumar(2,3);
        System.out.println("resultado = " + resultado_funcion);
    }
}
