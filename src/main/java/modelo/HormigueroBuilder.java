package modelo;

import java.util.HashSet;

public class HormigueroBuilder {
    private ModoDefensa modoDefensa;
    private Posicion ubicacion;
    private HashSet <Hormiga> hormigas;

    public HormigueroBuilder() {
        hormigas= new HashSet<>();
        ubicacion=new Posicion(0,0);
    }

    public void setModoDefensa(ModoDefensa modoDefensa) {
        this.modoDefensa = modoDefensa;
    }

    public void setPosicion(Posicion posicion) {
        this.ubicacion = posicion;
    }

    public void agregarHormiga(){
        hormigas.add(new Hormiga(ubicacion,new Obrera()));
    }

    public Hormiguero contruirHormiguero(){
        if(modoDefensa==null){
            throw new RuntimeException();
        }
        if ((ubicacion.getX()==0)&&(ubicacion.getY()==0)){
            throw new RuntimeException();
        }
        if(hormigas.size()==0){
            throw new RuntimeException();
        }
        return new Hormiguero(ubicacion,modoDefensa,hormigas);

    }

}
