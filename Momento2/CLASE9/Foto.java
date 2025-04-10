public class Foto extends Camara{
    //Atributos
    private String fichero;
//Constructor
    public Foto(int numero, int precio, String descripcion, String marca, String modelo, String fichero) {
        super(numero, precio, descripcion, marca, modelo);
        this.fichero = fichero; 
    }
//Getters
    public String getFichero() {
        return fichero;    
    }
//Setters
    public void setFichero(String fichero) {
        this.fichero = fichero;
    }
    //metodo
    public void print(){
        System.out.println("Foto: " + fichero + " - Precio: $" + getPrecio());
    }
}
