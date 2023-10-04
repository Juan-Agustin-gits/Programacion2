package src;
import java.util.Date;

public class DocTributario {
    private OrdenCompra Orden;
    private String numero;
    private String rut;
    private Date fecha;
    protected Boleta boleta;
    protected Factura factura;

    public DocTributario(String numero, String rut, Date fecha) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "DocTributario{" +
                "numero='" + numero + '\'' +
                ", rut='" + rut + '\'' +
                ", fecha=" + fecha +
                ", boleta=" + boleta.toString() +
                ", factura=" + factura.toString() +
                '}';
    }
}
