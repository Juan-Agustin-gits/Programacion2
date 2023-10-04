package src;

import java.util.ArrayList;

public class Direccion {
    private String direccion;
    private ArrayList<Cliente> clientes;
    private ArrayList<DocTributario> docTributarios;
    private DocTributario doc;
    public Direccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
