public class Tube implements Instrument{
    int diameter;
    public Tube(int diameter) {
        this.diameter = diameter;
    }
    public  void play() {
        System.out.println("Играет труба с " + diameter + " диаметром");
    }
}
