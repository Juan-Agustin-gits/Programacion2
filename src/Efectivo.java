package src;
public class Efectivo extends Pago{
    private float monto;

    public Efectivo(float monto) { //posible cambio
        super(monto);
        this.monto = monto;
    }
    public float CalcDevolucion(float precio){
        float vuelto = monto - precio;// falta hacer el caso cuando el monto es menor al precio
        if(precio == monto){
            return 0;
        }
        return vuelto;
    }
}
