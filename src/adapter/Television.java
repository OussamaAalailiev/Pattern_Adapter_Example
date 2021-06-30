package adapter;

public class Television implements Hdmi {
    @Override
    public void signalHdmi(String s) {
        System.out.println("*****************");
        System.out.println(s.toUpperCase());
        System.out.println("*******************");
    }
}
