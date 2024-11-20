package ec.edu.uce.dominio;

/**
 * - Atributos que representan la tarifa especial aplicable, el tipo de vehículo y el monto total.
 * - Métodos para gestionar, calcular y aplicar tarifas específicas para vehículos de carga.
 */
public class TicketCarga {

    private float tarifaEspecial;
    private String vehiculo;
    private float montoTotal;

    // Constructores
    /**
     * Constructor por defecto.
     * Inicializa los atributos con valores predeterminados.
     */
    public TicketCarga() {
        this.tarifaEspecial = 1.5f;
        this.vehiculo = "sin vehiculo";
        this.montoTotal = 3.0f;
    }

    /**
     * Constructor con parámetros para inicializar un ticket de carga con datos específicos.
     *
     * @param tarifaEspecial Tarifa especial para el vehículo de carga.
     * @param vehiculo       Tipo de vehículo.
     * @param montoTotal     Monto total inicial del ticket.
     */
    public TicketCarga(float tarifaEspecial, String vehiculo, float montoTotal) {
        this.tarifaEspecial = tarifaEspecial;
        this.vehiculo = vehiculo;
        this.montoTotal = montoTotal;
    }

    // Métodos Getters y Setters
    /**
     * Obtiene la tarifa especial aplicada al ticket.
     *
     * @return Tarifa especial.
     */
    public float getTarifaEspecial() {
        return tarifaEspecial;
    }

    /**
     * Establece una nueva tarifa especial para el ticket, verificando que sea mayor a cero.
     *
     * @param tarifaEspecial Nueva tarifa especial.
     */
    public void setTarifaEspecial(float tarifaEspecial) {
        if (tarifaEspecial > 0) {
            this.tarifaEspecial = tarifaEspecial;
        } else {
            System.out.println("Error: La tarifa especial debe ser mayor a cero.");
        }
    }

    /**
     * Obtiene el tipo de vehículo de carga asociado al ticket.
     *
     * @return Tipo de vehículo.
     */
    public String getVehiculo() {
        return vehiculo;
    }

    /**
     * Establece el tipo de vehículo de carga asociado al ticket.
     *
     * @param vehiculo Tipo de vehículo.
     */
    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Obtiene el monto total calculado para el ticket.
     *
     * @return Monto total.
     */
    public float getMontoTotal() {
        return montoTotal;
    }

    /**
     * Establece el monto total del ticket, verificando que no sea negativo.
     *
     * @param montoTotal Nuevo monto total.
     */
    public void setMontoTotal(float montoTotal) {
        if (montoTotal >= 0) {
            this.montoTotal = montoTotal;
        } else {
            System.out.println("Error: El monto total no puede ser negativo.");
        }
    }

    // Métodos CRUD y de negocio

    /**
     * Calcula el monto total del ticket aplicando la tarifa especial.
     */
    public void calcularTicket() {

    }

    /**
     * Crea un nuevo ticket para un vehículo de carga.
     */
    public void crearticket() {
    }

    /**
     * Asigna un espacio de aparcamiento al vehículo de carga.
     */
    public void asignarEspacio() {
    }

    /**
     * Consulta el cobro asociado al ticket de carga.
     */
    public void consultarCobro() {
    }

    /**
     * Aplica la tarifa especial al cálculo del ticket.
     */
    public void aplicarTarifaEspecial() {
    }
}
