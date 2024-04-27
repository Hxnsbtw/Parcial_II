// TiendaDispositivosElectronicos.java
public class TiendaDispositivosElectronicos extends Tienda {
    public TiendaDispositivosElectronicos(String nombreTienda, String tipoDeComercio, double descuento) {
        super(nombreTienda, tipoDeComercio, descuento);
    }

    @Override
    public double calcularDescuento() {
        return descuento * 0.40;
    }
}
