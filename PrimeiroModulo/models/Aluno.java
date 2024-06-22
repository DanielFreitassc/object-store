package PrimeiroModulo.models;

public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    String imprimirPessoa() {
        System.out.println(super.imprimirPessoa());
        return "Você é aluno";
    }
}
