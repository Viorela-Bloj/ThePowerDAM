package model;

public class Coches {
    private String marca;
    private String modelo;
    private int kmRecorridos;
    private int puntos;

    public Coches(String marca, String modelo){
        this.marca=marca;
        this.modelo= modelo;
        this.kmRecorridos =0;
        this.puntos = 0;
    }
    public void sumaKm(int km){
        this.kmRecorridos += km;
    }
    public void restKm(){
        this.kmRecorridos = 0;
    }

    public void sumarPuntos(int puntos){
        this.puntos += puntos;
    }

    public int getKmRecorridos(){
        return kmRecorridos;
    }
    public int getPuntos(){
        return puntos;
    }
    public String getNombre(){
        return marca + "" + modelo;
    }

}

