package ec.edu.uce.dominio;

import java.util.Date;

/**
 * - Almacenar y gestionar los detalles de un ticket, como fecha, hora, tarifa y monto total.
 * - Implementar operaciones para calcular montos y asignar espacios de aparcamiento.
 * - Facilitar el manejo de datos relacionados con el ingreso de vehículos al sistema.
 */
public class Ticket {

    // Atributos
    private int idTicket;
    private Date fechaIngreso;
    private int horaIngreso;
    private float montoTotal;
    private float tarifaHora;

    // Constructores
    /**
     * Constructor por defecto. Inicializa los atributos con valores predeterminados.
     */
    public Ticket() {
        this.idTicket = 0;
        this.fechaIngreso = new Date(2004, 01, 01); // Fecha predeterminada (puede mejorarse para evitar deprecaciones).
        this.horaIngreso = 0;
        this.tarifaHora = 1.0f;
        this.montoTotal = 1.0f;
    }

    /**
     * Constructor con parámetros para inicializar un ticket con datos específicos.
     *
     * @param idTicket      Identificador único del ticket.
     * @param fechaIngreso  Fecha de ingreso del vehículo.
     * @param horaIngreso   Hora de ingreso del vehículo.
     * @param tarifaHora    Tarifa por hora.
     * @param montoTotal    Monto total inicial (puede calcularse más tarde).
     */
    public Ticket(int idTicket, Date fechaIngreso, int horaIngreso, float tarifaHora, float montoTotal) {
        this.idTicket = idTicket;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.montoTotal = montoTotal;
        this.tarifaHora = tarifaHora;
    }

    // Métodos Getters y Setters

    /**
     * Obtiene el identificador del ticket.
     *
     * @return ID del ticket.
     */
    public int getIdTicket() {
        return idTicket;
    }

    /**
     * Establece el identificador del ticket.
     *
     * @param idTicket ID del ticket.
     */
    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    /**
     * Obtiene la fecha de ingreso del vehículo.
     *
     * @return Fecha de ingreso.
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Establece la fecha de ingreso del vehículo.
     *
     * @param fechaIngreso Fecha de ingreso.
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * Obtiene la hora de ingreso del vehículo.
     *
     * @return Hora de ingreso.
     */
    public int getHoraIngreso() {
        return horaIngreso;
    }

    /**
     * Establece la hora de ingreso del vehículo.
     *
     * @param horaIngreso Hora de ingreso.
     */
    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
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
     * Establece el monto total del ticket.
     *
     * @param montoTotal Monto total calculado.
     */
    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    /**
     * Obtiene la tarifa por hora utilizada en el cálculo del ticket.
     *
     * @return Tarifa por hora.
     */
    public float getTarifaHora() {
        return tarifaHora;
    }

    /**
     * Establece la tarifa por hora del ticket.
     *
     * @param tarifaHora Tarifa por hora.
     */
    public void setTarifaHora(float tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    // Métodos CRUD

    /**
     * Crea un nuevo ticket en el sistema.
     */
    public void crearTicket() {

    }

    /**
     * Calcula el monto total del ticket basado en la tarifa por hora y el tiempo transcurrido.
     */
    public void calcularTicket() {

    }

    /**
     * Consulta el monto cobrado por el ticket. (Implementación futura)
     */
    public void consultarCobro() {

    }

    /**
     * Asigna el ticket a un espacio de aparcamiento
     */
    public void asignarEspacio() {

    }
}
