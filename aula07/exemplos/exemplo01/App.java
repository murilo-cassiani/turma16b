package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Fernando", 2000);
        Funcionario f2 = new Funcionario();
        Gerente g = new Gerente("Amanda", 3000, 10);

        // g.nome = "Fernando";
        System.out.println(g.exibir());
        System.out.println(f.exibir());

        g.aumento(5);
        System.out.println(g.exibir());
        f.aumento(-10);
        System.out.println(f.exibir());

        System.out.println(f);
    }
}
