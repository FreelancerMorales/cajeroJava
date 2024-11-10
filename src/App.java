import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String nombre = "";
        float dinero = 500;
        boolean menu;

        do {
            menu = true;
            for (int i = 0; i < 12; i++) {
                System.out.print("\n");
            }
            try {
                System.out.print("\n********************\nIngrese su Nombre: ");
                nombre = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error al leer el nombre, intente nuevamente");
                System.out.print("\n********************\nIngrese su Nombre: ");
                nombre = scanner.nextLine();
            }

            while (menu) {
                for (int i = 0; i < 20; i++) {
                    System.out.print("\n");
                }

                System.out.println("\n********************");
                System.out.println("Nombre del Cliente: " + nombre);
                System.out.println("Saldo Disponible: Q" + dinero);
                System.out.println("\n********************\n");
                System.out.println("1 - Depositar Dinero");
                System.out.println("2 - Retirar Dinero");
                System.out.println("3 - Reiniciar");
                System.out.println("4 - Salir");
                System.out.print("\nIngrese Opcion: ");

                try {
                    opcion = scanner.nextInt();
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Error al leer la opcion, intente nuevamente");
                    scanner.next();
                    continue;
                }

                for (int i = 0; i < 20; i++) {
                    System.out.print("\n");
                }

                System.out.println("\n*****************************************");

                switch (opcion) {
                    case 1:
                        System.out.print("\n Ingrese la cantidad a depositar: ");
                        try {
                            float deposito = scanner.nextFloat();
                            scanner.nextLine();
                        
                            dinero += deposito;
                            System.out.println("\n*****************************************");
                            System.out.println("Dinero depositado con éxito");
                        } catch (Exception e) {
                            System.out.println("\n*****************************************");
                            System.out.println("Error al leer la cantidad a depositar, intente nuevamente");
                            scanner.nextLine();
                            continue;
                        }
                        System.out.println("\n*****************************************");
                        System.out.println("Presione Enter para continuar...");
                        scanner.nextLine();
                        break;

                    case 2:
                        System.out.print("\n Ingrese la cantidad a retirar: ");
                        try {
                            float retiro = scanner.nextFloat();
                            scanner.nextLine();
                            if (retiro > dinero) {
                                System.out.println("\n*****************************************");
                                System.out.println("\n No tiene suficiente dinero para retirar esa cantidad");
                                System.out.println("\n*****************************************");
                                scanner.nextLine();
                                continue;
                            }
                            dinero -= retiro;
                        }catch (Exception e) {
                            System.out.println("\n*****************************************");
                            System.out.println("\n Error al leer la cantidad a retirar, intente nuevamente");
                            System.out.println("\n*****************************************");
                            scanner.nextLine();
                            continue;
                        }
                        System.out.println("\n*****************************************\n");
                        System.out.println("\n Retiro exitoso. Presione Enter para continuar...");
                        System.out.println("\n*****************************************");
                        scanner.nextLine(); 
                        break;

                    case 3:
                        dinero = 500;
                        menu = false;
                        break;
                    case 4:
                        System.out.println("\n*****************************************");
                        System.out.println("\n Gracias por utilizar nuestros servicios");
                        System.out.println("\n*****************************************");

                        for (int i = 0; i < 2; i++) {
                            System.out.println("");
                        }
                        System.exit(0);
                        break;

                    default:
                        System.out.println("\n*****************************************");
                        System.out.println("\n Opción no válida, intente nuevamente.");
                        System.out.println("\n*****************************************");
                        System.out.println("Presione Enter para continuar...");
                        scanner.nextLine();
                    break;
                }
            }
        } while (true);
    }
}