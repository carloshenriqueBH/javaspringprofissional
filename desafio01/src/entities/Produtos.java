package entities;

public class Produtos {

    private Integer codigo;
    private Double valorDesconto;

    public Produtos() {
    }

    public Produtos(Integer codigo, Double valorDesconto) {
        this.codigo = codigo;
        this.valorDesconto = valorDesconto;

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
}
