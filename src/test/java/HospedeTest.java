import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {

    @Test
    void deveRetornarPendenciaRecepcaoCheckout() {
        Hospede hospede = new Hospede();
        Recepcao.getInstancia().addHospedePendente(hospede);

        assertEquals(false, hospede.realizarCheckout());
    }

    @Test
    void deveRetornarPendenciaRestauranteCheckout() {
        Hospede hospede = new Hospede();
        Restaurante.getInstancia().addHospedePendente(hospede);

        assertEquals(false, hospede.realizarCheckout());
    }

    @Test
    void deveRetornarPendenciaLavanderiaCheckout() {
        Hospede hospede = new Hospede();
        Lavanderia.getInstancia().addHospedePendente(hospede);

        assertEquals(false, hospede.realizarCheckout());
    }

    @Test
    void deveRetornarHospedeSemPendenciaCheckout() {
        Hospede hospede = new Hospede();

        assertEquals(true, hospede.realizarCheckout());
    }

}
