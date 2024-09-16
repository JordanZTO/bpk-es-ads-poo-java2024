public class Teste8 {
    public static void main(String[] args) {
        Professor professor = new Professor("João", "Matemática", 3000.0);
        professor.darAula();
        professor.corrigirProvas();
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Salário: R$ " + professor.getSalario());
    }
}
