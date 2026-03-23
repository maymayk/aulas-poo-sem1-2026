package cineTeatro;

import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {

        // Filmes
        Filme f1 = new Filme(1, "Batman", "Ação", 120);
        Filme f2 = new Filme(2, "Duna", "Ficção", 150);

        // Sessão
        Sessao sessao = new Sessao(
                1,
                LocalDateTime.of(2026, 7, 20, 20, 0),
                1
        );

        // AGREGAÇÃO
        sessao.vincularFilme(f1);

        // COMPOSIÇÃO
        sessao.venderIngresso(1, "A1", "Inteira", 30f);
        sessao.venderIngresso(2, "A2", "Meia", 15f);
        sessao.venderIngresso(3, "A3", "Inteira", 30f);

        // Saída
        sessao.mostrarSessao();
    }
}