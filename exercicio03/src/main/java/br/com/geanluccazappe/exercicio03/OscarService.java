package br.com.geanluccazappe.exercicio03;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class OscarService {
    private List<Indicacao> indicados = new ArrayList<>();

    public void adicionarIndicado(Indicacao indicado) {
        if (indicado.isElegivel()) {
            indicado.incrementarIndicacoes();
            indicados.add(indicado);
        }
    }

    public List<Indicacao> getIndicados() {
        return indicados;
    }

    //printa a lista de indicados
    public void mostrarListaIndicados() {
        for (Indicacao indicado : indicados) {
            System.out.println(indicado);
        }
    }
}
