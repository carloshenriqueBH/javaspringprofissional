package services;

public class CalculaDescontoPedido {


    public Double desconto(double valorPedido, double valorDesconto) {
        return (valorPedido - (valorPedido * (valorDesconto)/100));

    }
}
