public class testaSmartTv {
    static void main(String[] args){
        SmartTv obj1 = new SmartTv("Samsung", "32 polegadas", 30);
        System.out.println(obj1.toString());
        obj1.setVolume(45);
        obj1.setMarca("LG");
        obj1.setModelo("42 polegadas");
        System.out.println(obj1.toString());
    }
}