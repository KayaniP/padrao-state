package main.java;


public abstract class ClienteEstado {

    public abstract String getEstado();

    public boolean cadastrar(Cliente cliente) {
        return false;
    }

    public boolean aprovar(Cliente cliente) {
        return false;
    }

    public boolean reprovar(Cliente cliente) {
        return false;
    }

    public boolean transferir(Cliente cliente) {
        return false;
    }
    
}
