public class Ciclos {
    public static void main(String[] args) {
//for(inicio, condicion parada, incremento o decremento)
for (int i=1; i<=5; i++){
    System.out.println("iteracion: " +i);
}
//i++ (i=i+1 , i+=1)
//i-- (i=i-1 , i-=1)

/* Estructura del while
 * inicio (por fuera)
 * condicion (condicion){
 * ------------
 * incremento o decremento
 * }
 */

int j = 0; 
while(j <= 5){
    System.out.println("Iteraciones: " + j);
j++;
}

    }
}
