import src.*;
import java.util.Date;

public class main {
    public static void main(String[] args){
        // Direccion
        Direccion direccion1 = new Direccion("Biblioteca Central");
        //clientes
        Cliente cliente1 = new Cliente("Tomas", "12345678-k");
        // Fechas
        Date fecha1 = new Date(2012,12,12);
        //creacion de los articulos
        Articulo Lapiz = new Articulo(200,"Lapiz Pasta", "Descripcion1",1000);
        Articulo LapizMina = new Articulo(300,"Lapiz Mina", "Descripcion2",900);
        Articulo Goma = new Articulo(200,"Goma", "Descripcion3",500);
        //creacion de los detalles
        DetalleOrden D1 = new DetalleOrden(300,Lapiz);
        Lapiz.addDetalleOrden(D1);
        DetalleOrden D2 = new DetalleOrden(100, LapizMina);
        LapizMina.addDetalleOrden(D2);
        DetalleOrden D3 = new DetalleOrden(100, Goma);
        Goma.addDetalleOrden(D3);
        // Orden de compra
        OrdenCompra orden1 = new OrdenCompra(fecha1,"comprado");
        orden1.addDetalle(D1);
        orden1.addDetalle(D2);
        orden1.addDetalle(D3);

        System.out.println(cliente1.toString());



    }
}