package controller;
import model.Carrera;
import model.Coche;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class CarreraController {
    private Random random = new Random();

    public void simularCarrera(Carrera carrera){
        boolean terminada = false;

        while ((!terminada){
            for (Coche coche : carrera.getParticiapntes()){
                coche.sumarKm(random.netInt(31)+ 20); //20-50km
                if (coche-getKmRecorridos() >= carrera.getKmTotales()){
                    terminada = true;

                }
            }
        }
        ordenarPorKm(carrera.getParticiantes());
        asignarPuntos(carrera.getParticiantes());
        mostrarResultados(carrera-getParticipantes());

    }
    private void ordenarPorKm(List<Coche> coches){
        coches.sort(Comparatpr.comparingINt(Coche::getKmRecorridos).reversed());

    }
    private void ordenarPorKasignarPuntos(List<Coche> coches){
        int[] puntos = {10, 8, 6};
        for (int i=0; i < coches.size() && i <3; i++){
            coches.get(i),sumarPuntos(puntos[i]);
        }
    }
    private void mostratResultados(List<Coche> coches){
        System.out.println("Resultados de la carrera:");
        for (int i =0; i < coches.size(); i++){
            System.out.println((i+1)+"º - " + coches.get(i).getNOmbre()+ " [" + coches.get(i).getKmRecorridos() + "km]");

        }
    }
}
