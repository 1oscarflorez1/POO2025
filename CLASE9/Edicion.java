public class Edicion extends Producto {
    //Atributos
    private double horas;
    private String softwareEditor;
//Constructor
    public Edicion(int numero, int precio, String descripcion, int horas, String softwareEditor) {
        super(numero, precio, descripcion);
        this.horas = horas;
        this.softwareEditor = softwareEditor;
    }
//Getters
    public int getHoras() {
        return horas;
    }
    public String softwareEditor() {
        return softwareEditor;
    }
//Setters
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void softwareEditor(String softwareEditor) {
        this.softwareEditor = softwareEditor;
    }
//Metodos
    public void print() {
        System.out.println("Edición: " + horas + "hrs en " + softwareEditor + " - Precio: $" + getPrecio());
    }
}

