package ec.edu.epn.PPB;

public class Sistema {

    private Usuario user;

    public void registrarUsuario(String nombre,String apellido,int edad,String direccion,String cedula,String nmUsuario,String contrasena){
        user = new Usuario(nombre,apellido,edad,direccion,cedula,nmUsuario,contrasena);
        System.out.println("** Registro Exitoso **");
    }

    public int asignarMembresia(String tipoMembresia){
        switch (tipoMembresia){
            case "Anual":
                return 365;
            case "Mensual":
                return 30;
            case "Semanal":
                return 5;
            case "Diario":
                return 1;
        }
        return 0;
    }

    public int login(Usuario user, String nmUsuario, String contrasena){
        boolean usuario = nmUsuario.equals(user.getNombreUsuario());
        boolean pass = contrasena.equals(user.getContrasena());
        if(usuario && pass)
        {
            System.out.println("\nBienvenido "+nmUsuario+" !");
            return 1;
        }else{
            System.out.println("Credenciales Incorrectas");
            return -1;
        }
    }
}

