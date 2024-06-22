public class PessoaController {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setName("Daniel");
        professor.setCpf("1001010100");
        professor.setIdade(20);
        professor.setSalario(2000);

        Aluno aluno = new Aluno();
        aluno.setName("Luiz");
        aluno.setCpf("244");
        aluno.setIdade(20);
        aluno.setMatricula("202020");

        System.out.println(professor.imprimirPessoa());
        System.out.println(aluno.imprimirPessoa());
    }   
}
