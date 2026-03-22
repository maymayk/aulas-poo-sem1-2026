package exeAgregacao1;

public class TestaLoja {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Mouse", 80);
        Produto p2 = new Produto(2, "Teclado", 120);
        Produto p3 = new Produto(3, "Monitor", 900);

        Carrinho carrinho = new Carrinho("Loja Tech");
        carrinho.addProduto(p1);
        carrinho.addProduto(p2);
        carrinho.addProduto(p3);

        carrinho.gerarItem(1, 2, 80);
        carrinho.gerarItem(2, 1, 120);

        carrinho.exibirCarrinho();
    }
}
