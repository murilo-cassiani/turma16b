package exemplos.exemplo03;

/**
 * Pessoa
 */
public class Pessoa {
    // atributos = características, possui, é
    String nome;

    // métodos - ação, comportamento
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

    // construtor
    Pessoa(String nome) {
        this.nome = nome; // this = o próprio objeto
    }
}