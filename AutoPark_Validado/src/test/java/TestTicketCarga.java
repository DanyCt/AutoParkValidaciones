import ec.edu.uce.dominio.TicketCarga;

public class TestTicketCarga {

    public static void main(String[] args) {
        // Test del constructor por defecto
        TicketCarga ticket1 = new TicketCarga();
        System.out.println("Test Constructor por Defecto:");
        System.out.println("Tarifa Especial: " + ticket1.getTarifaEspecial());
        System.out.println("Vehículo: " + ticket1.getVehiculo());
        System.out.println("Monto Total: " + ticket1.getMontoTotal());
        System.out.println();

        // Test del constructor con parámetros
        TicketCarga ticket2 = new TicketCarga(2.0f, "Camión", 10.0f);
        System.out.println("Test Constructor con Parámetros:");
        System.out.println("Tarifa Especial: " + ticket2.getTarifaEspecial());
        System.out.println("Vehículo: " + ticket2.getVehiculo());
        System.out.println("Monto Total: " + ticket2.getMontoTotal());
        System.out.println();

        // Test de setters con valores válidos
        System.out.println("Test Setters con Valores Válidos:");
        ticket1.setVehiculo("Furgoneta");
        ticket1.setTarifaEspecial(3.0f);
        ticket1.setMontoTotal(5.0f);
        System.out.println("Nuevo Vehículo: " + ticket1.getVehiculo());
        System.out.println("Nueva Tarifa Especial: " + ticket1.getTarifaEspecial());
        System.out.println("Nuevo Monto Total: " + ticket1.getMontoTotal());
        System.out.println();

        // Test de setters con valores inválidos
        System.out.println("Test Setters con Valores Inválidos:");
        ticket1.setTarifaEspecial(-1.0f);
        ticket1.setMontoTotal(-5.0f);
        System.out.println("Tarifa Especial después de intento inválido: " + ticket1.getTarifaEspecial());
        System.out.println("Monto Total después de intento inválido: " + ticket1.getMontoTotal());
    }
}
