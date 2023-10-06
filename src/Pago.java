package src;

import java.util.Date;

public class Pago{
    private float monto;
    private Date fecha;
    protected Efectivo efectivo;
    protected Transferencia transferencia;
    private OrdenCompra ordenCompra;
    protected Tarjeta tarjeta;
    public Pago(float monto, Date fecha) { //posible cambio
        this.monto = monto;
        this.fecha = fecha;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }//por si más adelante queremos cambiar el pago

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }//por si más adelante queremos cambiar la fecha de pago

    public float getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "monto=" + monto +
                ", fecha=" + fecha +
                ", efectivo=" + efectivo.toString() +
                ", transferencia=" + transferencia.toString() +
                ", ordenCompra=" + ordenCompra +
                ", tarjeta=" + tarjeta.toString() +
                '}';
    }
}
