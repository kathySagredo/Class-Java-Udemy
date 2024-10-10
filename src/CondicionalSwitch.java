import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa el no. de día de la semana: ");
        int nDia = consola.nextInt();
        String cResultado;

        switch (nDia){
            case 1:
                cResultado = "Lunes";
                break;
            case 2:
                cResultado = "Martes";
                break;
            case 3:
                cResultado = "Miercoles";
                break;
            case 4:
                cResultado = "Jueves";
                break;
            case 5:
                cResultado = "Viernes";
                break;
            case 6:
                cResultado = "Sabado";
                break;
            case 7:
                cResultado = "Domingo";
                break;
            default:
                cResultado = "no. de la semana ingresado no valido";

        }
        System.out.println(cResultado);
    }
}
