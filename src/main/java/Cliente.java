package main.java;
public class Cliente {
    
    private String nome;
    private ClienteEstado estado;    

    public Cliente() {
        this.estado = ClienteEstadoCadastrado.getInstance();
    }
    
    public void setEstado(ClienteEstado estado) {
        this.estado = estado;
    }
    
    public boolean cadastrar() {
        return estado.cadastrar(this);
    }

    
    public boolean reprovar() {
        return estado.reprovar(this);
    }
    
    public boolean aprovar() {
        return estado.aprovar(this);
    }
    
    public boolean transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ClienteEstado getEstado() {
        return estado;
    }    
}