package exemplos.exemplo03;

public class AppPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Emerson"); // instaciação do objeto, criando objeto
        Pessoa p2 = new Pessoa("Amanda");

        // p.nome = "Emerson";
        p.apresentar();
        
        // p2.nome = "Amanda";
        p2.apresentar();
    }
}
