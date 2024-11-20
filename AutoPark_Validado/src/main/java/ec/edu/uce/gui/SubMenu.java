package ec.edu.uce.gui;

import java.util.Scanner;

public class SubMenu {

    public static void main(String[] args) {
        SubMenu subMenu = new SubMenu();
        subMenu.SubMenuCuenta(); // Llama al submenú de cuentas para probar
    }

    public String[] SubMenuCredenciales() {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario ingresar sus credenciales
        System.out.print("Ingrese su Usuario: ");
        String user = scanner.nextLine();
        System.out.print("Ingrese su Contraseña: ");
        String contraseña = scanner.nextLine();

        // Devolver usuario y contraseña como un arreglo
        return new String[] { user, contraseña };
    }


    public void SubMenuCuenta() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println();
        do {
            System.out.println("\n"+"============Gestión de Cuentas==========");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Modificar Cuenta");
            System.out.println("3. Consultar Cuenta");
            System.out.println("4. Eliminar Cuenta");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1 -> crearCuenta();
                case 2 -> modificarCuenta();
                case 3 -> consultarCuenta();
                case 4 -> eliminarCuenta();
                case 5 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);
    }

//     Método para crear una cuenta
//
    private void crearCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la contraseña: ");
        String contrasena = scanner.nextLine();

        // Aquí podrías agregar la lógica para guardar la cuenta en una base de datos o una lista
        System.out.println("Cuenta creada exitosamente para el usuario: " + nombre);
    }

    // Método para modificar una cuenta
    private void modificarCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID o nombre del usuario a modificar: ");
        String usuario = scanner.nextLine();

        // Aquí podrías buscar el usuario en una base de datos o lista
        System.out.println("Usuario encontrado: " + usuario);
        System.out.print("Ingrese el nuevo nombre del usuario: ");
        String nuevoNombre = scanner.nextLine();
        System.out.print("Ingrese la nueva contraseña: ");
        String nuevaContraseña = scanner.nextLine();

        // Aquí podrías actualizar los datos del usuario
        System.out.println("Datos del usuario " + usuario + " modificados exitosamente.");
    }

    // Método para consultar una cuenta
    private void consultarCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID o nombre del usuario a consultar: ");
        String usuario = scanner.nextLine();

        // Aquí podrías buscar los detalles del usuario en una base de datos o lista
        System.out.println("Detalles de la cuenta:");
        System.out.println("Nombre de usuario: " + usuario);
        System.out.println("Contraseña: ******** (oculta por seguridad)");
    }

    // Método para eliminar una cuenta
    private void eliminarCuenta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID o nombre del usuario a eliminar: ");
        String usuario = scanner.nextLine();

        // Aquí podrías eliminar la cuenta de una base de datos o lista
        System.out.println("Cuenta del usuario " + usuario + " eliminada exitosamente.");
    }

    public void mostrarSubMenuPago() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto a pagar: ");
        double monto = scanner.nextDouble();
        System.out.println("Pago registrado: " + monto);
    }


    public void SubMenuEspacio() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Gestión de Espacios de Aparcamiento");
            System.out.println("1. Crear Espacio");
            System.out.println("2. Modificar Espacio");
            System.out.println("3. Consultar Espacios");
            System.out.println("4. Eliminar Espacio");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1 -> crearEspacio();
                case 2 -> modificarEspacio();
                case 3 -> consultarEspacios();
                case 4 -> eliminarEspacio();
                case 5 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);
    }

    // Método para crear un espacio
    private void crearEspacio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del espacio: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese el estado del espacio (libre/ocupado): ");
        String estado = scanner.nextLine();

        // Aquí podrías agregar la lógica para guardar el espacio en una lista o base de datos
        System.out.println("Espacio creado exitosamente: ID = " + id + ", Estado = " + estado);
    }

    // Método para modificar un espacio
    private void modificarEspacio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del espacio a modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        // Aquí podrías buscar el espacio en una base de datos o lista
        System.out.println("Espacio encontrado: ID = " + id);
        System.out.print("Ingrese el nuevo estado del espacio (libre/ocupado): ");
        String nuevoEstado = scanner.nextLine();

        // Aquí podrías actualizar los datos del espacio
        System.out.println("Espacio ID = " + id + " actualizado a estado = " + nuevoEstado);
    }

    // Método para consultar espacios
    private void consultarEspacios() {
        // Aquí podrías iterar sobre una lista o base de datos de espacios
        System.out.println("Espacios registrados:");
        System.out.println("ID: 1, Estado: libre");
        System.out.println("ID: 2, Estado: ocupado");
        System.out.println("ID: 3, Estado: libre");
        // Simulación: añade lógica real para obtener los datos de la lista o base de datos
    }

    // Método para eliminar un espacio
    private void eliminarEspacio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del espacio a eliminar: ");
        int id = scanner.nextInt();

        // Aquí podrías eliminar el espacio de una lista o base de datos
        System.out.println("Espacio con ID = " + id + " eliminado exitosamente.");
    }




    public void SubMenuAcceso() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Gestión de Accesos");
            System.out.println("1. Registrar Entrada");
            System.out.println("2. Registrar Salida");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> registrarEntrada();
                case 2 -> registrarSalida();
                case 3 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);
    }

    // Submenú para "Registrar Entrada"
    private void registrarEntrada() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Registrar Entrada");
            System.out.println("1.1 Asignar Espacio");
            System.out.println("1.2 Generar Ticket");
            System.out.println("3. Volver al Menú Anterior");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> asignarEspacio();
                case 2 -> generarTicket();
                case 3 -> System.out.println("Volviendo al menú de accesos...");
                default -> System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);
    }

    // Método para "Asignar Espacio"
    private void asignarEspacio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();
        System.out.print("Ingrese el tipo de vehículo (auto/moto): ");
        String tipo = scanner.nextLine();

        // Simulación de asignación de espacio
        System.out.println("Espacio asignado para el vehículo con placa: " + placa + " y tipo: " + tipo);
    }

    // Método para "Generar Ticket"
    private void generarTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();
        System.out.print("Ingrese el tipo de vehículo (auto/moto): ");
        String tipo = scanner.nextLine();

        // Simulación de generación de ticket
        System.out.println("Ticket generado para el vehículo con placa: " + placa + " y tipo: " + tipo);
    }

    // Submenú para "Registrar Salida"
    private void registrarSalida() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Registrar Salida");
            System.out.println("2.1 Consultar Ticket");
            System.out.println("3. Volver al Menú Anterior");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> consultarTicket();
                case 3 -> System.out.println("Volviendo al menú de accesos...");
                default -> System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 3);
    }

    // Método para "Consultar Ticket"
    private void consultarTicket() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de ticket: ");
        int ticketId = scanner.nextInt();

        // Simulación de consulta de ticket
        System.out.println("Detalles del ticket:");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Vehículo: auto");
        System.out.println("Espacio asignado: 12");
        System.out.println("Hora de entrada: 08:30 AM");
    }



    public void SubMenuCobro() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Gestión de Cobros");
            System.out.println("1. Crear Cobro");
            System.out.println("2. Modificar Cobro");
            System.out.println("3. Consultar Cobros");
            System.out.println("4. Eliminar Cobro");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1 -> crearCobro();
                case 2 -> modificarCobro();
                case 3 -> consultarCobros();
                case 4 -> eliminarCobro();
                case 5 -> System.out.println("Volviendo al menú principal...");
                default -> System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 5);
    }

    // Método para crear un cobro
    private void crearCobro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cobro: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese el monto del cobro: ");
        double monto = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese una descripción del cobro: ");
        String descripcion = scanner.nextLine();

        // Aquí podrías agregar lógica para almacenar el cobro en una lista o base de datos
        System.out.println("Cobro creado exitosamente: ID = " + id + ", Monto = $" + monto + ", Descripción = " + descripcion);
    }

    // Método para modificar un cobro
    private void modificarCobro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cobro a modificar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        // Aquí podrías buscar el cobro en una lista o base de datos
        System.out.println("Cobro encontrado: ID = " + id);
        System.out.print("Ingrese el nuevo monto del cobro: ");
        double nuevoMonto = scanner.nextDouble();
        scanner.nextLine(); // Limpiar buffer
        System.out.print("Ingrese la nueva descripción del cobro: ");
        String nuevaDescripcion = scanner.nextLine();

        // Aquí podrías actualizar los datos del cobro
        System.out.println("Cobro ID = " + id + " modificado exitosamente: Nuevo monto = $" + nuevoMonto + ", Nueva descripción = " + nuevaDescripcion);
    }

    // Método para consultar cobros
    private void consultarCobros() {
        // Aquí podrías iterar sobre una lista o base de datos de cobros
        System.out.println("Cobros registrados:");
        System.out.println("ID: 1, Monto: $50.00, Descripción: Pago por estacionamiento");
        System.out.println("ID: 2, Monto: $30.00, Descripción: Pago por motocicleta");
        System.out.println("ID: 3, Monto: $70.00, Descripción: Pago por auto");
        // Simulación: Añade lógica real para obtener los datos de la lista o base de datos
    }

    // Método para eliminar un cobro
    private void eliminarCobro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cobro a eliminar: ");
        int id = scanner.nextInt();

        // Aquí podrías eliminar el cobro de una lista o base de datos
        System.out.println("Cobro con ID = " + id + " eliminado exitosamente.");
    }


}


