public class AbstrataTecnicoIntegrado implements Abstrata {
    @Override
    public Diploma createDiploma() {
        return new DiplomaTecnicoIntegrado();
    }

    @Override
    public HistoricoEscolar createHistorico() {
        return new HistoricoTecnicoIntegrado();
    }
}
