

package supermercado.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import supermercado.entidad.Bebida;
import supermercado.entidad.Fruta;
import supermercado.entidad.Higiene;
import supermercado.entidad.Producto;

public class ServiciosSM {
    List<Producto>lista=new ArrayList();
    public ArrayList llenarLista(){
        
        lista.add(new Bebida("1.5",20,"Coca-Cola Zero"));
        lista.add(new Bebida("1.5",18,"Coca-Cola"));
        lista.add(new Higiene("500",19,"Shampoo Sedal"));
        lista.add(new Fruta("kilo",64,"Frutillas"));
        for (Producto aux : lista) {
            System.out.println(aux);
        }
        System.out.println("=============================");
        return (ArrayList)lista;
    }
    
    public void imprimirLista(){
        llenarLista();
        Collections.sort(lista);
        System.out.println("Producto mas caro: "+Collections.max(lista).getNombre());
        System.out.println("Producto mas barato: "+Collections.min(lista).getNombre());
    }
    
    
    
    
    
    
}
