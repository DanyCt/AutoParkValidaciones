package ec.edu.uce.dominio;

/**
 *
 * Esta clase incluye:
 * - Atributos para almacenar usuarios, dirección, capacidad máxima y el número actual de usuarios.
 * - Métodos para acceder y modificar los datos con validaciones básicas.
 *
 */
public class Autopark {
    // Atributos
    /** Arreglo de usuarios registrados en el parque de autos. */
    private Usuario[] usuarios;
    private String direccion;
    private int cargaTotal;
    private int numUsuario;

    // Constructores

    /**
     * Constructor por defecto. Inicializa los atributos con valores predeterminados.
     */
    public Autopark() {
        this.usuarios = new Usuario[3];
        this.direccion = "Sin direccion";
        this.cargaTotal = 2;
        this.numUsuario = 0;
    }

    /**
     * Constructor con parámetros para inicializar el parque de autos con datos específicos.
     *
     * @param usuarios    Arreglo de usuarios registrados.
     * @param direccion   Dirección del parque de autos.
     * @param cargaTotal  Capacidad máxima de autos permitida.
     * @param numUsuario  Número actual de usuarios registrados.
     */
    public Autopark(Usuario[] usuarios, String direccion, int cargaTotal, int numUsuario) {
        this.usuarios = usuarios;
        this.direccion = direccion;
        this.cargaTotal = cargaTotal;
        this.numUsuario = numUsuario;
    }

    // Métodos Getters

    /**
     * Obtiene el arreglo de usuarios registrados.
     *
     * @return Arreglo de usuarios.
     */
    public Usuario[] getUsuarios() {
        return usuarios;
    }

    /**
     * Obtiene la dirección del parque de autos.
     *
     * @return Dirección del parque de autos.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Obtiene la capacidad máxima de autos permitida.
     *
     * @return Capacidad máxima de autos.
     */
    public int getCargaTotal() {
        return cargaTotal;
    }

    /**
     * Obtiene el número actual de usuarios registrados.
     *
     * @return Número de usuarios registrados.
     */
    public int getNumUsuario() {
        return numUsuario;
    }

    // Métodos Setters

    /**
     * Establece el arreglo de usuarios registrados.
     *
     * @param usuarios Arreglo de usuarios.
     */
    public void setUsuarios(Usuario[] usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * Establece la dirección del parque de autos.
     *
     * @param direccion Dirección del parque.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Establece la capacidad máxima de autos permitida con validación.
     *
     * @param cargaTotal Capacidad máxima de autos.
     */
    public void setCargaTotal(int cargaTotal) {
        if (cargaTotal >= 0) {
            this.cargaTotal = cargaTotal;
        } else {
            System.out.println("Error: La carga total no puede ser negativa.");
        }
    }

    /**
     * Establece el número actual de usuarios registrados con validación.
     *
     * @param numUsuario Número de usuarios registrados.
     */
    public void setNumUsuario(int numUsuario) {
        if (numUsuario >= 0 && numUsuario <= usuarios.length) {
            this.numUsuario = numUsuario;
        } else {
            System.out.println("Error: El número de usuarios debe estar entre 0 y " + usuarios.length);
        }
    }

    // Métodos CRUD

    /**
     * Registra la entrada de un auto al parque. (Implementación futura)
     */
    public void registrarEntrada() {

    }

    /**
     * Registra la salida de un auto del parque. (Implementación futura)
     */
    public void registrarSalida() {

    }

    /**
     * Crea un nuevo usuario en el sistema. (Implementación futura)
     */
    public void crearUsuario() {

    }

    /**
     * Modifica la información de un usuario existente. (Implementación futura)
     */
    public void modificarUsuario() {

    }

    /**
     * Consulta la información de un usuario registrado. (Implementación futura)
     */
    public void consultarUsuario() {

    }

    /**
     * Elimina un usuario del sistema. (Implementación futura)
     */
    public void eliminarUsuario() {

    }
}
