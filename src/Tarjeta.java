package src;
import java.util.Date;
public class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;
    private float monto;
    private Date fecha;

    public Tarjeta(String tipo, String numTransaccion, float monto, Date fecha) {
        super(monto, fecha);
        this.monto = monto;
        this.fecha = fecha;
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }

    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "tipo='" + tipo + '\'' +
                ", numTransaccion='" + numTransaccion + '\'' +
                '}';
    }
}
