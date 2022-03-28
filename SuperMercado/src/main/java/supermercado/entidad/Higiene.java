

package supermercado.entidad;


public class Higiene extends Producto{
        
    String contenido;

    public Higiene() {
    }

    public Higiene(String contenido) {
        this.contenido = contenido;
    }

    public Higiene(String contenido, Integer precio, String nombre) {
        super(precio, nombre);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" /// Contenido: "+contenido+"ml /// Precio: $"+precio;
    }
    
    
}
