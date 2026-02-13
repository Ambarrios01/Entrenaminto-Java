import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoDePersona {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Definimos la lista fuera del ciclo While
        List<Persona> personas = new ArrayList<>();
        var salir = false;
        while (!false){
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

   private static void ejecutarOperacion(Scanner sc,List<Persona> personas ){
        var opcion = Integer.parseInt(sc.nextLine());
        var salir = false;

        switch (opcion){
            case  1 -> {
                System.out.println("Ingresa El nombre de la persona: ");
                var nombre = sc.nextLine();
                System.out.println("Ingresa El telefona de la persona(Solos Numero): ");
                var telefono = sc.nextLine();
                System.out.println("Ingresa el Email de la persona(Ejemploa andres@gmail.com): ");
                var email = sc.nextLine();
                //
                var persona = new Persona(nombre, telefono, email);
                //
                personas.add(persona);
                System.out.println("la lista tiene: " + personas.size() + "elementos");
            }
        }//fin de switch
   }
}
