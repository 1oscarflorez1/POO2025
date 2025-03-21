import java.util.Scanner;

public class Tarifador2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se crean arreglos para los lugares de parqueo
        boolean[] bajoCilindraje = new boolean[20];
        boolean[] altoCilindraje = new boolean[10];

        System.out.println(" ");
        System.out.println("BIENVENIDOS A ParkingNow, SU PARQUEO DE CONFIANZA!");
        System.out.println(" ");
        
        // Se crea el menú principal con while para la iteración y finalizar.
        // MENU PRINCIPAL
        boolean salida = true;
        while (salida) {
            // Imprimir estado actual de los parqueos
            System.out.println("Islas disponibles para motos de alto cilindraje: ");
            for (int i = 0; i < altoCilindraje.length; i++) {
                System.out.print(altoCilindraje[i] ? "1 " : "0 ");
            }
            System.out.println("\nIslas disponibles para motos de bajo cilindraje: ");
            for (int i = 0; i < bajoCilindraje.length; i++) {
                System.out.print(bajoCilindraje[i] ? "1 " : "0 ");
            }
            System.out.println("\nDISPONIBLE(0), OCUPADO(1)");

            // Imprimir menú
            System.out.println("\n_-MENU PRINCIPAL-_");
            System.out.println("INGRESE EL NÚMERO QUE CORRESPONDA:");
            System.out.println("1. Bajo cilindraje (0cc - 399cc)..");
            System.out.println("2. Alto cilindraje (400cc - 2500cc)..");
            System.out.println("3. MENU COBROS..");
            System.out.println("4. CERRAR APLICATIVO.");

            int menu = scanner.nextInt();

            // Acción para registrar moto de bajo cilindraje
            if (menu == 1) {
                System.out.println("Tu moto es de bajo cilindraje");
                System.out.println("Ingrese un lugar disponible entre 0 y 19: ");
                int lugar = scanner.nextInt();
                if (lugar >= 0 && lugar < 20) {
                    if (!bajoCilindraje[lugar]) {
                        bajoCilindraje[lugar] = true;
                        System.out.println("Moto registrada en el lugar " + lugar);
                    } else {
                        System.out.println("Lo sentimos, el lugar " + lugar + " ya está tomado");
                    }
                } else {
                    System.out.println("Lugar no válido, intenta nuevamente");
                }

            // Acción para registrar moto de alto cilindraje
            } else if (menu == 2) {
                System.out.println("Tu moto es de alto cilindraje.");
                System.out.println("Ingrese un lugar disponible entre 0 y 9: ");
                int lugar = scanner.nextInt();
                if (lugar >= 0 && lugar < 10) {
                    if (!altoCilindraje[lugar]) {
                        altoCilindraje[lugar] = true;
                        System.out.println("Moto registrada en el lugar " + lugar);
                    } else {
                        System.out.println("Lo sentimos, el lugar " + lugar + " ya está tomado");
                    }
                } else {
                    System.out.println("Lugar no válido, intenta nuevamente");
                }

            // Acción para mostrar tarifas de parqueo
            } else if (menu == 3) {
                System.out.println("Ingrese su tiempo en el parqueadero: ");
                int tiempo = scanner.nextInt();
                if (tiempo > 0 && tiempo < 31) {
                    System.out.println("Felicidades, no se te cobrará tarifa!");
                } else if (tiempo >= 30 && tiempo < 60) {
                    System.out.println("Su tarifa de parqueo es de $800.");
                } else if (tiempo >= 60) {
                    System.out.println("Su tarifa de parqueo es de $2000.");
                }

            // Acción para cerrar el aplicativo
            } else if (menu == 4) {
                System.out.println("Cerrando aplicativo...");
                salida = false;

            } else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        // Cerrar scanner al final del programa
        scanner.close();
    }
}
