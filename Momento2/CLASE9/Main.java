import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> carrito = new ArrayList<>();
        int opcion;
        int contadorProductos = 0;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir Cámara");
            System.out.println("2. Añadir Impresión");
            System.out.println("3. Añadir Servicio de Edición");
            System.out.println("4. Ver Carrito");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); //Limpia buffer

            switch (opcion) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Precio: ");
                    int precio = sc.nextInt();
                    carrito.add(new Camara(contadorProductos++, precio, descripcion, marca, modelo));
                    break;

                case 2:
                    System.out.print("Color (Color / Blanco y Negro): ");
                    String color = sc.nextLine();
                    System.out.print("Número de fotos: ");
                    int n = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    Foto[] fotos = new Foto[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Fichero de la foto " + (i+1) + ": ");
                        String fichero = sc.nextLine();
                        fotos[i] = new Foto(contadorProductos++, 5000, "Foto", "Canon", "X100", fichero);
                    }
                    carrito.add(new Impresion(contadorProductos++, 10000, "Impresión de fotos", color, fotos));
                    break;

                case 3:
                    System.out.print("Horas de edición: ");
                    int horas = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Software utilizado: ");
                    String softwareEditor = sc.nextLine();
                    carrito.add(new Edicion(contadorProductos++, horas * 10000, "Edición profesional", horas, softwareEditor));
                    break;

                case 4:
                    int total = 0;
                    System.out.println("\n--- Carrito ---");
                    for (Producto p : carrito) {
                        if (p instanceof Camara) ((Camara)p).print();
                        else if (p instanceof Impresion) ((Impresion)p).print();
                        else if (p instanceof Edicion) ((Edicion)p).print();
                        total += p.getPrecio();
                    }
                    System.out.println("Total: $" + total);
                    break;
            }
        } while (opcion != 5);
        System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
        }
}