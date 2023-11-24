package main.java;

public class ClienteEstadoCadastrado extends ClienteEstado {

    private ClienteEstadoCadastrado() {};
    private static ClienteEstadoCadastrado instance = new ClienteEstadoCadastrado();
    public static ClienteEstadoCadastrado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cadastrado";
    }
    
    public boolean aprovar(Cliente cliente) {
        cliente.setEstado(ClienteEstadoAprovado.getInstance());
        return true;
    }
    
    public boolean reprovar(Cliente cliente) {
        cliente.setEstado(ClienteEstadoReprovado.getInstance());
        return true;
    }
    
    public boolean transferir(Cliente cliente) {
        cliente.setEstado(ClienteEstadoTransferido.getInstance());
        return true;
    }

}