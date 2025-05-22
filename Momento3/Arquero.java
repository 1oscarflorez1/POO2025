import java.util.Random;

public class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre, 100);
    }

    @Override
    public void ataqueEspecial(Personaje oponente) {
        if (!ataqueEspecialUsado) {
            Random rand = new Random();
            int dano = rand.nextInt(11) + 30; // 30 a 40
            oponente.recibirDano(dano);
            System.out.println(nombre + " dispara una flecha certera causando " + dano + " puntos de daño.");
            ataqueEspecialUsado = true;
        } else {
            System.out.println(nombre + " ya usó su ataque especial.");
        }
    }
}
