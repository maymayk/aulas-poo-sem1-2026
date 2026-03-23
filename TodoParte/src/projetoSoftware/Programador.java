package projetoSoftware;

public class Programador {
    private int id;
    private String nome;
    private String langPrincipal;

    public Programador() {
    }

    public Programador(int id, String nome, String langPrincipal) {
        this.id = id;
        this.nome = nome;
        this.langPrincipal = langPrincipal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLangPrincipal() {
        return langPrincipal;
    }

    public void setLangPrincipal(String langPrincipal) {
        this.langPrincipal = langPrincipal;
    }

    @Override
    public String toString() {
        return "Programador: " + id +
                "\nNome: " + nome +
                "\nLinguagem principal: " + langPrincipal;
    }
}