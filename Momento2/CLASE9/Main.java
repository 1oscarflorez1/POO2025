import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> carrito = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        int opcion;
        int contadorProductos = 0;
        int nclientes=0;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir Cámara");
            System.out.println("2. Añadir Impresión");
            System.out.println("3. Añadir Servicio de Edición");
            System.out.println("4. Ver Carrito");
            System.out.println("5. Añadir Cliente");
            System.out.println("6. Ver Listado Clientes");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); //Limpia buffer

            switch (opcion) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Color: ");
                    String color = sc.nextLine();
                    System.out.print("Descripción: ");
                    String descripcion = sc.nextLine();
                    System.out.print("Precio: ");
                    int precio = sc.nextInt();
                    carrito.add(new Camara(contadorProductos++, precio, descripcion, marca, modelo, color));
                    break;

                case 2:
                    System.out.print("Color (Color / Blanco y Negro): ");
                    String tinta = sc.nextLine();
                    System.out.print("Número de fotos: ");
                    int n = sc.nextInt();
                    sc.nextLine(); // limpiar buffer

                    Foto[] fotos = new Foto[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Fichero de la foto " + (i+1) + ": ");
                        String fichero = sc.nextLine();
                        fotos[i] = new Foto(contadorProductos++, 5000, "Foto", "Canon", "X100", fichero);
                    }
                    
                    carrito.add(new Impresion(contadorProductos++, 10000, "Impresión de fotos", tinta, fotos));
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
                    System.out.println("Total del carrito: $" + total);
                    break;
                
                case 5: 
                System.out.print("Ingrese cédula: ");
                String cedula = sc.nextLine();
               
                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();
                
                System.out.print("Ingrese dirección: ");
                String direccion = sc.nextLine();
                
                System.out.print("Ingrese número de celular: ");
                String celular = sc.nextLine();
                
                System.out.print("Ingrese correo electrónico: ");
                String correo = sc.nextLine();
            
                Cliente cliente = new Cliente(cedula, nombre, direccion, celular, correo);
                clientes.add(cliente);
                System.out.println("- Cliente registrado con éxito.\n");
                nclientes=nclientes++;
                break;

                case 6:
                System.out.println("\n--- LISTADO DE CLIENTES ---");
                if (clientes.isEmpty()) {
                System.out.println("No hay clientes registrados.");
                } else {
                for (Cliente c : clientes) {
                System.out.println("CLIENTE " + nclientes + "REGISTRADO");    
                System.out.println("Cédula: " + c.getCedula());
                System.out.println("Nombre: " + c.getNombre());
                System.out.println("Dirección: " + c.getDireccion());
                System.out.println("Celular: " + c.getCelular());
                System.out.println("Correo: " + c.getCorreo());
                System.out.println("------------------------");
                }   
                }
                break;
            }
        } while (opcion != 7);
        System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
        }
}