
package supermercado.entidad;


public abstract class Producto implements Comparable<Producto>{
    Integer precio;
    String nombre;

    public Producto() {
    }

    public Producto(Integer precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto: " + "Precio:" + precio + ", Nombre:" + nombre + '}';
    }
    

    @Override
    public int compareTo(Producto p) {
       return this.precio.compareTo(p.getPrecio()) ;
    }

    
    

}
