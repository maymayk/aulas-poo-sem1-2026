package sistemaBiblioteca;

import java.time.LocalDateTime;

public class TestaEmprestimo {
    public static void main(String[] args) {
        Leitor leitor = new Leitor(1234, "Maria Antonia");
        Livro livro = new Livro(1423, "Alice no país das maravilhas", "Fulano de tal");
        Emprestimo empre1 = new Emprestimo(leitor, livro);
        System.out.println(empre1.toString());
    }
}
