
class Persona{
    // Atributos
    String Nombre;
    int Edad;

    // Metodo
    static void Saludo(String cNombre){
        System.out.println("Hola que tal " + cNombre);
    }


}

public class Clases {
    public static void main(String[] args) {
        Persona oPersona1 = new Persona();
        Persona oPersona2 = new Persona();

        oPersona1.Nombre = "Victor";
        oPersona1.Edad = 40;
        oPersona2.Nombre = "Ana";
        oPersona2.Edad = 15;

        System.out.println(oPersona1.Nombre + " - " + oPersona2.Nombre);
        Persona.Saludo(oPersona1.Nombre);
    }
}
