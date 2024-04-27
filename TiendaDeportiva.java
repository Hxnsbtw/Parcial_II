// NuevaTienda.java
public class TiendaDeportiva extends Tienda {
    public TiendaDeportiva(String nombreTienda, String tipoDeComercio, double descuento) {
        super(nombreTienda, tipoDeComercio, descuento);
    }

    @Override
    public double calcularDescuento() {
        return descuento * 0.60; // Se establece un descuento arbitrario para este nuevo tipo de comercio
    }
}
