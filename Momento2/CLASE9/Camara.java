//extends para crear herencia desde producto
public class Camara extends Producto {
    // "Es un" producto por lo
    // tanto tiene una relacion
    // de herencia fuerte con producto

// Atributos
    private String marca;
    private String modelo;
// Constructor
    public Camara(int numero, int precio, String descripcion, String marca, String modelo) {
        super(numero, precio, descripcion);
        this.marca = marca;
        this.modelo = modelo;    
    }
//Getters
    public String getMarca() {
        return marca;    
    }
        public String getModelo() {
        return modelo;    
    }
//Setters
    public void setMarca(String marca) {
        this.marca = marca;    
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;  
    }
// metodos
    public void print() {
        System.out.println("Marca: " + marca + "con el modelo: " + modelo );
}
}
