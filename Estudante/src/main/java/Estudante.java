public class Estudante {
    private Diploma diploma;
    private HistoricoEscolar historico;

    public Estudante (Abstrata abstrata) {
        this.diploma = abstrata.createDiploma();
        this.historico = abstrata.createHistorico();
    }

    public String emitirDiploma() {
        return this.diploma.emitir();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }
}
