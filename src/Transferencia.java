package src;
public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;

    public Transferencia(String banco, String numCuenta) {
        super();
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
