package CLASE4;

public class Ejercutar {
    public static void main(String[] args) {

        //CREACION DE LOS OBJETOS DE LA CLASE VEHICULO
        // LLAMAR CLASE ... = CONSTRUCTOR DE CLASE

        //FORMA 1
        Vehiculo objVehiculo = new Vehiculo("Toyota", "Blanca", 4500.0, "TS3456WE", 2.3, "150HP");
        //FORMA 2
        Vehiculo objVehiculo2;
        objVehiculo2 = new Vehiculo("Ferrari","Rojo", 50000, "SEWR6534UY", 1.8, "450HP");

        //Mostrar la marca del objeto vehiculo 1
        System.out.println(objVehiculo.getMarca());

        //Se va a modificar la marca del vehicuo del objeto objVehiculo1
        objVehiculo.setMarca("Chevrolet");

        //Mostrar todo el objeto
        System.out.println(objVehiculo.toString());
        System.out.println(objVehiculo);
    }
}
