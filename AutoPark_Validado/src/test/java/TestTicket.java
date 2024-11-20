import ec.edu.uce.dominio.Ticket;
import java.util.Date;

public class TestTicket {
    public static void main(String[] args) {

        // Crear un objeto Ticket usando el constructor por defecto
        Ticket ticket = new Ticket();

        // Mostrar los valores por defecto
        System.out.println("Ticket - Datos Iniciales:");
        System.out.println("ID Ticket: " + ticket.getIdTicket());
        System.out.println("Fecha de Ingreso: " + ticket.getFechaIngreso());
        System.out.println("Hora de Ingreso: " + ticket.getHoraIngreso());
        System.out.println("Monto Total: " + ticket.getMontoTotal());
        System.out.println("Tarifa por Hora: " + ticket.getTarifaHora());

        // Crear un objeto Ticket usando el constructor con parámetros
        Date fechaIngreso = new Date(2024, 11, 18);
        Ticket ticket2 = new Ticket(1, fechaIngreso, 10, 2.5f, 25.0f);

        // Mostrar los datos del nuevo ticket
        System.out.println("\nTicket - Datos con Constructor Parametrizado:");
        System.out.println("ID Ticket: " + ticket2.getIdTicket());
        System.out.println("Fecha de Ingreso: " + ticket2.getFechaIngreso());
        System.out.println("Hora de Ingreso: " + ticket2.getHoraIngreso());
        System.out.println("Monto Total: " + ticket2.getMontoTotal());
        System.out.println("Tarifa por Hora: " + ticket2.getTarifaHora());


    }
}
