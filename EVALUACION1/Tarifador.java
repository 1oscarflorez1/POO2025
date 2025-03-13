import java.util.Arrays;
import java.util.Scanner;

public class Tarifador {
    public static void main(String[] args) {
        //Se crean arreglos para los lugares de parqueo
        boolean[] bajoCilindraje = new boolean[20];
        boolean[] altoCilindraje = new boolean[10];
        System.out.println("(0cc - 399cc): " + Arrays.toString(bajoCilindraje));
        System.out.println("(400cc - 2500cc): " + Arrays.toString(altoCilindraje));
        System.out.println("¡Que suerte! Todos los puestos estan disponibles... por ahora.\n");

        Scanner scanner = new Scanner(System.in);
        
        //BIENVENIDA
        System.out.println("BIENVENIDOS A ParkingNow, SU PARQUEO DE CONFIANZA!");
        System.out.println("¡HORARIO DE ATENCIÓN: DESDE LAS 07:00 HRS HASTA LAS 22:00 HRS, TODOS LOS DIAS DE LA SEMANA!");
        
        //Imprimiendo valor tarifaS...
        System.out.println("$ TARIFAS: $ ");
        System.out.println("         ≤ 30 minutos = $0\n         30 < 60 minutos = $800\n         ≥ 60 minutos = $2000");
        
        //Se crea el menu principal con while para la iteracion y finalizar.
        //MENU PRINCIPAL
        while (true){
        System.out.println("_-MENU PRINCIPAL-_");
        System.out.println("INGRESE EL NÚMERO QUE CORRESPONDA:");
        System.out.println("- REGISTRA TU MOTO..");
        System.out.println("1. Bajo cilindraje (0cc - 399cc)..");
        System.out.println("2. Alto cilindraje (400cc - 2500cc)..");
        System.out.println("3. MENU COBROS..");
        System.out.println("4. CERRAR APLICATIVO.");
        int menu = scanner.nextInt();

        if (menu == 1){
            //Se registrará como bajo cilindraje
            System.out.println("Ingrese un lugar disponible entre 0 y 19: ");
            int lugar = scanner.nextInt();
            if(lugar >= 0 && lugar >20){
                if(bajoCilindraje[lugar] = false){
                    bajoCilindraje[lugar] = true;
                    System.out.println("Moto registrada en el lugar" + lugar);
                }else{
                    System.out.println("Lo sentimos, el lugar " + lugar + "ya esta tomado");
                }
            }else{
                System.out.println("Lugar no valido, intenta nuevamente");
            }
        }else if (menu == 2){
                    //Se registrará como alto cilindraje
                    System.out.println("Ingrese un lugar disponible entre 0 y 9: ");
                    int lugar = scanner.nextInt();
                    if(lugar >= 0 && lugar >9){
                        if(altoCilindraje[lugar] = false){
                            altoCilindraje[lugar] = true;
                            System.out.println("Moto registrada en el lugar" + lugar);
                        }else{
                            System.out.println("Lo sentimos, el lugar " + lugar + "ya esta tomado");
                        }
                    }else{
                        System.out.println("Lugar no valido, intenta nuevamente");
                    }
        }else if (menu == 3){
            //MENU DE COBRO
            System.out.println("Ingrese su tiempo en el parqueadero: ");
            int tiempo = scanner.nextInt();
            if(tiempo>0 && tiempo<31){
                System.out.println("Felicidades, no se te cobrará tarifa! ");
            }else if (tiempo>30 && tiempo<60){
                System.out.println("Su tarifa de parqueo es de $800.");
            }else if (tiempo>59){
                System.out.println("Su tarifa de parqueo es de $2000.");

        }else if (menu == 4){
            //EXIT
            System.out.println("Cerrando aplicativo...");
            break;
        }else{
            System.out.println("Intenta de nuevo..");
        }           
        
    scanner.close();
        
    }
}
