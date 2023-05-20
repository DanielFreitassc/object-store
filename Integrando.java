import java.util.Date;
import java.util.Locale;
import java.lang.System;
import java.awt.Toolkit;
import java.awt.Dimension;
class HoraData{
    public static void main(String[] args){
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tela.getWidth();
        int altura = (int) tela.getHeight();
        Date hora = new Date();
        Locale local = Locale.getDefault();
        System.out.println("Info computador: ");
        System.out.println("Data/Hora/Ano:" + hora);
        System.out.println("Idioma:" + local);
        System.out.println("-----------------");
        System.out.println("Resolução Da Tela:");
        System.out.println("Largura:"+largura +" Px");
        System.out.println("Altura:" + altura+" Px");
    }
}