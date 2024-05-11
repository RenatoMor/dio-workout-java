package edu.renato.primeirasemana;

public class AnatomiaClasse2 {
    public static void main(String[] args) {
        // Declaração de variáveis
        int idade = 30;
        String nome = "João";
        double peso = 90.5;
        boolean fumante = false;

        // Impressão de variáveis
        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Fumante: " + fumante);
    }

    // Declaração inválida de variáveis

    // ! int numero&um = 1; //Os únicos símbolos permitidos são _ e $
    // ! int 1numero = 1; //Uma variável não pode começar com númerico
    // ! int numero um = 1; //Não pode ter espaço no nome da variável
    // ! int long = 1; //long faz parte das palavras reservadas da linguagem

    // Declaração válida de variáveis
    int numero$um = 1;
    int numero1 = 1;
    int numeroum = 1;
    int longo = 1;

    // ! Estrutura

    // ! Tipo NomeBemDefinido = Atribuicao (opcional em alguns casos)

    // ! Exemplo

    // ! int idade = 23;
    // ! double altura = 1.62;
    // ! Dog spike; //observe que aqui a variável spike não tem valor, é normal

}
