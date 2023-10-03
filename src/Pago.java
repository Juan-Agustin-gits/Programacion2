package src;

import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;
    protected Efectivo efectivo;
    protected Transferencia transferencia;
    protected Tarjeta tarjeta;
    public Pago(float monto) {
        this.monto = monto;
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

}
