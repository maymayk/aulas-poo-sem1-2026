package exe0;
public class TestaCarro {
    static void main(){
        //instância objt1
        Carro objt1 = new Carro("Fiat","Palio", 1.6f, 2020, "A", "Azul");
        System.out.println(objt1.toString());
        objt1.acelerar(50);

        Carro objt2 = new Carro("Chevrolet","Onix", 1.4f, 2018, "B", "Preto");
        System.out.println(objt2.toString());

        Carro objt3 = new Carro("Volkswagen","Polo", 1.3f, 2016, "C", "Branco");
        System.out.println(objt3.toString());
    }
}
