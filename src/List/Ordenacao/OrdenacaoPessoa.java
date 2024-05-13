package List.Ordenacao;

import java.util.*;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoaList);
        Collections.sort(pessoasOrdenadas);
        return pessoasOrdenadas;

    }


    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasOrdenadas = new ArrayList<>(pessoaList);
        Collections.sort(pessoasOrdenadas, new ComparatorPorAltura());
        return pessoasOrdenadas;
    }



}
