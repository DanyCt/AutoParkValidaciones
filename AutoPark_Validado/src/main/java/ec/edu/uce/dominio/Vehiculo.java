package ec.edu.uce.dominio;

/**
 * - Atributos esenciales como matrícula, tipo de vehículo y marca.
 * - Métodos para gestionar datos y funcionalidades relacionadas.
 */
public class Vehiculo {
    private String matricula;
    private String tipoVehiculo;
    private String marca;

    // Constructores
    /**
     * Constructor por defecto.
     * Inicializa los atributos con valores predeterminados.
     */
    public Vehiculo() {
        this.matricula = "HDC123";
        this.tipoVehiculo = "Tipo vehiculo";
        this.marca = "Marca";
    }

    /**
     * Constructor con parámetros para inicializar un vehículo con datos específicos.
     *
     * @param matricula    Matrícula del vehículo.
     * @param tipoVehiculo Tipo de vehículo.
     * @param marca        Marca del vehículo.
     */
    public Vehiculo(String matricula, String tipoVehiculo, String marca) {
        this.matricula = matricula;
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
    }

    // Métodos Getters y Setters
    /**
     * Obtiene la matrícula del vehículo.
     *
     * @return Matrícula del vehículo.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del vehículo.
     * Valida que tenga exactamente 6 caracteres.
     *
     * @param matricula Nueva matrícula.
     */
    public void setMatricula(String matricula) {
        if (matricula != null && matricula.length() == 6) {
            this.matricula = matricula;
        } else {
            System.out.println("Error: La matrícula debe tener exactamente 6 caracteres.");
        }
    }

    /**
     * Obtiene el tipo de vehículo.
     *
     * @return Tipo de vehículo.
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * Establece el tipo de vehículo.
     * Valida que no sea vacío ni el valor predeterminado "Tipo vehiculo".
     *
     * @param tipoVehiculo Nuevo tipo de vehículo.
     */
    public void setTipoVehiculo(String tipoVehiculo) {
        if (tipoVehiculo != null && tipoVehiculo.length() > 5) {
            this.tipoVehiculo = tipoVehiculo;
        } else {
            System.out.println("Error: El tipo de vehículo no puede ser 'Tipo vehiculo' ni vacío.");
        }
    }

    /**
     * Obtiene la marca del vehículo.
     *
     * @return Marca del vehículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del vehículo.
     * Valida que tenga más de 4 caracteres y no sea el valor predeterminado "Marca".
     *
     * @param marca Nueva marca.
     */
    public void setMarca(String marca) {
        if (marca != null && marca.length() >=6) {
            this.marca = marca;
        } else {
            System.out.println("Error: La marca no puede ser 'Marca' ni tener menos de 6 caracteres.");
        }
    }

    // Métodos CRUD y funcionales
    /**
     * Actualiza los datos del vehículo.
     */
    public void actualizarDatosVehiculo() {

    }
    /**
     * Registra el estacionamiento del vehículo en el sistema.
     */
    public void estacionar() {

    }
}
