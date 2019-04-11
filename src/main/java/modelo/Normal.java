package modelo;

public class Normal extends EstadoHormiga {

    public Normal() {
        super(10);
    }

    @Override
    public void descansar(Hormiga hormiga){
        hormiga.setEstado(new Exaltada());
    }

    @Override
    public void extraerAlimento(Hormiga hormiga, Alimento alimento){
        super.extraerAlimento(hormiga, alimento);
        cantidadRecolecciones++;

        if(cantidadRecolecciones == 10){
            hormiga.setEstado(new Cansada());
        }
    }

}
