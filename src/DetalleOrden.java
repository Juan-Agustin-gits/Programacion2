package src;
public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    private OrdenCompra orden;
    private float precio = articulo.getPrecio();

    public DetalleOrden(int cantidad) {
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
            precioTotal+= precio;
        }
        return precioTotal;
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
        return (articulo.getPrecio() * 19 )/100;
    }
    public float CalcPrecioSinIVA(){
        float precioSinIva = 0;

        for (int i = 0; i < cantidad; i++) {
            precioSinIva += CalcIVA() ;
        }

        return precioSinIva;
    }

}
