package vga;

public class VideoProjector implements Vga {
    @Override
    public void signalVga(byte [] bytes) {
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Displaying data THROUGH VGA in VideoProjector");
        String byteToString = new String(bytes);
        System.out.println(byteToString);
        System.out.println("++++++++++++++++++++++++");
    }
}
