package com.mycompany.app;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class UsuarioTest {

    @Test
    public void testGetNome() {
        Usuario usuario = new Usuario("Gabriel", 25);
        assertEquals("Gabriel", usuario.getNome());
    }

    @Test
    public void testGetIdade() {
        Usuario usuario = new Usuario("Gabriel", 25);
        assertEquals(25, usuario.getIdade());
    }
}