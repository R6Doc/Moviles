import java.util.Scanner;

public class CajeroAutomatico {
    private static double saldo = 1000; // Saldo inicial

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    retirarDinero();
                    break;
                case 3:
                    depositarDinero();
                    break;
                case 4:
                    jugarTriqui();
                    break;
                case 5: 
                    System.out.println("Gracias por utilizar nuestro cajero Bancolombia.");
                    break;
                default:
                    System.out.println("Opción no valida. Por favor, seleccione una opción valida.");
                    break;
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\nBienvenido al Cajero Automatico");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar dinero");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Jugar Triqui");
        System.out.println("5. Salir");
    }

    private static void consultarSaldo() {
        System.out.println("Su saldo actual es: $" + saldo);
    }

    private static void retirarDinero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad que desea retirar: $");
        double cantidad = scanner.nextDouble();

        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Su saldo actual es: $" + saldo);
        }
    }

    private static void depositarDinero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad que desea depositar: $");
        double cantidad = scanner.nextDouble();

        if (cantidad <= 0) {
            System.out.println("Cantidad no válida.");
        } else {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Su saldo actual es: $" + saldo);
        }
    }

    private static void jugarTriqui() {
        // Funcion para llamar el triqui
        System.out.println("ENTRANDO A TRIQUI");
        System.out.println("---------------------------------------------");
        Triqui obj = new Triqui(); 
        obj.triqui(null);  
    }
}
