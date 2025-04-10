import java.util.*;

public class Pedido {
//CLASE PADRE
//Atributos
    private Cliente cliente; //relacion fuerte (depende directamente) tambien producto
    private Producto[] producto; //camaras, impresiones, etc. (polimorfismo, el arreglo puede contener objetos)
    private Date fecha;
    private int numeroTarjetaCredito;
//Constructor
    public Pedido(Cliente cliente, Producto[] producto, Date fecha, int numeroTarjetaCredito){
        this.cliente=cliente;
        this.producto=producto;
        this.fecha=fecha;
        this.numeroTarjetaCredito=numeroTarjetaCredito;
    }
//Getters
    public Cliente getCliente(){
        return cliente;
    }
    public Producto[] getProducto() {
        return producto;
    }
//Metodos
    public int calcularTotal() {
        int total = 0;
        for (Producto p : producto) {
            total += p.getPrecio();
        }
        return total;
    }
    public void mostrarPedido() {
        for (Producto p : producto) {
            if (p instanceof Camara) {
                ((Camara)p).print();
            } else if (p instanceof Impresion) {
                ((Impresion)p).print();
            } else if (p instanceof Edicion) {
                ((Edicion)p).print();
            }
        }
        System.out.println("Total a pagar: $" + calcularTotal());
    }
}
