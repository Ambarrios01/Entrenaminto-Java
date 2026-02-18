package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentadComputadoraApp {
    public static void main(String[] args) {
        //creamos un  raton
        Raton RatonLenovo = new Raton("tipo c", "Lenovo");
       // System.out.println(RatonLenovo);
        // creamos un  teclado
        Teclado TecladoMecanico = new Teclado("Tipo c", "Apple");
        //System.out.println(TecladoMecanico);
        // creamos un Monitor
        Monitor MonitorLenovo = new Monitor("Lenovo", 20);
       // System.out.println(MonitorLenovo);

        //creamos una Computadora
        Computadora computadoraLenovo =
                new Computadora("Comptadora Lenovo", MonitorLenovo, TecladoMecanico, RatonLenovo);
        System.out.println(computadoraLenovo);



        //creamos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputador(computadoraLenovo);
        orden1.mostraOrden();
    }
}