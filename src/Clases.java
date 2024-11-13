
class Persona{
    // Atributos
    String Nombre;
    int Edad;

    // Constructor
    Persona(String nom, int ed){
        Nombre = nom;
        Edad = ed;
    }

    // Metodo
    static void Saludo(String cNombre){
        System.out.println("Hola que tal " + cNombre);
    }


}

public class Clases {
    public static void main(String[] args) {
        Persona oPersona1 = new Persona("Victor",40); //Se entrega argumentos gracias al constructor
        Persona oPersona2 = new Persona("Ana",15);

        //oPersona1.Nombre = "Victor";
        //oPersona1.Edad = 40;


        System.out.println(oPersona1.Nombre + " - " + oPersona2.Nombre);
        Persona.Saludo(oPersona1.Nombre);
    }
}
