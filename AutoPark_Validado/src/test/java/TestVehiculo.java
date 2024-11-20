
import ec.edu.uce.dominio.Vehiculo;
public class TestVehiculo {

    public static void main(String[] args) {

        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setMatricula("MCB250");
        vehiculo.setTipoVehiculo("ligero");
        vehiculo.setMarca("Toyota");

        String matricula = vehiculo.getMatricula();
        String tipoVehiculo = vehiculo.getTipoVehiculo();
        String marca = vehiculo.getMarca();

        System.out.println("El numero de matricula  es : " +matricula );
        System.out.println("El tipo de vehiculo es:" +tipoVehiculo);
        System.out.println("La marca del vehiculo es:" +marca);

        System.out.println("\nLlamando a los métodos adicionales:");
        vehiculo.estacionar();
        System.out.println("Método estacionar ejecutado.");

        vehiculo.actualizarDatosVehiculo();
        System.out.println("Método actualizarDatosVehiculo ejecutado.");

    }
}
