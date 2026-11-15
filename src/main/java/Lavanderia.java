public class Lavanderia extends Setor {

    private static Lavanderia lavanderia = new Lavanderia();

    private Lavanderia() {};

    public static Lavanderia getInstancia() {
        return lavanderia;
    }
}
