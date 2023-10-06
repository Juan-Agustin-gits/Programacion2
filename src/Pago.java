package src;

import java.util.Date;

public class Pago{
    private float monto;
    private Date fecha;
    protected Efectivo efectivo;
    protected Transferencia transferencia;
    private OrdenCompra ordenCompra;
    protected Tarjeta tarjeta;
    public Pago(float monto) { //posible cambio
        this.monto = monto;
    }

    public Pago() {//intelij me propuso otro constructor (que servirá para tarjeta y transferencia)

    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

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
