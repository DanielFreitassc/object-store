import java.awt.Toolkit;
import java.awt.Dimension;

class ResTela{
    public static void main(String[] args){
        System.out.print("Resolução da sua tela é: ");
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        System.out.println("Largura: "+ largura +"Px" + " Altura: "+ altura+"Px");
        System.out.println();
    }
}
