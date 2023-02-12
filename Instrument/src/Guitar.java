public class Guitar implements Instrument{
    int strings;
    public Guitar(int strings) {
        this.strings = strings;
    }
    public  void play() {
        System.out.println("Играет гитара с " + strings + " струнами");
    }
}
