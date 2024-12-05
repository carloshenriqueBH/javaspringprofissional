package entities;

public class Produtos {

    private Integer codigo;
    private Double desconto;
    private Double valorBase;

    public Produtos() {
    }

    public Produtos(Integer codigo, Double desconto, Double valorBase) {
        this.codigo = codigo;
        this.desconto = desconto;
        this.valorBase = valorBase;
    }


    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValorBase() {
        return valorBase;
    }

    public void setValorBase(Double valorBase) {
        this.valorBase = valorBase;
    }
}