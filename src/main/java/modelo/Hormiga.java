package modelo;

public class Hormiga {
    private Posicion posicion;
    private TipoHormiga tipo;
    private int cargaAlimento;
    public Hormiga(Posicion posicion, TipoHormiga tipo) {
        this.posicion = posicion;
        this.tipo = tipo;
        this.cargaAlimento=0;
    }

    public int getCargaAlimento(){
        return cargaAlimento;
    }

    public void mover(Posicion posicion){
        this.posicion=posicion;
    }

    public void extraerAlimento(Alimento alimento){
        this.mover(alimento.getPosicion());
        alimento.extraer(this.maximaExtraccionDeAlimento(alimento));
        this.agregarAlimento(this.maximaExtraccionDeAlimento(alimento));
    }

    public int maximaExtraccionDeAlimento(Alimento alimento){
        return Math.min(alimento.getReserva(),10-this.cargaAlimento);
    }

    public void agregarAlimento(int gramosRecolectados){
        cargaAlimento+=gramosRecolectados;
    }

    public void entregarAlimento(){
        this.tipo.entregarAlimento(this);
    }




}
