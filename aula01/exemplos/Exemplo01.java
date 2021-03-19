package exemplos;

/*
Comentário de bloco
Autor / data / licença
*/

public class Exemplo01 {

    public static void main(String[] args) {
        System.out.print("Olá mundo! ");
        System.out.println("Primeiro \nprograma."); // \n é quebra de linha

        System.out.println( "2 + 3" );
        System.out.println( 2 + 3 );

        System.out.println("Reposta = " + 2 + 3);
        System.out.println("Reposta = " + (2 + 3)); // () altera a prioridade de execução

        System.out.println("Quanto é 2 + 3?\nReposta: " + (2 + 3));
    }
}