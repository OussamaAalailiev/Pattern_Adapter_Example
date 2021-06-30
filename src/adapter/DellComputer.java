package adapter;

public class DellComputer implements Hdmi{
    @Override
    public void signalHdmi(String s) {
        System.out.println("--------inside DellComputer's function-----------");
        System.out.println(s.toLowerCase());
        System.out.println("---------------------------------");
    }
}
