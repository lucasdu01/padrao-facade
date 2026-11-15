import java.util.ArrayList;
import java.util.List;

public abstract class Setor {

    private List<Hospede> hospedesComPendencia = new ArrayList<Hospede>();

    public void addHospedePendente(Hospede hospede) {
        this.hospedesComPendencia.add(hospede);
    }

    public boolean verificarHospedeComPendencia(Hospede hospede) {
        return this.hospedesComPendencia.contains(hospede);
    }

}
