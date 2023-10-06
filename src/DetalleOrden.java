package src;
public class DetalleOrden {
    private Articulo articulo;
    private OrdenCompra orden;
    private int cantidad;
    protected float precioF;

    public DetalleOrden(int cantidad,Articulo articulo){
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    //Metodos de la clase
    public float CalPrecio(){//calcula el precio total de los articulos

        float precioTotal = 0;
        for(int i = 0; i < cantidad; i++) {
            precioTotal+= articulo.getPrecio();
        }
        precioF=precioTotal;
        return precioTotal; //precioTotal seguirá existiendo fuera del método?(pq puede servir después)
    }
    public float CalcPeso(){ // calcula cual es el peso total de todos los articulos
        float PesoTotal = 0;
        float pesoDelArticulo = articulo.getPeso();

        for (int i = 0; i < cantidad; i++) {
            PesoTotal += pesoDelArticulo;
        }
        return PesoTotal;
    }
    public float CalcIVA(){ // IVA que seria el 19% del precio

        return (precioF * 19 )/100;
        //creo que es el iva total por lo que podríamos usar precioTotal
    }
    public float CalcPrecioSinIVA(){
        float precioSinIva = 0;
        precioSinIva = precioF - CalcIVA();


        return precioSinIva;
    }

    @Override
    public String toString() {
        return "DetalleOrden{" +
                "articulo=" + articulo.toString() +
                ", orden=" + orden +
                ", cantidad=" + cantidad +
                ", precioF=" + precioF +
                '}';
    }
}
