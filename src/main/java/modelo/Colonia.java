package modelo;

import java.util.HashSet;

public class Colonia implements IPoblacionHormigas {

    private HashSet<IPoblacionHormigas> poblacion;

    public void agregar(IPoblacionHormigas poblacion) {
        this.poblacion.add(poblacion);
    }

    public void reclamarAlimento() {
        poblacion.forEach(p -> p.reclamarAlimento());
    }

    public void defender(IIntruso intruso) {
        poblacion.forEach(p -> p.defender(intruso));
    }

    public int poblacion() {
        return poblacion.stream().mapToInt(p -> p.poblacion()).sum();
    }

}
