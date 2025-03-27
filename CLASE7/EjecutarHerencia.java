public class EjecutarHerencia {

    public static void main(String[] args){

        //Arreglo de trabajadores
        Trabajador[] t =new Trabajador[3];
        //CREACION DE LOS OBJETOS (INSTANCIAR)
        t[0] = new Operario(1,"pepito","puertas", 135.0);
        t[1] = new Operario(2,"Juan","Islas", 10);
        t[2] = new Operario(3,"Byron","Cano", 20);

        for(Trabajador x: t){
            System.out.println(x.getClass() + " - " + x.pagar());
        }
    
    }
} 