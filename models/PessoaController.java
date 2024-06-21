package models;

public class PessoaController {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Daniel");
        pessoa.setCpf("1001010100");
        pessoa.setIdade(20);
        
        System.out.println(pessoa.imprimirPessoa(1));
    }
}
