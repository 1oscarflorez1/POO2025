import java.util.Random;
import java.util.Scanner;

//Clase abstracta que representa un personaje del juego.
abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected boolean ataqueEspecialUsado = false;
    protected final int MIN_DANO = 10;
    protected final int MAX_DANO = 30;
}