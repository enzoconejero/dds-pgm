package modelo;

public class Hormiga {

    public static int maximaCarga(){ return 10; }

    private Posicion ubicacion;
    private TipoHormiga tipo;
    private int cargaAlimento;
    private EstadoHormiga estado;

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

        estado.extraerAlimento(this, alimento);

    }

    public int maximaExtraccionDeAlimento(Alimento alimento){
        return Math.min(alimento.getReserva(), capacidadDeCarga() - cargaAlimento);
    }

    public void agregarAlimento(int gramosRecolectados){
        cargaAlimento+=gramosRecolectados;
    }

    public int entregarAlimento(){
        return estado.entregarAlimento(this);
    }

    public void descansar(){
        estado.descansar(this);
    }

    public boolean estaAlLimite(){
        return cargaAlimento == capacidadDeCarga();
    }

    public Posicion getUbicacion() {
        return ubicacion;
    }

    public void atacar(IIntruso atacante){

    }

    public void setEstado(EstadoHormiga estado) {
        this.estado = estado;
    }

    public TipoHormiga getTipo() {
        return tipo;
    }

    public int capacidadDeCarga(){
        return estado.getCapacidadCarga();
    }

}
