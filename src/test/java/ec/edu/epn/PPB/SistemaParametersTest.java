package ec.edu.epn.PPB;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class SistemaParametersTest {

    private Sistema sistema = new Sistema();

    private String tipoMembresia;
    private int expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{"Anual", 365});
        objects.add(new Object[]{"Mensual",30});
        objects.add(new Object[]{"Semanal",5});
        objects.add(new Object[]{"Diario",1});
        objects.add(new Object[]{"Semanal",5});
        objects.add(new Object[]{"Anual", 365});
        objects.add(new Object[]{"Diario",1});
        objects.add(new Object[]{"Mensual",30});
        return objects;
    }

    public SistemaParametersTest(String tipoMembresia, int membresia) {
        this.tipoMembresia = tipoMembresia;
        this.expected = membresia;
    }

    @Test
    public void
    given_two_string_when_asignarMembresia_then_ok() {
        int membresia = sistema.asignarMembresia(tipoMembresia);
        assertTrue("Error al asignar membresías", membresia == expected);
    }



}

