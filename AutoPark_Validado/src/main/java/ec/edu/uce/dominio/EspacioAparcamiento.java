package ec.edu.uce.dominio;

/**
 * - Representar y gestionar la información básica de un espacio de aparcamiento.
 * - Validar datos clave como el número de espacio y la ubicación.
 * - Incluir operaciones futuras relacionadas con la asignación, liberación y verificación de espacios.
 */
public class EspacioAparcamiento {

    // Atributos
    private String numEspacio;
    private String ubicacion;
    private String estado;

    // Constructores

    /**
     * Constructor por defecto. Inicializa los atributos con valores predeterminados.
     */
    public EspacioAparcamiento() {
        this.numEspacio = "A1";
        this.ubicacion = "Seccion A";
        this.estado = "Ocupado";
    }

    /**
     * Constructor con parámetros para inicializar un espacio de aparcamiento con datos específicos.
     *
     * @param numEspacio Número del espacio de aparcamiento.
     * @param ubicacion  Ubicación del espacio dentro del aparcamiento.
     * @param estado     Estado actual del espacio ("ocupado" o "disponible").
     */
    public EspacioAparcamiento(String numEspacio, String ubicacion, String estado) {
        this.numEspacio = numEspacio;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    // Métodos Getters y Setters

    /**
     * Obtiene el número del espacio de aparcamiento.
     *
     * @return Número del espacio de aparcamiento.
     */
    public String getNumEspacio() {
        return numEspacio;
    }

    /**
     * Establece el número del espacio de aparcamiento con validación.
     *
     * @param numEspacio Número del espacio de aparcamiento.
     *  Debe ser no nulo y contener al menos 2 caracteres.
     */
    public void setNumEspacio(String numEspacio) {
        if (numEspacio != null && numEspacio.length() >= 2) {
            this.numEspacio = numEspacio;
        } else {
            System.out.println("Error: El número de espacio debe tener al menos 2 caracteres.");
        }
    }

    /**
     * Obtiene la ubicación del espacio de aparcamiento.
     *
     * @return Ubicación del espacio de aparcamiento.
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /**
     * Establece la ubicación del espacio de aparcamiento con validación.
     *
     * @param ubicacion Ubicación del espacio de aparcamiento.
     *                  Debe ser no nula y no estar vacía.
     */
    public void setUbicacion(String ubicacion) {
        if (ubicacion != null && !ubicacion.trim().isEmpty()) {
            this.ubicacion = ubicacion;
        } else {
            System.out.println("Error: La ubicación no puede estar vacía.");
        }
    }

    /**
     * Obtiene el estado del espacio de aparcamiento.
     *
     * @return Estado actual del espacio ("ocupado" o "disponible").
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del espacio de aparcamiento.
     *
     * @param estado Estado actual del espacio ("ocupado" o "disponible").
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos CRUD

    /**
     * Asigna el espacio de aparcamiento a un usuario o vehículo.
     */
    public void asignarEspacio() {

    }

    /**
     * Libera el espacio de aparcamiento para que quede disponible.
     */
    public void liberarespacio() {

    }

    /**
     * Verifica la disponibilidad del espacio de aparcamiento.
     */
    public void verificarDisponibilidad() {

    }
}
