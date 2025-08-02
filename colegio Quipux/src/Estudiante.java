
import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private String apellidos;
    private String correo;
    private String clave;
    private String habilidad;
    private String mejorar;
    private boolean HabilitarEdicionPerfil;
    private boolean HabilitarIniciarSesion;
    Scanner scanner = new Scanner(System.in);

    public Estudiante(String nombre, String apellidos, String correo, String clave, String habilidad, String mejorar) {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String getMejorar() {
        return mejorar;
    }

    public void setMejorar(String mejorar) {
        this.mejorar = mejorar;
    }

    void EditarPerfil() {
        System.out.println("Editar el perfil? (true/false):");
        String EditarPerfilSioNo = scanner.next();
        boolean resultado2 = Boolean.parseBoolean(EditarPerfilSioNo);
        System.out.println(resultado2);
        if (resultado2) {

           System.out.println("ingrese nuevo nombre:");
            setNombre(scanner.next());
            System.out.println("ingrese su nuevo apellido:");
            setApellidos(scanner.next());
            System.out.println("ingrese su nuevo correo:");
            setCorreo(scanner.next());
            System.out.println("ingrese su nueva clave:");
            setClave(scanner.next());
            System.out.println("imgrese su nueva habilidad");
            setHabilidad(scanner.next());
            System.out.println("si funciona");

        }
    }
    void CerrarSesion() {
        System.out.println("Quieres cerrar sesion? (true/false):");
        String Cerrarsesion = scanner.next();
        boolean resultado3 = Boolean.parseBoolean(Cerrarsesion);
        if (resultado3) {
            System.out.println("Sesion cerrada con exito");
            System.out.println("ingrese nuevos datos del estudiante:");
            System.out.print("Nombres: ");
            HabilitarEdicionPerfil = false;
            HabilitarIniciarSesion = true;
            String nombre = scanner.nextLine();

            System.out.print("Apellidos: ");
            String apellido = scanner.nextLine();

            System.out.print("Correo: ");
            String correo = scanner.next();

            System.out.print("Clave: ");
            String clave = scanner.next();

            System.out.print("Habilidad: ");
            String habilidad = scanner.nextLine();

            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("Correo: " + correo);
            System.out.println("Clave: " + clave);
            System.out.println("Habilidad: " + habilidad);

        }
    }


    void IniciarSesion() {
        if(HabilitarIniciarSesion){
            System.out.println("ingresa tu correo");
            scanner.next(correo);
            System.out.println("ingresa tu clave");
            scanner.next(clave);
            System.out.println("iniciar sesion? (true/flase):");
            String IniciarsecionSioNO = scanner.next();
            boolean resultado1 = Boolean.parseBoolean(IniciarsecionSioNO);
            if (resultado1) {
                System.out.println(IniciarsecionSioNO);
                System.out.println("se esta iniciando sesión");
                HabilitarEdicionPerfil = true;
                HabilitarIniciarSesion = false;
            }
            else {
                System.out.println("Ok");
            }
        }
    }
void CambiarClave() {
    System.out.println("Quieres cambiar tu clave? (true/false):");
    String CambiarClaveSioNo = scanner.next();
    boolean resultado3 = Boolean.parseBoolean(CambiarClaveSioNo);
    if (resultado3) {
    System.out.println("ingrese su nueva clave:");
    setClave(scanner.next());
   }
}

void Comentar() {

        System.out.println(habilidad + "comenta algo");
        scanner.next();
    }

}