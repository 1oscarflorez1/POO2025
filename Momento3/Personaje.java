import java.util.Random;
import java.util.Scanner;

//Clase abstracta que representa un personaje del juego.
abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected boolean ataqueEspecialUsado = false;
    protected final int MIN_DANO = 10;
    protected final int MAX_DANO = 30;

//constructor de personaje
 public Personaje(String nombre) {
        this.nombre = nombre;
    }
      public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO;
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + dano + " puntos de daño.");
    }

    public abstract void ataqueEspecial(Personaje oponente);

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) this.puntosDeVida = 0;
    }

    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPuntosDeVida() {
        return this.puntosDeVida;
    }

    public boolean puedeUsarEspecial() {
        return !ataqueEspecialUsado;
    }
}