package src;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccionDelCliente;
    private ArrayList<OrdenCompra> ordenCompras;
    private OrdenCompra orden;

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

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                '}';
    }
}
