package src;
import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private int cantidad;
    private ArrayList<DetalleOrden> Detalles;
    private ArrayList<DocTributario> docTributarios;
    private ArrayList<Pago> pagos;
    public OrdenCompra(Date fecha, String estado, ArrayList<DetalleOrden> detalles) {
        this.fecha = fecha;
        this.estado = estado;
        Detalles = detalles;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
