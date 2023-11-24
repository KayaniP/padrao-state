package main.java;

public class ClienteEstadoAprovado {
    
    private ClienteEstadoAprovado() {};
    private static ClienteEstadoAprovado instance = new ClienteEstadoAprovado();
    public static ClienteEstadoAprovado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aprovado";
    }
}
