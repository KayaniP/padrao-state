package test;

import org.junit.jupiter.api.Test;

import main.java.Cliente;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    public void testTransicaoEstadoCadastro() {
        Cliente cliente = new Cliente();

        cliente.aprovar();
        assertEquals("Aprovado", cliente.getNomeEstado());

        cliente.reprovar();
        assertEquals("Reprovado", cliente.getNomeEstado());

        cliente.transferir();
        assertEquals("Transferido", cliente.getNomeEstado());

        cliente.falhar();
        assertEquals("Falha", cliente.getNomeEstado());

    }
}
    
