package exercicios.exercicio05;

public class Ebook {
    private String titulo, autor;
    private int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
    }

    private void folheiaPagina(int passo) {
        int paginaNova = paginaAtual + passo;
        
        if (paginaNova >= 0 && paginaNova <= totalPaginas) {
            paginaAtual = paginaNova;
        }
    }

    public void avancarPagina() {
        folheiaPagina(1);
    }

    public void retrocederPagina() {
        folheiaPagina(-1);
    }

    public void irParaPagina(int pagina) {
        folheiaPagina(pagina - paginaAtual);
    }

    public int exibirPagina() {
        return paginaAtual;
    }

    public void mostrarCapa() {
        System.out.printf("Título: %s\n", titulo);
        System.out.printf("Autor: %s\n", autor);
        System.out.printf("Páginas: %d\n", totalPaginas);
    }
}
