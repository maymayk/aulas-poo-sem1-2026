package exeAgregacao1;

import java.util.ArrayList;

public class Carrinho {
    private String nomeLoja;
    private ArrayList<Produto> produtos;
    private ArrayList<ItemVenda> itensVenda;

    public Carrinho(String nomeLoja) {
        this.nomeLoja = nomeLoja;
        this.produtos = new ArrayList<>();
        this.itensVenda = new ArrayList<>();
    }
    //agregação
    public void addProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso");
    }
    public void exibirCarrinho() {
        System.out.println("Loja: " + nomeLoja);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
    public void gerarItem(int id, int qtd, float valor){
        ItemVenda item = new ItemVenda(id, qtd, valor);
        itensVenda.add(item);
    }
    public void removerItem(int id){
        for(int i = 0; i < itensVenda.size(); i++){
            if (itensVenda.get(i).getId() == id){
                itensVenda.remove(i);
                break;
            }
        }
    }

}
