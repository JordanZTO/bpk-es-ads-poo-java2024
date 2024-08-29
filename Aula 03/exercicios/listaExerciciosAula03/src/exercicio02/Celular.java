package EXERCICIO02;

public class Celular {

    public String marca;
    public String modelo;
    public Integer capacidadeBateria;
    public Integer cargaBateria;

    public Celular(String marca, String modelo, Integer capacidadeBateria, Integer cargaBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.cargaBateria = cargaBateria;
    }

    public void ligarCelular() {
        if (cargaBateria <= 0) {

            System.out.println("Sem bateria!" + "Porcentagem de bateria: " + cargaBateria);
            System.out.println("Desligando celular!");
        } else {
            System.out.println(marca + " " + modelo + " " + capacidadeBateria + " " + "Porcentagem de bateria: " + cargaBateria);
            System.out.println("Ligando o celular...");
            System.out.println("Celular Ligado!");
        }
    }

        public void desligarCelular() {
            System.out.println("Desligando celular!");
        }
    }
