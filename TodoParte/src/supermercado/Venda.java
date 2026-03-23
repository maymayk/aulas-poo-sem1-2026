package supermercado;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente; // agregação
    private ArrayList<ItemVenda> itens; // composição

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    // 👇 cria o ItemVenda dentro (COMPOSIÇÃO)
    public void adicionarItem(int id, int quantidade, Produto produto){
        ItemVenda item = new ItemVenda(id, quantidade, produto);
        itens.add(item);
    }

    public double calcularTotal(){
        double total = 0;
        for (ItemVenda item : itens){
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void mostrarVenda(){
        System.out.println(cliente);

        for (ItemVenda item : itens){
            System.out.println(item);
        }

        System.out.println("Total: R$" + calcularTotal());
    }
}
