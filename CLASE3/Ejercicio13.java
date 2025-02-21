public class Ejercicio13 {
    public static void main(String[] args) {
        /*
         * Dado un arreglo A de n elementos almacenar
         * los elementos mayores y menores que la media,
         * almacenarlos en arreglos diferentes.
         * 
         * Analisis: Necesitamos crear el arreglo de tamaño
         * aleatorio y generar numeros aleatorios para que sean
         * almacenados, posteriormente obtenemos la media del arreglo
         * y comparamos cada posicion del arreglo para determinar si es
         * mayor o menor a la media.
         */
    
        //random -> (max - min + 1) + max
        //n será el numero aleatorio para el tamaño del arreglo
            int n= (int)(Math.random() * (15 - 5)) + 5;
            //Declarar o crear el arreglo
            int[] a = new int[n];

        //Llenar el arreglo con numeros aleatorios entre 0 y 50
        for (int i = 0; i < a.length; i++) {
            a[i]= (int)(Math.random() * (50 - 0)) + 0;
        }
        //Clacular la media del arreglo a declarar una variable que almacene la suma del arreglo
        int sumaArreglo = 0;
        for (int i = 0; i < a.length; i++) {
            sumaArreglo += a[i];
        }
        double media = sumaArreglo / a.length;

        System.out.println("Media del arreglo: "+ media);

    /*
     * Definir la cantidad de elementos que tiene el arreglo por encima
     * de la media y por debajo de la media.
     */
    int contadorMayorMedia = 0, contadorMenorMedia = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] >= media) {
            contadorMayorMedia++;
        }else{
            contadorMenorMedia++;
        }
    }
    /*
     * Creacion de los arreglos que almacenaran los numeros
     * mayores y menores a la media
     */
    int[] mayores = new int[contadorMayorMedia];
    int[] menores = new int[contadorMenorMedia];

    int posMayores = 0, posMenores = 0;

    for (int i = 0; i < a.length; i++) {
        if (a[i] >= media) {
            mayores[posMayores] = a[i];
            posMayores++;
        }else{
            menores[posMenores] = a[i];
            posMenores++;
        }
    }
    //MOSTRAR LOS ARREGLOS DEFINITIVOS
    for (int i = 0; i < mayores.length; i++) {
        System.out.print(mayores[i]+"");
    }
    System.out.println();

    //MOSTRAR LOS ARREGLOS DEFINITIVOS
    for (int i = 0; i < menores.length; i++) {
        System.out.print(menores[i]+"");
    }
    System.out.println();
 } 
}
