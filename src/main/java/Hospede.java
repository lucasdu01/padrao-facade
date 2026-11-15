public class Hospede {

    public boolean realizarCheckout() {
        return HospedeFacade.verificarPendenciasCheckout(this);
    }
}
