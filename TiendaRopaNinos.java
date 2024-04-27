// TiendaRopaNinos.java
public class TiendaRopaNinos extends Tienda {
    public TiendaRopaNinos(String nombreTienda, String tipoDeComercio, double descuento) {
        super(nombreTienda, tipoDeComercio, descuento);
    }

    @Override
    public double calcularDescuento() {
        return descuento * 0.80;
    }
}
