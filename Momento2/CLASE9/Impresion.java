public class Impresion extends Producto {
    // Atributos
    private String color;
    private Foto[] foto; // Arreglo de fotos (composicion)
    // Constructor
    public Impresion(int numero, int precio, String descripcion, String color, Foto[] foto) {
        super(numero, precio, descripcion);
        this.color = color;
        this.foto = foto;
    }
    // Getter
    public String getColor() {
        return color;
    }
    public Foto[] getFotos() {
        return foto;
    }
    // Setters
    public void setColor(String color) {
        this.color = color;
    }
    public void setFoto(Foto[] foto) {
        this.foto = foto;
    }
    // Metodos
    public void print() {
        System.out.println("- Impresión en " + color + " - Precio: $" + getPrecio());
    }
}
