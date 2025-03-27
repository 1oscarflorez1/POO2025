public class Cuenta {

    private int numero;
    private String tipo;
    private double saldo;

    public Cuenta(int numero, string tipo, double saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;

    }

    public String toString() {
        return "cuenta{ Nombre: " + numero +
                " tipo: " + tipo +
                " Saldo: " + saldo + "}";
    }
}