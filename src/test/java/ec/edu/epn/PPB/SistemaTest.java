package ec.edu.epn.PPB;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SistemaTest {

    private Sistema sistema = new Sistema();

    private Usuario u1 = new Usuario("GabrielC", "1723485114");
    private Usuario u2 = new Usuario("AlexisT", "1726503103");
    private Usuario u3 = new Usuario("JustinY", "1004438956");

    @Test
    public void
    given_two_string_when_login_then_ok() {
        System.out.print("Test Usuario #1");
        int login1 = sistema.login(u1, "GabrielC", "1723485114" );
        assertTrue("Error en credenciales", login1 == 1);

        System.out.print("\nTest Usuario #2");
        int login2 = sistema.login(u2, "AlexisT", "1726503103" );
        assertTrue("Error en credenciales", login2 == 1);

        System.out.print("\nTest Usuario #3");
        int login3 = sistema.login(u3, "JustinY", "1004438956" );
        assertTrue("Error en credenciales", login3 == 1);
    }

}
