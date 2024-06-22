package PrimeiroModulo.construtor;

public class Construtor {   
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }


    public Construtor() {

    }

    public Construtor(int numero) {
        this.numero = numero;
    }
}
