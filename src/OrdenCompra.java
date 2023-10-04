package src;

import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private int cantidad;
    private DetalleOrden detalle;
    private Cliente cliente;

    public OrdenCompra(Date fecha, String estado, int cantidad) {
        this.fecha = fecha;
        this.estado = estado;
        this.cantidad = cantidad;
        detalle = new DetalleOrden(cantidad);
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
