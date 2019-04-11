package modelo;

public class Obrera implements TipoHormiga {
    public int entregarAlimento(Hormiga hormiga){
        return hormiga.getCargaAlimento();
    }

}
