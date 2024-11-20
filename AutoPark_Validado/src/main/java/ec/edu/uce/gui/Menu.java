package ec.edu.uce.gui;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        SubMenu subMenu = new SubMenu();
        int opcion;
        do {
            System.out.println("Gestión de Aparcamientos:");
            System.out.println("1. Ingresar Credenciales");
            System.out.println("2. Gestionar Cuenta");
            System.out.println("3. Gestionar Espacio Aparcamiento");
            System.out.println("4. Administrar Acceso");
            System.out.println("5. Gestionar Cobro");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> subMenu.SubMenuCredenciales();
                case 2 -> subMenu.SubMenuCuenta();
                case 3 -> subMenu.SubMenuEspacio();
                case 4 -> subMenu.SubMenuAcceso();
                case 5 -> subMenu.SubMenuCobro();
                case 6 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida. Inténtelo de nuevo.");
            }
        } while (opcion != 6);
    }
}
