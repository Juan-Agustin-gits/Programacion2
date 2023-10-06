import src.*;
import java.util.Date;
public class newmain {
    public static void main(String[] args){
        //Clientes
        Cliente juan= new Cliente("Juan","98765432-k" );
        Cliente tomy= new Cliente("Tomás","12345678-k");
        //Dirección
        Direccion Casa = new Direccion("Udec");
        //Fechas
        Date Fecha1 = new Date(2023, 10,12);
        Date Fecha2 = new Date(2023, 11,13);
        Date Fecha3 = new Date(2023, 12,14);

        //Articulos
        Articulo celular = new Articulo(2,"SmartPhone","Des1",200);
        Articulo laptop = new Articulo(12,"Computador", "Des2", 800);
        Articulo cargador = new Articulo(1,"Cargador", "Des3", 20);
        Articulo libro = new Articulo(10,"Libro", "Des4", 80);
        Articulo lapiz = new Articulo(1,"Lápiz","Des5",10);
        //Detalles de compra
        DetalleOrden Compra1 = new DetalleOrden(2, libro);
        DetalleOrden Compra2 = new DetalleOrden(1, lapiz);
        DetalleOrden Compra3 = new DetalleOrden(2, celular);
        DetalleOrden Compra4 = new DetalleOrden(2, cargador);
        DetalleOrden Compra5 = new DetalleOrden(1, laptop);
        //Ordenes de compra
        OrdenCompra Orden1 = new OrdenCompra(Fecha1,"Comprado");
        OrdenCompra Orden2 = new OrdenCompra(Fecha2,"Comprado");
        OrdenCompra Orden3 = new OrdenCompra(Fecha3,"Comprado");
        //Lo que hay en cada compra
        Orden1.addDetalle(Compra1);
        Orden1.addDetalle(Compra2);
        Orden2.addDetalle(Compra3);
        Orden2.addDetalle(Compra4);
        Orden3.addDetalle(Compra5);
        //Pagos y el tipo
        //Fecha tiene que "coinsidir" manualmente
        Tarjeta parauncelular = new Tarjeta("parauncelular", "0001", celular.getPrecio(), Fecha3);
        Efectivo paraunlapiz = new Efectivo(lapiz.getPrecio(), Fecha1);
        Efectivo paraunlibro = new Efectivo(libro.getPrecio(), Fecha1);
        Transferencia paraunalaptop = new Transferencia("BancoEstado","1111", laptop.getPrecio(), Fecha2);
        Transferencia parauncargador = new Transferencia("BancoEstado","2222", cargador.getPrecio(),Fecha2);
        //Relacionamos los pagos con las ordenes
        Orden1.addPago(paraunlibro);
        Orden1.addPago(paraunlibro);
        Orden1.addPago(paraunlapiz);
        Orden2.addPago(parauncelular);
        Orden2.addPago(parauncelular);
        Orden2.addPago(parauncargador);
        Orden2.addPago(parauncargador);
        Orden3.addPago(paraunalaptop); //se puede agilizar esta parte con un for por cada elemento del mismo tipo comprado

    }
}
