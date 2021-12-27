package ec.edu.epn.PPB;

import org.junit.*;

import static org.junit.Assert.*;

public class UsuarioTest {

    Usuario u;

    @BeforeClass
    public static void setupClass(){
        System.out.println("setUpClass()");
    }


    @Before
    public void setUp(){
        System.out.println("setUp()");
        u=new Usuario();
    }

    @Test
    public void given_usuario_when_datos_is_valido_then_ok(){
        String nombre ="Gabriel";
        String apellido="Caceres";
        int edad=24;
        String direccion="Calderon";
        String cedula="1723485114" ;
        String nombreUsuario="User1";
        String contrasena="12345";
        System.out.println("Test 1");
        assertEquals(1,u.validarDatos(nombre,apellido,edad,direccion,cedula,nombreUsuario,contrasena));
    }

    @Test
    public void given_usuario_when_edad_is_invalida_then_ok(){
        String nombre ="Gabriel";
        String apellido="Caceres";
        int edad=00;
        String direccion="Calderon";
        String cedula="1723485114" ;
        String nombreUsuario="User1";
        String contrasena="12345";
        System.out.println("Test 2");
        assertEquals(0,u.validarDatos(nombre,apellido,edad,direccion,cedula,nombreUsuario,contrasena));
    }

    @Test
    public void given_usuario_when_cedula_is_invalida_then_ok(){
        String nombre ="Gabriel";
        String apellido="Caceres";
        int edad=24;
        String direccion="Calderon";
        String cedula="1111111111" ;
        String nombreUsuario="User1";
        String contrasena="12345";
        System.out.println("Test 3");
        assertEquals(0,u.validarDatos(nombre,apellido,edad,direccion,cedula,nombreUsuario,contrasena));
    }

    @Test
    public void given_usuario_when_nombre_is_vacio_then_ok(){
        String nombre ="";
        String apellido="Caceres";
        int edad=24;
        String direccion="Calderon";
        String cedula="1111111111" ;
        String nombreUsuario="User1";
        String contrasena="12345";
        System.out.println("Test 4");
        assertEquals(0,u.validarDatos(nombre,apellido,edad,direccion,cedula,nombreUsuario,contrasena));
    }


    @After
    public void tearDown(){
        System.out.println("tearDown()");
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass");
    }

}