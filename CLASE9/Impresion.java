public class Impresion extends Producto {
    // Atributos
    private String color;
    private Foto[] foto; // Arreglo de fotos
    // Constructor
    public Impresion(int numero, int precio, String descripcion, String color, Foto[] fotos) {
        super(numero, precio, descripcion);
        this.color = color;
        this.fotos = fotos;
    }
    // Getter
    public String getColor() {
        return color;
    }
    public Foto[] getFotos() {
        return fotos;
    }
    // Setters
    public void setColor(String color) {
        this.color = color;
    }
    public void setFotos(Foto[] fotos) {
        this.fotos = fotos;
    }
    // Metodos
    public void print() {
        System.out.println("Impresión en " + color + " - Precio: $" + getPrecio());
    }
}
