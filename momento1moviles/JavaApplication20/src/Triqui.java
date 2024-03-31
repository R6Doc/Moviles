import java.util.Scanner;

public class Triqui {
    private static char[][] tablero = new char[3][3];
    private static char jugadorActual = 'X';

    public static void triqui(String[] args) {
        inicializarTablero();
        mostrarTablero();

        Scanner scanner = new Scanner(System.in);
        int fila, columna;

        while (true) {
            System.out.println("Jugador " + jugadorActual + ", ingresa la fila y la columna (0-2):");
            fila = scanner.nextInt();
            columna = scanner.nextInt();

            if (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ') {
                System.out.println("Movimiento inválido, intenta de nuevo.");
                continue;
            }

            tablero[fila][columna] = jugadorActual;
            mostrarTablero();

            if (haGanado()) {
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                break;
            }

            if (tableroLleno()) {
                System.out.println("¡Empate!");
                break;
            }

            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }
    }

    private static void inicializarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    private static void mostrarTablero() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean haGanado() {
        // Revisa filas y columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true; // Ganó en una fila
            }
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                return true; // Ganó en una columna
            }
        }

        // Revisa diagonales
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true; // Ganó en diagonal principal
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true; // Ganó en diagonal secundaria
        }

        return false;
    }

    private static boolean tableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; // Aún hay casillas vacías
                }
            }
        }
        return true; // No hay casillas vacías
    }
}
