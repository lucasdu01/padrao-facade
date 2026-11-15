public class Recepcao extends Setor {

    private static Recepcao recepcao = new Recepcao();

    private Recepcao() {};

    public static Recepcao getInstancia() {
        return recepcao;
    }

}
