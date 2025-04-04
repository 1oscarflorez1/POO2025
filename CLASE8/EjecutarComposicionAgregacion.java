public class EjecutarComposicionAgregacion {
    
    public static void main(String[] args){

        //Creacion de los objetos para validar el modelo
        //MODELO = abstraccion de la realidad

        Cuenta[] c = new Cuenta[2]; //Creacion de una estructura de arreglos para las cuentas
        c[0] = new Cuenta(135234632, "Ahorros", 2000.0);
        c[1] = new Cuenta(235234634, "Corriente", 5000.0);
        
        Cliente objCliente1 = new Cliente(1107524819, "Oscar Florez");
        Cliente objCliente2 = new Cliente(1252353466, "Andres Ramos");
        
        Banco objBanco1 = new Banco("Bancolombia", "Calle 5 #43-33", c);
        System.out.println(objBanco1);
        System.out.println(objBanco1.consultarCliente(objCliente2));

    }
    
}
