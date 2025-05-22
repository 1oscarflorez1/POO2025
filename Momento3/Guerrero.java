import java.util.Random;
public class Guerrero extends Personaje {
     public Guerrero(String nombre) {
        super(nombre);
        this.puntosDeVida = 120;
}
  @Override
    public void ataqueEspecial(Personaje oponente) {
        if (!ataqueEspecialUsado) {
            Random rand = new Random();
            int dano = rand.nextInt(21) + 20; // 20 a 40
            oponente.recibirDano(dano);
            ataqueEspecialUsado = true;
            System.out.println(nombre + " usa su ataque especial con espada feroz y causa " + dano + " de daño.");
        } else {
            System.out.println(nombre + " ya ha usado su ataque especial.");
        }
    }
}