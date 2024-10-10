public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Matias";
        var edad = 35;
        var salario = 210000.5;
        var numeroEmpleado = 12;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);
        // El %n es para agregar un salto de linea

        // Formateo con text block
        // \s espacio \t tabular
        // %04d indica 4 digitos
        mensaje = """
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tEdad: %d
                \tSalario: $%.2f
                \tNo. Empleado: %04d
                """.formatted(nombre, edad, salario, numeroEmpleado);
        System.out.println(mensaje);

        System.out.printf("""
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tEdad: %d
                \tSalario: $%.2f
                \tNo. Empleado: %04d
                """, nombre, edad, salario, numeroEmpleado);

    }
}
