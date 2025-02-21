public class Ejercico3 {
    public static void main(String[] args) {

        // 3. Dado un arreglo lineal de numeros
        // sumar separadamente los numeros pares y los impares.
        // Analisis: Declarar un arreglo, en dos variables ir guardando
        // la suma de los numeros pares y numeros impares, lo anterior debe iterar
        // en un "for" con la condición de validar si el número es par o impar (n%2 == 0
        // -> par)

        int[] arreglo = { 5, 2, 6, 5, 9, 90, 1, 8, 15, 4 };

        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                sumaPares = sumaPares + arreglo[i];
            } else {
                // se puede expresar tambien como +=
                sumaImpares += arreglo[i];
            }
        }
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La suma de los numeros impares es: " + sumaImpares);
    }
}
