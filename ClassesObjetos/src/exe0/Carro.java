package exe0;
public class Carro {
    //criando variáveis com visibilidade pública, ou seja,
    // qualquer outra classe pode acessar e alterar essas variáveis
    public String marca, modelo, cor, placa;
    public float potencia, velocidade;
    public int ano;
    public boolean motor; //se ligado: true; se desligado: false

    //método construtor
    public Carro(String marca, String modelo, float potencia, int ano, String placa, String cor){
        this.marca = marca; this.modelo = modelo; this.potencia = potencia; this.ano = ano;
        this.placa = placa; this.cor = cor; this.motor = false; this.velocidade = 0;
    }
    //método para ligar o carro
    public void ligar(){
        if (!this.motor){
            this.motor = true;
            System.out.println("O motor foi ligado");
        }
    }
    //desligar motor
    public void desligar(){
        if (this.motor && this.velocidade == 0){
            this.motor = false;
            System.out.println("O motor foi desligado");
        }
        else if (this.velocidade > 0){
            System.out.println("Reduza a velocidade para desligar o carro!");
        }
    }
    //acelerar velocidade
    public void acelerar(float x){
        if (this.motor) {
            this.velocidade += x;
            System.out.println("Carro acelerado. Velocidade atual: " + this.velocidade + "km/h");
        }
        else System.out.println("Não foi possível acelerar. Ligue o motor.");
    }
    //método para frear o carro
    public void frear(float x){
        if (this.motor && this.velocidade - x >=0){
            this.velocidade -= x;
            System.out.println("Carro freado. Velocidade atual: " + this.velocidade + "km/h");
        }
        else System.out.println("Não é possível frear!");
    }

    //converte o objeto em String
    public String toString(){
        return "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                " \nCor: " + this.cor +
                "\nPlaca: " + this.placa +
                "\nPotência: " + this.potencia +
                "\nAno: " + this.ano +
                "\nSituação do motor: " + (this.motor ? "Ligado" : "Desligado") + //<- operador ternário
                "\nVelocidade do carro: " + this.velocidade + "km/h";
    }
}