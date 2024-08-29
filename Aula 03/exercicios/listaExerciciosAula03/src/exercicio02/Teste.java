// - Defina uma classe Celular com atributos como marca, modelo, e capacidadeBateria. Adicione métodos para ligar e desligar o celular.

package EXERCICIO02;

import EXERCICIO01.Livro;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Celular celular1 = new Celular("Motorola","G5", 100, 0);
        Scanner scanner = new Scanner(System.in);

        Integer ligaDesligaCelular;

        System.out.println("1-Liga Celular" + "\n" + "2-Desliga Celular");
        ligaDesligaCelular = scanner.nextInt();

        switch (ligaDesligaCelular){
            case 1:
                celular1.ligarCelular();
                break;

            case 2:
                celular1.desligarCelular();
                break;

            default:
                System.out.println("Opção Invalida");
        }

    }
}
