package List.Ordenacao;

public class TesteOrdenacaoPessoa {

    public static void main(String[] args) {

        OrdenacaoPessoa ordenacaoPessoa =  new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.65);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 75, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 44, 1.72);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 30, 1.55);
        ordenacaoPessoa.adicionarPessoa("Nome 5", 18, 1.60);

        System.out.println("Ordenação por Altura: " + ordenacaoPessoa.ordenarPorAltura());
        System.out.println("Ordenação por Idade: " + ordenacaoPessoa.ordenarPorIdade());


    }
}
