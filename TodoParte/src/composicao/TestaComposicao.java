package composicao;

public class TestaComposicao {
    static void main(String[] args){
        Empresa emp1 = new Empresa(1, "Banco Master", "5678");
        emp1.addFuncionario(10, "Fulano", "12345", "marketing");
        emp1.addFuncionario(11, "Beltrano", "1294", "TI");
        emp1.addFuncionario(12, "Ciclano", "6589", "Contador");

        System.out.println(emp1.toString());
        emp1.removeFuncionario(11);
        System.out.println(emp1.toString());
    }
}
