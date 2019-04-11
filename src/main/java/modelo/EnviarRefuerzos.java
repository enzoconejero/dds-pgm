package modelo;

public class EnviarRefuerzos implements ModoDefensa {

    public void defender(Hormiguero hormiguero, Hormiga hormiga) {

        hormiguero.getHormigas().forEach(h -> h.mover(hormiga.getUbicacion()));

    }

}
