public class EjecutarHerencia {

    public static void main(String[] args){

        //CREACION DE LOS OBJETOS (INSTANCIAR)
        Trabajador objT1 = new Operario(1,"pepito","puertas", 135.0);
        Trabajador objT2 = new Operario(2,"Juan","Islas", 10);
      
        System.out.println(objT1);
        System.out.println(objT2);
    }
} 