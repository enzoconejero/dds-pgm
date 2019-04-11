package modelo;

public class PedirRegresar implements ModoDefensa{

    public void defender(Hormiguero hormiguero, Hormiga hormiga) {
        hormiga.mover(hormiguero.getUbicacion());
    }

}
