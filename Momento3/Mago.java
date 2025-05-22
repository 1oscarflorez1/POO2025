import java.util.Random;

public class Mago extends Personaje{
     public Mago(String nombre) {
        super(nombre);
        this.puntosDeVida = 100;
    }
@Override
    public void ataqueEspecial(Personaje oponente) {
        if (!ataqueEspecialUsado) {
            Random rand = new Random();
            int dano = rand.nextInt(26) + 15; // 15 a 40
            oponente.recibirDano(dano);
            ataqueEspecialUsado = true;
            System.out.println(nombre + " lanza una bola de fuego y causa " + dano + " de daño mágico.");
        } else {
            System.out.println(nombre + " ya ha usado su ataque especial.");
        }
    }
}
