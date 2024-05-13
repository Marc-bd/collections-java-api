package List.Pesquisa;

public class TesteCatalogoLivros {

    public static void main(String[] args) {

        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1", 2024 );
        catalogo.adicionarLivro("Livro 1", "Autor 1", 2020 );
        catalogo.adicionarLivro("Livro 2", "Autor 2", 1992 );
        catalogo.adicionarLivro("Livro 3", "Autor 3", 2005 );
        catalogo.adicionarLivro("Livro 4", "Autor 4", 2015 );
        catalogo.adicionarLivro("Livro 5", "Autor 5", 2010 );
        catalogo.adicionarLivro("Livro 6", "Autor 6", 1999 );


        System.out.println("Pesquisa de livro por autor `Autor 1`: " + catalogo.pesquisarPorAutor("Autor 1"));

        System.out.println("Pesquisa de livro pro titulo `Livro 1`: " +   catalogo.pesquisarPorTitulo("Livro 1"));

        System.out.println("Pesquisa de livro por intervalo de ano `1991 - 2017`: " + catalogo.pesquisarPorIntervaloAnos(1991, 2017));



    }

}
