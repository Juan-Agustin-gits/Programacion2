package src;
import java.util.Date;
public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    private float monto;
    private Date fecha;

    public Transferencia(String banco, String numCuenta, float monto, Date fecha) {
        super(monto, fecha);
        this.monto = monto;
        this.fecha = fecha;
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Transferencia{" +
                "banco='" + banco + '\'' +
                ", numCuenta='" + numCuenta + '\'' +
                '}';
    }
}
