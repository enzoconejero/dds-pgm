package modelo;

public abstract class EstadoHormiga {

    protected int cantidadRecolecciones;
    protected int capacidadCarga;

    public EstadoHormiga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
        cantidadRecolecciones = 0;
    }

    public void extraerAlimento(Hormiga hormiga, Alimento alimento){
        hormiga.mover(alimento.getPosicion());
        int extraido = hormiga.maximaExtraccionDeAlimento(alimento);
        alimento.extraer(extraido);
        hormiga.agregarAlimento(extraido);
    }

    public int entregarAlimento(Hormiga hormiga){
        return hormiga.getTipo().entregarAlimento(hormiga);
    }

    public abstract void descansar(Hormiga hormiga);

    public int getCapacidadCarga() {
        return capacidadCarga;
    }
}
