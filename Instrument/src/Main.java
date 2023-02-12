public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        Drum drum = new Drum("30x25");
        Tube tube = new Tube(25);
        System.out.println("Игрют инструменты:");

        Instrument[] instruments = {guitar, drum, tube};
        for (Instrument print : instruments) {
            print.play();
        }
    }
}