public class Edicion extends Producto {
    //Atributos
    private double horas;
    private String softwareEditor;
//Constructor
public Edicion(int numero, int precio, String descripcion, int horas, String softwareUtilizado) {
    super(numero, precio, descripcion);
    this.horas = horas;
    this.softwareUtilizado = softwareUtilizado;
}
    //metodo
    System.out.println("Servicio de edición:");
    System.out.println("Horas: " + horas);
    System.out.println("Software: " + softwareEditor);
    System.out.println("Precio: $" + getPrecio());
}
