package modelo;

public class Alimento {
    private Posicion posicion;
    private int reserva;

    public Alimento(Posicion posicion, int reserva) {
        this.posicion = posicion;
        this.reserva = reserva;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public int getReserva() {
        return reserva;
    }
    public void extraer(int cantidad){
        if (cantidad>reserva){
            throw new RuntimeException();
        }
        reserva-=cantidad;
    }
}
