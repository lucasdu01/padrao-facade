public class Restaurante extends Setor {

    private static Restaurante restaurante = new Restaurante();

    private Restaurante() {};

    public static Restaurante getInstancia() {
        return restaurante;
    }
}
