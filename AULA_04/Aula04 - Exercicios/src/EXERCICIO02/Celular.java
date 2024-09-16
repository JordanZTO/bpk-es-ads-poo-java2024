package EXERCICIO02;

public class Celular {

    private String marca;
    private String modelo;
    private Integer capacidadeBateria;
    private Integer cargaBateria;
    private Integer ligaDesliga;

    public Celular(String marca, String modelo, Integer capacidadeBateria, Integer cargaBateria, Integer ligaDesliga) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.cargaBateria = cargaBateria;
        this.ligaDesliga = ligaDesliga;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public Integer getCargaBateria() {
        return cargaBateria;
    }

    public void setLigaDesliga(Integer ligaDesliga) {
        this.ligaDesliga = ligaDesliga;

        switch (ligaDesliga) {
            case 1:
                System.out.println(marca + " " + modelo + " " + capacidadeBateria + " " + "Porcentagem de bateria: " + cargaBateria);
                System.out.println("Ligando o celular...");
                System.out.println("Celular Ligado!");
                break;

            case 2:
                System.out.println("Porcentagem de bateria: " + cargaBateria);
                System.out.println("Desligando celular!");
                break;
        }
    }
}
