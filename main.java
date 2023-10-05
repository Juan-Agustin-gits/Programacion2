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
        DetalleOrden orden1 = new DetalleOrden(300,Lapiz);
        DetalleOrden orden2 = new DetalleOrden(100, LapizMina);
        DetalleOrden orden3 = new DetalleOrden(100, Goma);



    }
}