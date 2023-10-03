package src;
public class Efectivo {
    private float monto;

    public Efectivo(float monto) {
        this.monto = monto;
    }
    public float CalcDevolucion( float precio){
        float vuelto = monto - precio;// falta hacer el caso cuando el monto es menor al precio
        if(precio == monto){
            return 0;
        }
        return vuelto;
    }
}
