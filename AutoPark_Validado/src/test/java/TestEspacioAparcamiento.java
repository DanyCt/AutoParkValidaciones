import ec.edu.uce.dominio.EspacioAparcamiento;

public class TestEspacioAparcamiento {
    public static void main(String[] args) {

        // Crear un objeto EspacioAparcamiento usando el constructor por defecto
        EspacioAparcamiento espacio = new EspacioAparcamiento();

        // Mostrar los valores por defecto
        System.out.println("Espacio de Aparcamiento - Datos Iniciales:");
        System.out.println("Número de espacio: " + espacio.getNumEspacio());
        System.out.println("Ubicación: " + espacio.getUbicacion());
        System.out.println("Estado: " + espacio.getEstado());

        // Crear un objeto EspacioAparcamiento usando el constructor con parámetros
        EspacioAparcamiento espacio2 = new EspacioAparcamiento("B2", "Seccion B", "Disponible");

        // Mostrar los datos del nuevo espacio
        System.out.println("\nEspacio de Aparcamiento - Datos con Constructor Parametrizado:");
        System.out.println("Número de espacio: " + espacio2.getNumEspacio());
        System.out.println("Ubicación: " + espacio2.getUbicacion());
        System.out.println("Estado: " + espacio2.getEstado());

        // Probar el setter de número de espacio con un valor válido
        System.out.println("\nProbando setter de Número de Espacio con valor válido:");
        espacio2.setNumEspacio("C3");
        System.out.println("Nuevo número de espacio: " + espacio2.getNumEspacio());

        // Probar el setter de número de espacio con un valor inválido
        System.out.println("\nProbando setter de Número de Espacio con valor inválido:");
        espacio2.setNumEspacio("");

        // Probar el setter de ubicación con un valor válido
        System.out.println("\nProbando setter de Ubicación con valor válido:");
        espacio2.setUbicacion("Seccion C");
        System.out.println("Nueva ubicación: " + espacio2.getUbicacion());

        // Probar el setter de ubicación con un valor inválido
        System.out.println("\nProbando setter de Ubicación con valor inválido:");
        espacio2.setUbicacion("");

        // Probar el setter de estado
        System.out.println("\nProbando setter de Estado:");
        espacio2.setEstado("Ocupado");
        System.out.println("Nuevo estado: " + espacio2.getEstado());

        // Probar la consulta del espacio (estado)
        System.out.println("\nConsultando el estado del espacio:");
        System.out.println("Estado actual: " + espacio2.getEstado());
    }
}
