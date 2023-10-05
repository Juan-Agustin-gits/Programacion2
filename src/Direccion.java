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
    public void addCliente(Cliente n){
        clientes.add(n);
    }
    public void removeCliente(Cliente n){
        clientes.remove(n);
    }
    public void addDocTributario(DocTributario n){
        docTributarios.add(n);
    }
    public void removeDocTributarios(DocTributario n){
        docTributarios.remove(n);
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
