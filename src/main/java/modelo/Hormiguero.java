package modelo;

import java.util.Set;

public class Hormiguero {

    private Set<Hormiga> hormigas;
    private Punto ubicacion;
    private double alimento;
    private ModoDefensa modoDefensa;

    public Hormiguero(Punto ubicacion, ModoDefensa modoDefensa) {
        this.ubicacion = ubicacion;
        this.modoDefensa = modoDefensa;
        this.hormigas = new Set<Hormiga>();
        this.alimento = 0;
    }

    public void reclamarAlimento() {
        hormigas.forEach(h -> alimento += h.reclamarAlimento());
    }

    public void defender(Hormiga hormiga) {
        modoDefensa.defender(hormiga, this);
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

    public Punto getUbicacion() {
        return ubicacion;
    }

    public double getAlimento() {
        return alimento;
    }
    
}

