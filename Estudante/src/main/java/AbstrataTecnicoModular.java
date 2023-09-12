public class AbstrataTecnicoModular implements Abstrata {
    @Override
    public Diploma createDiploma() {
        return new DiplomaTecnicoModular();
    }

    @Override
    public HistoricoEscolar createHistorico() {
        return new HistoricoTecnicoModular();
    }
}
