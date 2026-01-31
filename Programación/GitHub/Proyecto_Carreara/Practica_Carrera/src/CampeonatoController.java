package controller;
import model.Campeonato;
import model.Carrera;
import model.Coche;
import java.util.Comparator;
public class CampeonatoController {
    private carreraController carreraController = new CarreraController();
    public void ejecutarCampeonato(Campeonato campeonato, int numCarreras, int kmCarrera){
        for (int i = 1; i <=numCarreras; i++ ){
            System.out.println("\n=== CARRERA" + i + " ===");
            for (Coche coche : campeonato.getCoches()){
                coche.resetKm();
            }
            Carrera carrera = new Carrera(kmCarrera, campeonato.getCoches());
            carreraController.simularCarrera(carrera);
            mostratClasificacion(campeonato);
        }
    }
    public void mostratClasificacion(Campeonato campeonato){
        campeonato.getCoches().sort(
                Comparator.comparingInt(Coche: : getPuntos).reversed());
        System.out.println("\n === CLASIFICACIÓN GENERAL ===");
        for (int i =0; i < campeonato.getCoches().size(); i++){
            Coche c = campeonato.getCoche().getNOmbre() + "(" + c.getPuntos() + "puntos)");

        }

        )
    }
}
