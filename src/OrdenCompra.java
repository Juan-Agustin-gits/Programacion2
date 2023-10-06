package src;
import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> Detalles = new ArrayList<>();
    private ArrayList<DocTributario> docTributarios = new ArrayList<>();
    private ArrayList<Pago> pagos;
    private float precioFinal;
    private float pesoTotal;
    public OrdenCompra(Date fecha, String estado) {
        this.fecha = fecha;
        this.estado = estado;
    }
    public void CalcPrecio(){
        precioFinal = 0;
        for(int i = 0; i < Detalles.size(); i++) {
            precioFinal += Detalles.get(i).precioF;
        }
    }
    public float CalcIVA(){
        return (precioFinal*19)/100;
    }
    public float CalcPrecioSinIva(){
        return precioFinal-CalcIVA();
    }
    public float CalcPeso(){
        pesoTotal = 0;
        for (int i = 0; i < Detalles.size(); i++) {
            pesoTotal += Detalles.get(i).CalcPeso();
        }
        return pesoTotal;
    }
    public void addDetalle(DetalleOrden n){
            Detalles.add(n);
    }
    public void removeDetalle(DetalleOrden n){
        Detalles.remove(n);
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

    public float getPrecioFinal() {
        return precioFinal;
    }

    @Override
    public String toString() {
        return "OrdenCompra{" +
                "fecha=" + fecha +
                ", estado='" + estado + '\'' +
                ", Detalles=" + Detalles.toString() +
                ", docTributarios=" + docTributarios.toString() +
                ", pagos=" + pagos.toString() +
                ", precioFinal=" + precioFinal +
                ", pesoTotal=" + pesoTotal +
                '}';
    }
}
