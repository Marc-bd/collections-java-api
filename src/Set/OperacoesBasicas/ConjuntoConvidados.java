package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado convidado : this.convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }

        if (convidadoParaRemover != null) {
            this.convidadoSet.remove(convidadoParaRemover);
        }

    }

    public int contarConvidados(){
        return this.convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }


}
