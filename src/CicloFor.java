public class CicloFor {
    public static void main(String[] args) {
        System.out.println("*** Ciclo For ***");
        // for(inicialización; condición; actualización)
        for(var i = 1; i <= 3; i++){
            System.out.print(i);
        }

        // Uso de break y continue
        // Ejemplo break, imprimir solo el primer número par
        for(var numero = 1; numero < 10; numero++){
            if(numero % 2 == 0){
                System.out.print(numero + " ");
                break;
            }
        }
        // Ejemplo continue, imprimir solo numero pares
        for(var numero = 1; numero < 10; numero++){
            if(numero % 2 == 1){
                continue; //Saltamos a la siguiente iteración
            }
            System.out.print(numero + " ");
        }

    }
}

