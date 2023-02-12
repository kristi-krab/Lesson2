public class Drum implements Instrument{
    String size;
    public Drum(String size) {
        this.size = size;
    }
    public  void play() {
        System.out.println("Играет барабан " + size + " размером");
    }
}
