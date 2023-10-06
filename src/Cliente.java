package src;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccionDelCliente = new Direccion();
    private ArrayList<OrdenCompra> ordenCompras = new ArrayList<>();

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    public void addOrdenCompra(OrdenCompra n){
        ordenCompras.add(n);
    }
    public void removeOrdenCompra(OrdenCompra n){
        ordenCompras.remove(n);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\n' +
                ", rut='" + rut + '\n' +
                ", direccionDelCliente=" + direccionDelCliente + '\n' +
                ", ordenCompras=" + ordenCompras.toString() +
                '}';
    }
}
