package modelo;

import java.util.HashSet;
import java.util.Set;

public class Hormiguero implements IPoblacionHormigas {

    private Set<Hormiga> hormigas;
    private Posicion ubicacion;
    private int alimento;
    private ModoDefensa modoDefensa;

    public Hormiguero(Posicion ubicacion, ModoDefensa modoDefensa) {
        this.ubicacion = ubicacion;
        this.modoDefensa = modoDefensa;
        this.hormigas = new HashSet<Hormiga>();
        this.alimento = 0;
    }

    public void reclamarAlimento() {
        hormigas.forEach(h -> alimento += h.entregarAlimento());
    }

    public void defender(Hormiga hormiga) {
        modoDefensa.defender(this, hormiga);
    }

    public void defender(IIntruso intruso){
        hormigas.forEach(h -> h.atacar(intruso));
    }

    public int poblacion() {
        return hormigas.size();
    }

    public void agregarHormiga(Hormiga hormiga) {
        hormigas.add(hormiga);
    }

    public Set<Hormiga> getHormigas() {
        return hormigas;
    }

    public Posicion getUbicacion() {
        return ubicacion;
    }

    public int getAlimento() {
        return alimento;
    }
    
}

