package services;

public class AdicionaFretePedido {
    public Double retornaPedidoComFrete(double valorPedidoComDesconto){
        double frete;
        if (valorPedidoComDesconto < 100.00){
            frete = 20.00;
        }
        else {
            if ((valorPedidoComDesconto >=100.00) && (valorPedidoComDesconto<=200)){
                frete = 12.00;
            }
            else {
                frete =0;
            }
         }

        return (valorPedidoComDesconto + frete);
    }
}
