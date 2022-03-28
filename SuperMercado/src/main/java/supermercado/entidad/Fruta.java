

package supermercado.entidad;

public class Fruta extends Producto{
 String UDV;

    public Fruta() {
    }

    public Fruta(String UDV) {
        this.UDV = UDV;
    }

    public Fruta(String UDV, Integer precio, String nombre) {
        super(precio, nombre);
        this.UDV = UDV;
    }

    public String getUDV() {
        return UDV;
    }

    public void setUDV(String UDV) {
        this.UDV = UDV;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" /// Precio: $"+precio+" /// Unidad de venta: "+UDV;
    }
    
    
}