package ec.edu.uce.dominio;

/**
 * - Atributos que identifican al usuario y sus credenciales de acceso.
 * - Métodos para gestionar espacios de aparcamiento, cobros y accesos relacionados.
 */
public class Usuario {
    private int idUsuario;
    private String nombre;
    private String correo;
    private String contrasenia;

    // Constructores
    /**
     * Constructor por defecto.
     * Inicializa los atributos con valores predeterminados.
     */
    public Usuario() {
        this.idUsuario = 0;
        this.nombre = "Sin nombre";
        this.correo = "Sin correo";
        this.contrasenia = "Sin contrasenia";
    }

    /**
     * Constructor con parámetros para inicializar un usuario con datos específicos.
     *
     * @param idUsuario   Identificador único del usuario.
     * @param nombre      Nombre del usuario.
     * @param correo      Correo electrónico del usuario.
     * @param contrasenia Contraseña del usuario.
     */
    public Usuario(int idUsuario, String nombre, String correo, String contrasenia) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
    }

    // Métodos Getters y Setters
    /**
     * Obtiene el ID del usuario.
     *
     * @return ID del usuario.
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el ID del usuario.
     *
     * @param idUsuario Nuevo ID del usuario.
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el nombre del usuario.
     *
     * @return Nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     *
     * @param nombre Nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     *
     * @return Correo electrónico del usuario.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del usuario.
     *
     * @param correo Nuevo correo electrónico del usuario.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return Contraseña del usuario.
     */
    public String getContrasenia() {
        return contrasenia;
    }

    /**
     * Establece una nueva contraseña para el usuario.
     * Valida que la contraseña tenga al menos 6 caracteres.
     *
     * @param contrasenia Nueva contraseña.
     */
    public void setContrasenia(String contrasenia) {
        if (contrasenia != null && contrasenia.length() >= 8) {
            this.contrasenia = contrasenia;
        } else {
            System.out.println("Error: La contraseña debe tener al menos 8 caracteres.");
        }
    }

    // Métodos CRUD y de negocio

    /**
     * Gestiona la asignación de espacios de aparcamiento.
     */
    public void gestionarEspacioAparcamiento() {

    }

    /**
     * Actualiza la información de un espacio de aparcamiento.
     */
    public void actualizarEspacio() {
    }

    /**
     * Gestiona los accesos de los usuarios al sistema.
     */
    public void gestionarAcceso() {
    }

    /**
     * Gestiona el cobro asociado al aparcamiento del usuario.
     */
    public void gestionarCobro() {
    }

    /**
     * Realiza tareas generales de gestión de aparcamiento.
     */
    public void gestionarAparcamiento() {
    }
}
