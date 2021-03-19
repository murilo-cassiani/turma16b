package exercicios.exercicio05;

public class AppEbook {
    public static void main(String[] args) {
        Ebook dom = new Ebook("Dom Casmurro", "Machado de Assis", 500);

        dom.mostrarCapa();

        System.out.println("Capa é página: " + dom.exibirPagina());

        dom.irParaPagina(300);
        dom.avancarPagina();
        dom.avancarPagina();
        dom.retrocederPagina();
        System.out.println("Estou na página: " + dom.exibirPagina());

        dom.irParaPagina(5000);
        System.out.println("Estou na página: " + dom.exibirPagina());

        dom.irParaPagina(-10);
        System.out.println("Estou na página: " + dom.exibirPagina());

        dom.irParaPagina(499);
        dom.avancarPagina();
        System.out.println("Estou na página: " + dom.exibirPagina());

        dom.avancarPagina();
        dom.avancarPagina();
        dom.avancarPagina();
        System.out.println("Estou na página: " + dom.exibirPagina());

        dom.irParaPagina(1);
        dom.retrocederPagina();
        System.out.println("Estou na página: " + dom.exibirPagina());

        dom.retrocederPagina();
        dom.retrocederPagina();
        dom.retrocederPagina();
        System.out.println("Estou na página: " + dom.exibirPagina());
    }
}
