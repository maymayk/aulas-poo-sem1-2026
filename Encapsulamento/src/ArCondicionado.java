public class ArCondicionado {
    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
    }

    public ArCondicionado(String marca, String modelo, int temperatura) {
        this.marca = marca;
        this.modelo = modelo;
        this.temperatura = temperatura;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura<=30) {
            this.temperatura = temperatura;
        }
        else{
            System.out.println("Não é possível alterar a temperatura." +
                    "A temperatura desejada está fora da faixa de alcance de 16ºC a 30ºC");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", ligado=" + ligado +
                '}';
    }
}
