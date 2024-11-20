import ec.edu.uce.dominio.Autopark;
import ec.edu.uce.dominio.Usuario;

public class TestAutoPark {
    public static void main(String[] args) {

        // Crear usuarios de ejemplo
        Usuario usuario1 = new Usuario(1, "Juan Pérez", "juan@correo.com", "contrasena123");
        Usuario usuario2 = new Usuario(2, "Ana Gómez", "ana@correo.com", "contrasena456");
        Usuario usuario3 = new Usuario(3, "Carlos Ruiz", "carlos@correo.com", "contrasena789");

        // Crear un array de usuarios
        Usuario[] usuarios = {usuario1, usuario2, usuario3};

        // Crear un objeto Autopark usando el constructor con parámetros
        Autopark autopark = new Autopark(usuarios, "Calle Principal 123", 10, 3);

        // Verificar los valores predeterminados
        System.out.println("Datos Iniciales:");
        System.out.println("Dirección: " + autopark.getDireccion());
        System.out.println("Carga total: " + autopark.getCargaTotal());
        System.out.println("Número de usuarios: " + autopark.getNumUsuario());
        System.out.println("Usuarios registrados: ");
        for (Usuario u : autopark.getUsuarios()) {
            System.out.println(u.getNombre());
        }

        // Prueba de validaciones
        System.out.println("\nProbando validaciones:");

        // Probar con carga total válida
        autopark.setCargaTotal(15);
        System.out.println("Carga total después de validación: " + autopark.getCargaTotal()); // Esperado: 15

        // Probar con carga total no válida (negativa)
        autopark.setCargaTotal(-5);
        System.out.println("Carga total después de validación: " + autopark.getCargaTotal()); // Esperado: 15 (sin cambio)

        // Probar con número de usuarios válido
        autopark.setNumUsuario(2);
        System.out.println("Número de usuarios después de validación: " + autopark.getNumUsuario()); // Esperado: 2

        // Probar con número de usuarios no válido (supera el límite)
        autopark.setNumUsuario(5);
        System.out.println("Número de usuarios después de validación: " + autopark.getNumUsuario()); // Esperado: 2 (sin cambio)

        // Cambiar dirección
        autopark.setDireccion("Avenida Libertador 456");
        System.out.println("Dirección después de modificación: " + autopark.getDireccion()); // Esperado: "Avenida Libertador 456"




    }
}
