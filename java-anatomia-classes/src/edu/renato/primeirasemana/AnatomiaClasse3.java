package edu.renato.primeirasemana;

public class AnatomiaClasse3 {

    public static void main(String[] args) {

        String primeiroNome = "Renato";
        String segundoNome = "Moreira";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}