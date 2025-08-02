import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante("","","","","","");
        // Se crea un objeto para darle los atributos
        System.out.println("Datos del estudiante: ");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        estudiante.setNombre(nombre);

        System.out.print("Apellidos: ");
        String apellido = scanner.nextLine();
        estudiante.setApellidos(apellido);

        System.out.print("Correo: ");
        String correo = scanner.next();
        estudiante.setCorreo(correo);

        System.out.print("Clave: ");
        String clave = scanner.next();
        estudiante.setClave(clave);

        System.out.print("Habilidad: ");
        String habilidad = scanner.next();
        estudiante.setHabilidad(habilidad);
        //Se le dan todos sus atributos

        estudiante.EditarPerfil();
        estudiante.CambiarClave();
        estudiante.CerrarSesion();
        estudiante.IniciarSesion();
        estudiante.Comentar();

    }

}