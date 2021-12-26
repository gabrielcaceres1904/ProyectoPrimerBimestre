package ec.edu.epn.PPB;


public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;
    private String cedula;
    private String nombreUsuario;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int edad, String direccion, String cedula, String nombreUsuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.cedula = cedula;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public int validarDatos(String nombre, String apellido, int edad, String direccion, String cedula, String nombreUsuario, String contrasena) {
        if (edad<18 || edad>100){
            return 0;
        }

        if(!isEcuadorianDocumentValid(cedula)){
            return 0;
        }

        return 1;
    }



    private boolean isEcuadorianDocumentValid(String document) {
        byte sum = 0;
        try {
            if (document.trim().length() != 10)
                return false;
            String[] data = document.split("");
            byte verifier = Byte.parseByte(data[0] + data[1]);
            if (verifier < 1 || verifier > 24)
                return false;
            byte[] digits = new byte[data.length];
            for (byte i = 0; i < digits.length; i++)
                digits[i] = Byte.parseByte(data[i]);
            if (digits[2] > 6)
                return false;
            for (byte i = 0; i < digits.length - 1; i++) {
                if (i % 2 == 0) {
                    verifier = (byte) (digits[i] * 2);
                    if (verifier > 9)
                        verifier = (byte) (verifier - 9);
                } else
                    verifier = (byte) (digits[i] * 1);
                sum = (byte) (sum + verifier);
            }
            if ((sum - (sum % 10) + 10 - sum) == digits[9])
                return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}