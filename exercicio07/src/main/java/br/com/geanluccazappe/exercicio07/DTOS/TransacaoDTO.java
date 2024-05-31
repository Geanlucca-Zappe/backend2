package br.com.geanluccazappe.exercicio07.DTOS;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class TransacaoDTO {
    @NotNull(message = "O nome do pagador não pode ser nulo")
    @Size(min = 1, max = 100, message = "O nome do pagador deve ter entre 1 e 100 caracteres")
    private String pagador;

    @NotNull(message = "O nome do recebedor não pode ser nulo")
    @Size(min = 1, max = 100, message = "O nome do recebedor deve ter entre 1 e 100 caracteres")
    private String recebedor;

    @NotNull(message = "A quantidade não pode ser nula")
    @Positive(message = "A quantidade deve ser maior do que 0")
    private Double quantidade;
    public String getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }

    public String getPagador() {
        return pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
}
