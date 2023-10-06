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
    private DetalleOrden detalle;
    private Cliente cliente;

    public OrdenCompra(Date fecha, String estado, int cantidad) {
        this.fecha = fecha;
        this.estado = estado;
        this.cantidad = cantidad;
    }
    public void addDetalle(int n){
            Detalles.add(new DetalleOrden(n));
            pagos.add(new Pago(n));
    }
    public void removeDetalle(DetalleOrden n, Pago m, DocTributario t){
        Detalles.remove(n);
        pagos.remove(m);
        docTributarios.remove(t);
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
