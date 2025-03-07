import java.util.Arrays;
import java.util.Scanner;

public class tarifador{
    public static void main(String[] args) {
//Se crean arreglos para parquear dos tipos de motos
        int[] bajoCilindraje = new int[20];
        int[] altoCilindraje = new int[10];
        System.out.println(Arrays.toString(bajoCilindraje));
        System.out.println(Arrays.toString(altoCilindraje));
        System.out.println("¡Que suerte! Todos los puestos estan disponibles... por ahora.");
//Reconociendo moto...
Scanner lectura = new Scanner (System.in);
System.out.println("Ingrese su tipo de moto: ");
System.out.println("1. Bajo cilindraje (0cc - 399cc)");
System.out.println("2. Alto cilindraje (400cc - 2500cc)");
//int tipoMoto = lectura.next();

/*Establecemos los puestos de ambos cilindrajes como disponibles(vacio=0,ocupado=1)
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (50 - 0)) + 0;
            System.out.print(a[i] + " ");
        }
*/
}
}