package projetoSoftware;

import java.util.ArrayList;

public class Projeto {
    private int id;
    private String nomeProjeto;
    private ArrayList<Programador> programadores;

    public Projeto() {this.programadores = new ArrayList<>();
    }

    public Projeto(int id, String nomeProjeto, ArrayList<Programador> programadores) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programadores = new ArrayList<>(programadores);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public ArrayList<Programador> getProgramadores() {
        return programadores;
    }

    public void setProgramadores(ArrayList<Programador> programadores) {
        this.programadores = programadores;
    }

    public void addProgramador(Programador p) {
        this.programadores.add(p);
    }

    public void listarProgramadores(){
        for (Programador programador : programadores){
            System.out.println(programador);
        }
    }
    @Override
    public String toString() {
       String resultado = "Projeto: " + id +
                "\nNome do projeto: " + nomeProjeto +
                "\nProgramadores:\n";
        for (Programador p : programadores){
            resultado += p + "\n\n";
        }

        return resultado;
    }
}