package edificio;

import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList<Apartamento> apartamentos;

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    // 👇 REGRA DO EXERCÍCIO
    public void construirApartamento(int num, int andar){
        Apartamento ap = new Apartamento(num, andar);
        apartamentos.add(ap);
    }

    public void listarApartamentos(){
        for (Apartamento ap : apartamentos){
            System.out.println(ap);
        }
    }
}