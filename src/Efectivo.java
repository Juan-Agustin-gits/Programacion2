package src;

import java.util.Date;

public class Efectivo extends Pago{
    private float monto;
    private Date fecha;
    public Efectivo(float monto, Date fecha) { //posible cambio
        super(monto,fecha);
        this.monto = monto;
        this.fecha = fecha;
    }
    public float CalcDevolucion(float precio, int cantidad){
        float vuelto = monto - precio*cantidad;// falta hacer el caso cuando el monto es menor al precio
        if(precio == monto){
            return 0;
        }
        return vuelto;
    }

    @Override
    public String toString() {
        return "Efectivo{" +
                "monto=" + monto +
                '}';
    }
}
