

package supermercado.entidad;

public class Bebida extends Producto{
    String litros;

    public Bebida() {
    }

    
    public Bebida(String litros) {
        this.litros = litros;
    }

    public Bebida(String litros, Integer precio, String nombre) {
        super(precio, nombre);
        this.litros = litros;
    }

    public String getLitros() {
        return litros;
    }

    public void setLitros(String litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" /// Litros: "+litros+" /// Precio: $"+precio;
    }
    
    
    

}
