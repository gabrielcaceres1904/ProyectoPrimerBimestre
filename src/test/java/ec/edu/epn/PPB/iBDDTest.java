package ec.edu.epn.PPB;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class iBDDTest{

    @Test
    public void given_contraseña_when_is_correct_then_ok(){
        iBDD baseDatos = Mockito.mock(iBDD.class);
        iBDDProcessor procesador = new iBDDProcessor(baseDatos);

        Mockito.when(baseDatos.requestLastPass(Mockito.any())).
                thenReturn(new iBDDResponse(iBDDResponse.BDDStatus.OK));

        assertTrue(procesador.verificarContraseñaAntigua("passAntiguo"));
    }

    @Test
    public void given_contraseña_when_is_not_correct_then_ok(){
        iBDD baseDatos = Mockito.mock(iBDD.class);
        iBDDProcessor procesador = new iBDDProcessor(baseDatos);

        Mockito.when(baseDatos.requestLastPass(Mockito.any())).
                thenReturn(new iBDDResponse(iBDDResponse.BDDStatus.ERROR));

        assertFalse(procesador.verificarContraseñaAntigua("passAntiguo"));
    }

}
