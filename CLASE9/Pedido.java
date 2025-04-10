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
    
    //Metodos
    public Cliente getCliente(){
        return cliente;
    }
    
}
