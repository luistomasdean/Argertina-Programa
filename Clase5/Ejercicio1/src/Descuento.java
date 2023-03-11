public class Descuento {
    protected double monto;

    public Descuento(double monto) {
        this.monto = monto;
    }

    public double calcularDescuento(double precio) {
        return precio * monto;
    }
}