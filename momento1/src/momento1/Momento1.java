/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package momento1;

import java.util.Scanner;

/**
 *
 * @author disenoydesarrollo
 */
public class Momento1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido a mi app");
        System.out.println("1. Area de triangulo");
        System.out.println("2. Promedio de notas");
        System.out.println("3. Salir");
        System.out.println("Que punto desea consultar (1, 2, 3)");
        
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1: triangulo(null);
            case 2: notas(null);
            case 3: break;
            default: {
                System.out.println("opcion incorrecta");
                main(null);
            }
        }
    }
    
    public static void notas(String[] args){
            // TODO code application logic here
         Scanner leer = new Scanner(System.in);

        // Número de notas
        System.out.print("Ingrese el número de notas: ");
        int numeroNotas = leer.nextInt();

        // Declaracion de array
        double[] notas = new double[numeroNotas];

        // FOR para leer las notas
        for (int i = 0; i < numeroNotas; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = leer.nextDouble();
        }

        // Calcular el promedio
        double promedio = 0;
        for (double nota : notas) {
            promedio += nota;
        }
        promedio /= numeroNotas;

        // Mostrar las notas
        System.out.println("Las notas son:");
        for (double nota : notas) {
            System.out.println("- " + nota);
        }

        // Mostrar el promedio
        System.out.println("El promedio de las es: " + promedio);
        System.out.println("Volviendo al menu");
        System.out.println("");
        main(null);
}

    public static void triangulo(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        // Opciones
        System.out.println("Seleccione una opción:");
        System.out.println("1. Calcular area");
        System.out.println("2. Calcular perimetro");
        System.out.println("3. Calcular hipotenusa");

        int opcion = leer.nextInt();

        // Entrada
        System.out.print("Ingrese el cateto 1: ");
        double cateto1 = leer.nextDouble();
        System.out.print("Ingrese el cateto 2: ");
        double cateto2 = leer.nextDouble();

        // Salida
        switch (opcion) {
            case 1: {
                double area = (cateto1 * cateto2) / 2;
                System.out.println("El área del triángulo rectángulo es: " + area);
                main(null);
            }
            case 2: {
                double perimetro = cateto1 + cateto2 + Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
                System.out.println("El perímetro del triángulo rectángulo es: " + perimetro);
                main(null);
            }
            case 3: {
                double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
                System.out.println("La hipotenusa del triángulo rectángulo es: " + hipotenusa);
                main(null);
            }
            default: 
                System.out.println("Opcion invalida");
                System.out.println("Volviendo al menu.");
                System.out.println("");
                main(null); 
        }
    
}

}
    

