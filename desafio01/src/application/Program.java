package application;

import entities.Produtos;
import services.AdicionaFretePedido;
import services.CalculaDescontoPedido;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Código do pedido: ");
        Integer codigo = sc.nextInt();

        System.out.print("Valor do pedido: ");
        Double valorBase = sc.nextDouble();

        System.out.print("Valor do desconto: ");
        Double desconto = sc.nextDouble();

        Produtos produto = new Produtos(codigo,desconto,valorBase);

        CalculaDescontoPedido calculaDescontoPedido = new CalculaDescontoPedido();
        AdicionaFretePedido adicionaFretePedido = new AdicionaFretePedido();

        Double valorPedidoComDesconto = calculaDescontoPedido.desconto(valorBase,desconto);
        Double valorPedidoComFrete = adicionaFretePedido.retornaPedidoComFrete(valorPedidoComDesconto);

        System.out.printf("Código do Pedido: %d",produto.getCodigo());
        System.out.println();
        System.out.printf("Valor inicial do pedido: %.2f%n",produto.getValorBase());
        System.out.printf("Valor do pedido com desconto: %.2f%n",valorPedidoComDesconto);
        System.out.printf("Valor do pedido com frete: %.2f%n",valorPedidoComFrete);
    }
}
