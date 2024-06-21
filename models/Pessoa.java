package models;

public class Pessoa {
    private String name;
    private int idade;
    private String cpf;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    String imprimirPessoa(int indice) {
        return "Nome: "+name+" Idade: "+idade+" CPF: "+cpf+indice;
    }
}
