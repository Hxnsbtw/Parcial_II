// CentroComercial.java
public class CentroComercial {
    public static void main(String[] args) {
        Tienda tienda1 = new TiendaRopaNinos("KIDS", "Ropa de niños", 12.0);
        Tienda tienda2 = new TiendaDispositivosElectronicos("ALKOSTO", "Dispositivos electrónicos", 13.0);
        Tienda tienda3 = new TiendaDeportiva("Tienda C", "DETLATHON", 14.0);

        imprimirDetalles(tienda1);
        imprimirDetalles(tienda2);
        imprimirDetalles(tienda3);
    }

    public static void imprimirDetalles(Tienda tienda) {
        System.out.println("Nombre de la tienda: " + tienda.nombreTienda);
        System.out.println("Tipo de comercio: " + tienda.tipoDeComercio);

        double descuento = tienda.calcularDescuento();
        System.out.println("Descuento: " + descuento);
    }
}
