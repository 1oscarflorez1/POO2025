import java.util.Random;

//Clase abstracta que representa un personaje del juego.
abstract class Personaje {
    protected String nombre;
    protected int puntosDeVida;
    protected boolean ataqueEspecialUsado;

//constructor de personaje
 public Personaje(String nombre, int puntosDeVida) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.ataqueEspecialUsado = false;
    }
      public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt(21) + 10; // 10 a 30
        oponente.recibirDano(dano);
        System.out.println(nombre + " ataca causando " + dano + " puntos de daño.");
    }

    public abstract void ataqueEspecial(Personaje oponente);

    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (puntosDeVida < 0) puntosDeVida = 0;
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public boolean puedeUsarEspecial() {
        return ataqueEspecialUsado;
    }
}