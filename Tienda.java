// Tienda.java
public abstract class Tienda implements DescuentoCalculable {
    protected String nombreTienda;
    protected String tipoDeComercio;
    protected static double descuento;

    public Tienda(String nombreTienda, String tipoDeComercio, double descuento) {
        this.nombreTienda = nombreTienda;
        this.tipoDeComercio = tipoDeComercio;
        this.descuento = descuento;
    }

    public void imprimirDetallesTiendas() {
        System.out.println("Nombre de la tienda: " + nombreTienda);
        System.out.println("Tipo de comercio: " + tipoDeComercio);
        System.out.println("Descuento: " + descuento);
    }
}
