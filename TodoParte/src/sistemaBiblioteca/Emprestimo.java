package sistemaBiblioteca;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private Leitor leitor;
    private Livro livro;
    private LocalDateTime dateEmprestimo;
    private LocalDateTime dataDevolucaoPrevista;

    public Emprestimo() {
    }

    public Emprestimo(Leitor leitor, Livro livro) {
        this.dateEmprestimo = LocalDateTime.now();
        this.dataDevolucaoPrevista = dateEmprestimo.plusDays(20);
        this.leitor = leitor;
        this.livro = livro;
    }

    public LocalDateTime getDateEmprestimo() {
        return dateEmprestimo;
    }

    public void setDateEmprestimo(LocalDateTime dateEmprestimo) {
        this.dateEmprestimo = dateEmprestimo;
    }

    public LocalDateTime getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return "Informações de empréstimo\n" +
                "Data do empréstimo: " + dateEmprestimo.format(formatoBR) +
                "\nData de devolução: " + dataDevolucaoPrevista.format(formatoBR) +
                "\nDados de leitor:\n" + leitor +
                "\nDados do livro emprestado:\n" + livro;
    }
}
