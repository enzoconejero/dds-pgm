package modelo;

public class Hormiga {

    public static int maximaCarga(){ return 10; }

    private Posicion ubicacion;
    private TipoHormiga tipo;
    private int cargaAlimento;

    public Hormiga(Posicion ubicacion, TipoHormiga tipo) {
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.cargaAlimento=0;
    }

    public int getCargaAlimento(){
        return cargaAlimento;
    }

    public void mover(Posicion ubicacion){
        this.ubicacion=ubicacion;
    }

    public void extraerAlimento(Alimento alimento){
        mover(alimento.getPosicion());
        int extraido = maximaExtraccionDeAlimento(alimento);
        alimento.extraer(extraido);
        agregarAlimento(extraido);
    }

    public int maximaExtraccionDeAlimento(Alimento alimento){
        return Math.min(alimento.getReserva(), Hormiga.maximaCarga() - cargaAlimento);
    }

    public void agregarAlimento(int gramosRecolectados){
        cargaAlimento+=gramosRecolectados;
    }

    public int entregarAlimento(){
        return tipo.entregarAlimento(this);
    }

    public boolean estaAlLimite(){
        return cargaAlimento == Hormiga.maximaCarga();
    }

    public Posicion getUbicacion() {
        return ubicacion;
    }

    public void atacar(IIntruso atacante){

    }

}
