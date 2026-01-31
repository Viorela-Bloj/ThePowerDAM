
import controller.CampeonatoController;
import model.Campeonato;
import model.Coches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        List<Coche> coches = new ArrayList<>();
        System.out.println("Número de cocher");
        int numCoches = sc.nextInt();
        sc.nextLine();

        for (int i =0; i <numCoches; i++){
            System.out.println("Marca del coche " + (i +1)+ ":");
            String marca = sc.nextLine();
            coches.add(new Coche(marca,modelo));
        }
        System.out.println("Número de carreras: ");
        int numCarreras = sc.nextInt();
        System.out.println("Km por carrera: ");
        int kmCarrera = sc.nextInt();
        Campeonato campeonato = new Campeonato(coches);
        controller.ejecutarCampeonato(campeonato, numCarreras, kmCarrera);


    }
}


