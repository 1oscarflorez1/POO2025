import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();
        int[] arreglo = new int[N];
        int suma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
            suma += arreglo[i];
        }

        System.out.println("La suma de los números es: " + suma);
        scanner.close();
    }
}