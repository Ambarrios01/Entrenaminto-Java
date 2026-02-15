import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoDePersona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Definimos la lista fuera del ciclo While
        List<Persona> personas = new ArrayList<>();
        var salir = false;
        while (!salir){
            mostrarMenu();
            try {
                salir = ejecutarOperacion(sc, personas);
            }catch (Exception e){
                System.out.println("Ocurio Un ERROR: " + e.getMessage());
            }

            System.out.println();
        }
    }

   private static void mostrarMenu(){
       System.out.print("""
               **** MENU ****
               1. Agrega Personal A lista 
               2. listar
               3. Salir
               """);
       System.out.println("Elige Una Opcion: ");

   }

   private static boolean ejecutarOperacion(Scanner sc,List<Persona> personas ){
        var opcion = Integer.parseInt(sc.nextLine());
        var salir = false;

        switch (opcion){
            case  1 -> {
                personas.add(crearPersona(sc));
                System.out.println("La lista tiene: " + personas.size() + " elementos");
               /* (Asi se simplifica de una mejor forma
               este codigo tan extenso)
                System.out.print("Ingresa El nombre de la persona: ");
                var nombre = sc.nextLine();
                System.out.print("Ingresa El telefona de la persona(Solos Numero): ");
                var telefono = sc.nextLine();
                System.out.print("Ingresa el Email de la persona(Ejemploa andres@gmail.com): ");
                var email = sc.nextLine();
                //crear el objeto persona
                var persona = new Persona(nombre, telefono, email);
                // lo agregamos en la lista
                personas.add(persona);
                System.out.println("la lista tiene:  " +  personas.size() + " elementos");

               *  */            }// fin case 1
            case 2 ->{
                System.out.println("listado de Personas:");
                // Usando Lamba
                //personas.forEach((persona -> System.out.println(persona)));
                //metodo de referencias
                personas.forEach(System.out::println);
            }// fin case 2
            case 3 -> {
                System.out.println("Hasta pronto");
                salir = true;
            }
            default -> System.out.println("opcion errada: "+ opcion);
        }//fin de switch
       return salir;
   }

   //Una mejor forma de crear el dato de persona

    private static Persona crearPersona(Scanner sc ) {
        System.out.print("Proporciona el nombre: ");
        var nombre = sc.nextLine();
        System.out.print("Proporciona el telefono(solo numeros): ");
        var tel = sc.nextLine();
        System.out.print("Proporciona el email(andres@gmail.com: ");
        var email = sc.nextLine();
        return new Persona(nombre, tel, email);
    }
}
