package application;

import entities.Produtos;
import services.AdicionaFretePedido;
import services.CalculaDescontoPedido;
import services.CalculaValorLiquido;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Código do pedido: ");
        Integer numeroPedido = sc.nextInt();

        System.out.print("Valor do pedido: ");
        Double valorPedido = sc.nextDouble();

        System.out.print("Valor do desconto: ");
        Double valorDesconto = sc.nextDouble();

        Produtos produtos = new Produtos(numeroPedido,valorDesconto);
        CalculaDescontoPedido calculaDescontoPedido = new CalculaDescontoPedido();
        AdicionaFretePedido adicionaFretePedido = new AdicionaFretePedido();
        CalculaValorLiquido calculaValorLiquido = new CalculaValorLiquido();

        Double valorPedidoComDesconto = calculaDescontoPedido.desconto(valorPedido,valorDesconto);

        System.out.printf("Valor do pedido com desconto: %.2f%n",valorPedidoComDesconto);

        Double valorPedidoComFrete = adicionaFretePedido.retornaPedidoComFrete(valorPedidoComDesconto);
        System.out.printf("Valor do pedido com frete: %.2f%n",valorPedidoComFrete);

    }

}
