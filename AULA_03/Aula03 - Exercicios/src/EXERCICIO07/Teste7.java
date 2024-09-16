public class Teste7 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", 12345, "Engenharia");

        double[] notas = {7.5, 8.0, 9.0};
        double media = aluno1.calcularMedia(notas);

        System.out.println("Média do aluno " + aluno1.nome + ": " + media);
    }
}
