import java.util.Random;

public class Ninja extends Personaje {
    public Ninja(String nombre) {
        super(nombre, 95);
    }

    @Override
    public void ataqueEspecial(Personaje oponente) {
        if (!ataqueEspecialUsado) {
            Random rand = new Random();
            int dano = rand.nextInt(21) + 20; // 20 a 40
            oponente.recibirDano(dano);
            System.out.println(nombre + " lanza un ataque sigiloso con shurikens causando " + dano + " puntos de daño.");
            ataqueEspecialUsado = true;
        } else {
            System.out.println(nombre + " ya usó su ataque especial.");
        }
    }
}
