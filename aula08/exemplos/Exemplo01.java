package exemplos;

import java.util.Stack;

public class Exemplo01 {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        System.out.println("Tamanho: " + pilha.size());
        System.out.println("Topo: " + pilha.peek());

        while (! pilha.isEmpty()) {
            System.out.println("Removendo: " + pilha.pop());
        }
    }
}
