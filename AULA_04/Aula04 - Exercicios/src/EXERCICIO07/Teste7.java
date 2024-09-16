public class Teste7 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria", 123456, "Engenharia");
        double[] notas = {8.5, 7.0, 9.0};
        double media = aluno.calcularMedia(notas);
        System.out.println("Média do aluno " + aluno.getNome() + ": " + media);
    }
}
