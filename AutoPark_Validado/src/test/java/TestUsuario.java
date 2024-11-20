import ec.edu.uce.dominio.Usuario;

public class TestUsuario {
    public static void main(String[] args) {


        // Crear un objeto Usuario usando el constructor por defecto
        Usuario usuario1 = new Usuario();


        System.out.println("ID Usuario: " + usuario1.getIdUsuario());
        System.out.println("Nombre: " + usuario1.getNombre());
        System.out.println("Correo: " + usuario1.getCorreo());
        System.out.println("Contraseña: " + usuario1.getContrasenia());

        // Establecer nuevos valores usando los setters
        usuario1.setIdUsuario(1);
        usuario1.setNombre("Juan Perez");
        usuario1.setCorreo("juanperez@gmail.com");
        usuario1.setContrasenia("secreta123");

        // Verificar si los nuevos valores se han asignado correctamente
        System.out.println(" ");
        System.out.println("ID Usuario: " + usuario1.getIdUsuario());
        System.out.println("Nombre: " + usuario1.getNombre());
        System.out.println("Correo: " + usuario1.getCorreo());
        System.out.println("Contraseña: " + usuario1.getContrasenia());

        // Probar la validación de la contraseña (debe ser al menos 6 caracteres)
        System.out.println("\nProbar validación de contraseña:");
        usuario1.setContrasenia("123");
        usuario1.setContrasenia("123456");


        System.out.println("Contraseña después de la prueba: " + usuario1.getContrasenia()); // Esperado: "123456"
    }
}
