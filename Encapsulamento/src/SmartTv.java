public class SmartTv{
    private String marca, modelo;
    private int volume;
    private boolean conectadoInternet;
    //métodos construtores
    public SmartTv(){ //sem parâmetro
        this.volume = 0;
        this.marca = "Indefinido";
        this.modelo = "Indefinido";
    }
    //construtor com parâmetro
    public SmartTv(String marca, String modelo, int volume){
        this.marca = marca;
        this.modelo = modelo;
        this.setVolume(volume);
        this.conectadoInternet = false;
    }
    //altera o valor de volume
    public void setVolume(int volume){
        if(volume >=0 && volume<= 100){
            this.volume = volume;
        }
        else {
            System.out.println("Volume inválido");
        }
    }
    //obtém o valor do volume
    public int getVolume(){
        return this.volume;
    }
    //set e get Marca, altera e obtém o valor de marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    //set e get de modelo, altera e obtém os valores de modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void aumentarVolume(int x){
        this.setVolume(this.volume + x);
    }
    public void diminuirVolume(int x){
        this.setVolume(this.volume - x);
    }
    //método público para entrar no youtube
    public void entrarYoutube(){
        if (this.conectarInternet()){
            System.out.println("Abrindo YouTube");
        }
        else {
            System.out.println("SmartTv não conectada na internet");
        }
    }
    //método para conectar à internet
    private boolean conectarInternet(){
        System.out.println("Buscando sinal de wi-fi...");
        System.out.println("Verificando as credenciais...");
        System.out.println("Autenticando IP no roteador...");
        int randomico = (int) (Math.random() * 10);
        if(randomico < 5){
            this.conectadoInternet = true; //liga a smartTV a internet
            return true;
        }
        else {
            this.conectadoInternet = false;
            return false;
        }


    }

    public String toString(){
        return "\nMarca: " + this.marca +
                "\nModelo: " + this.modelo +
                "\nVolume: " + this.volume;
    }
}