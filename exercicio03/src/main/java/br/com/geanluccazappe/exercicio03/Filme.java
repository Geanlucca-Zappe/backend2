package br.com.geanluccazappe.exercicio03;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
@Scope("prototype")
public class Filme extends Indicacao {
    private String nomeFilme;
    private String genero;

    //getters e setters para nomeFilme
    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    //getters e setters para genero
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
            "nomeFilme='" + nomeFilme + '\'' +
            ", genero='" + genero + '\'' +
            ", elegivel=" + isElegivel() +
            ", numeroDeIndicacoes=" + getNumeroDeIndicacoes() +
            '}';
    }
}