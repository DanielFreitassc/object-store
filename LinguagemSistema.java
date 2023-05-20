import java.lang.System;
import java.util.Locale;
import java.util.Locale.LanguageRange;

class LinguagemSistema{
    public static void main(String[] args){
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do computador é: ");
        System.out.println(idioma.toString());
    }
}