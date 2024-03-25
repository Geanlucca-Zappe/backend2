package br.com.geanluccazappe.exercicio03;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;


@Component
@Scope("prototype")
public class Ator extends Indicacao {
    private String nome;
    private String nacionalidade; // novo atributo

    //getters e setters para o nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //getters e setters para a nacionalidade
    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Ator{" +
            "nome='" + nome + '\'' +
            ", nacionalidade='" + nacionalidade + '\'' +
            ", elegivel=" + isElegivel() +
            ", numeroDeIndicacoes=" + getNumeroDeIndicacoes() +
            '}';
    }
}