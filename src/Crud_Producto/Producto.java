package Crud_Producto;

public class Producto {
    private String nombre;
    private String idProducto;
    private String Descripcion;
    private String Cantidad;

    public Producto(String nombre, String idProducto, String descripcion, String cantidad) {
        this.nombre = nombre;
        this.idProducto = idProducto;
        this.Descripcion = descripcion;
        this.Cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto {" +
            ", nombre= '" + nombre + '\'' +
                ", Idproducto= '" + Descripcion + '\'' +
                ", Descripcion= '" + idProducto + '\'' +
                ", Cantidad= ," + Cantidad + '\'' +
            '}';
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String cantidad) {
        Cantidad = cantidad;
    }
}

