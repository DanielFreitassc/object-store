package PrimeiroModulo.conta;

public class ControllerConta {
    public static void main(String[] args) {
        
        ContaBancaria contaBancaria = new ContaBancaria();  
        contaBancaria.setNumero("1000");
        contaBancaria.setTitular("Daniel");
        contaBancaria.setSaldo(100);

        contaBancaria.depositar(50);
        contaBancaria.sacar(10);
    }
}
