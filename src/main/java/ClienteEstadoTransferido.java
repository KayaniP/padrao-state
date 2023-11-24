package main.java;

public class ClienteEstadoTransferido {

    private ClienteEstadoTransferido() {};
    private static ClienteEstadoTransferido instance = new ClienteEstadoTransferido();
    public static ClienteEstadoTransferido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferido";
    }

}

