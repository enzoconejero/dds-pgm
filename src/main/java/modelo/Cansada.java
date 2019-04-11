package modelo;

public class Cansada extends EstadoHormiga{

    public Cansada() {
        super(0);
    }

    @Override
    public void descansar(Hormiga hormiga) {
        hormiga.setEstado(new Normal());
    }

    @Override
    public int entregarAlimento(Hormiga hormiga){
        return 0;
    }

    @Override
    public void extraerAlimento(Hormiga hormiga, Alimento alimento){

        super.extraerAlimento(hormiga, alimento);
        cantidadRecolecciones++;

        if(cantidadRecolecciones == 15){
            hormiga.setEstado(new Normal());
        }

    }

}

