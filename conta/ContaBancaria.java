package conta;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;   

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular; 
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    void depositar(double valor) {
        if(valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de R$" + valor + ". Saldo atual de R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    void sacar(double valor) {
        if(valor <= saldo) {
            saldo = saldo -valor;
            System.out.println("Saque de " + valor +". Saldo atual de " + saldo + " R$");
        }
    }
}
