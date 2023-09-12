import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

public class EstudanteTest {

    @Test
    void deveEmitirHistoricoTecnicoIntegrado() {
        Abstrata abstrata = new AbstrataTecnicoIntegrado();
        Estudante estudante = new Estudante(abstrata);
        Assert.assertEquals("Histórico de Tecnico Integrado", estudante.emitirHistorico());
    }

    @Test
    void deveEmitirHistoricoTecnicoModular() {
        Abstrata abstrata = new AbstrataTecnicoModular();
        Estudante estudante = new Estudante(abstrata);
        assertEquals("Histórico de Tecnico Modular", estudante.emitirHistorico());
    }


    @Test
    void deveEmitirDiplomaTecnicoIntegrado() {
        Abstrata abstrata = new AbstrataTecnicoIntegrado();
        Estudante estudante = new Estudante(abstrata);
        Assert.assertEquals("Diploma de Tecnico Integrado", estudante.emitirDiploma());
    }

    @Test
    void deveEmitirDiplomaTecnicoModular() {
        Abstrata abstrata = new AbstrataTecnicoModular();
        Estudante estudante = new Estudante(abstrata);
        Assert.assertEquals("Diploma de Tecnico Modular", estudante.emitirDiploma());
    }

}
