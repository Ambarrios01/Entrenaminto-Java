package mundopc.servicio;

import mundopc.modelo.Computadora;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private  final int idOrden;
    private  final List<Computadora> computadoras;
    private static int contadorOrdenes;

    public Orden(){
        computadoras = new ArrayList<>();
        this.idOrden = ++contadorOrdenes;
    }

    public void  agregarComputador(Computadora computadora){
        computadoras.add(computadora);


    }

    public void  mostraOrden(){
        System.out.println("Orden #:" + idOrden );
        System.out.println("total Computadora" + computadoras.size());
        System.out.println();
        computadoras.forEach(System.out::println);
    }
}
