package main.java;

public class ClienteEstadoReprovado {
    
    private ClienteEstadoReprovado() {};
    private static ClienteEstadoReprovado instance = new ClienteEstadoReprovado();
    public static ClienteEstadoReprovado getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Reprovado";
    }


}
