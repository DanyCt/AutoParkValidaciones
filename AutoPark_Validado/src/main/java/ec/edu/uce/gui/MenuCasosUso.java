package ec.edu.uce.gui;

import ec.edu.uce.dominio.Autopark;
import ec.edu.uce.util.Validacion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuCasosUso {
    Scanner entrada = new Scanner(System.in);
    private Autopark autopark;
    private SubMenu subMenu = new SubMenu();

    public MenuCasosUso() {
        this.autopark = new Autopark();
    }

    public void ingreso() {
        int opcion1 = 0;
        boolean entradaValida;
        do {
            System.out.println("***************************************");
            System.out.println("             MENU PRINCIPAL            ");
            System.out.println("               AUTOPARK                ");
            System.out.println("***************************************");
            System.out.println("1. Ingresar al Sistema");
            System.out.println("2. Salir");
            System.out.println("______________________________________");
            System.out.print("Ingrese una opcion: ");
            entradaValida = true;

            try {
                opcion1 = entrada.nextInt();
                entrada.nextLine();

                switch (opcion1) {
                    case 1:
                        System.out.println("");
                        System.out.println("_____________________________________________");
                        System.out.println("INGRESO DE CREDENCIALES");
                        ingresarCredenciales();
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("_____________________________________________");
                        System.out.println("Vuelve Pronto");
                        break;
                    default:
                        System.out.println("Error, ingrese una opcion correcta");
                        entradaValida = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, ingrese una opcion valida");
                entrada.nextLine();
                entradaValida = false;
            }
        } while (opcion1 != 2 || !entradaValida);
    }

    public void ingresarCredenciales() {
        System.out.print("Ingrese su correo electronico: ");
        String correo = entrada.nextLine();
        System.out.print("Ingrese su contrasenia: ");
        String contrasenia = entrada.nextLine();

        // Usa el método de validación para comprobar credenciales
        if (Validacion.validarelUsuario(autopark.getUsuarios(), autopark.getNumUsuario(), contrasenia, correo)) {
            System.out.println("Bienvenido");
            menuCasosUso();
        } else {
            System.out.println("Correo electronico y/o contrasenia incorrectos. Por favor intentelo de nuevo.");
        }
    }

    public void menuCasosUso() {
        int opcion;
        do {
            mostrarMenuPrincipal();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("_____________________________________________");
                    System.out.println("Bienvenido a Gestionar Usuario");
                    subMenu.SubMenuCuenta();
                    break;

                case 2:
                    System.out.println("_____________________________________________");
                    System.out.println("Bienvenido a Gestionar Acceso");
                    subMenu.SubMenuAcceso();
                    break;
                case 3:
                    System.out.println("_____________________________________________");
                    System.out.println("Bienvenido a Gestionar Espacio Aparcamiento");
                    subMenu.SubMenuEspacio();
                    break;

                case 4:
                    System.out.println("_____________________________________________");
                    System.out.println("Bienvenido a Gestionar Cobro");
                    subMenu.SubMenuCobro();
                    break;

                case 0:
                    System.out.println("Saliendo al menu anterior...");
                    break;

                default:
                    System.out.println("Error, ingrese una opcion correcta");
            }
        } while (opcion != 0);
    }

    private void mostrarMenuPrincipal() {
        System.out.println("***************************************");
        System.out.println("              AUTOPARK  ");
        System.out.println("***************************************");
        System.out.println("             MENU PRINCIPAL          ");
        System.out.println("***************************************");
        System.out.println("1. Gestionar Usuario");
        System.out.println("2. Gestionar Acceso");
        System.out.println("3. Gestionar Espacio Aparcamiento");
        System.out.println("4. Gestionar Gestionar Cobro");
        System.out.println("0. Salir al Menu Anterior");
        System.out.println("______________________________________");
        System.out.print("Ingrese una opcion: ");
    }

    public static void main(String[] args) {
        MenuCasosUso menu = new MenuCasosUso();
        menu.ingreso();
    }
}
