package model;
import java.util.List;
public class Carrera {
    private int kmTotales;
    private List<Coche> participantes;

    public Carrera(int kmTotales, List<Coche> participantes) {
        this.kmTotales = kmTotales;
        this.participantes = participantes;
    }
    public int getKmTotales(){
        return kmTotales;
    }
    public List<Coche> getParticipantes(){
        return participantes;
    }

}
