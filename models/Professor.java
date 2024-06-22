
// Usando herança 
public class Professor extends Pessoa{    
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Sobrescreve usando conceitos de polimorfismo
    String imprimirPessoa() {
        System.out.println(super.imprimirPessoa());
        return "Você é professor";
    }
    
}