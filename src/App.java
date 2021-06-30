import adapter.DellComputer;
import adapter.HdmiVgaAdapter;
import adapter.Television;
import vga.VideoProjector;

public class App {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setHdmi(new Television());
        computer.display("Computer Screen displayed on the Television");

        computer.setHdmi(new DellComputer());
        computer.display("Computer Screen displayed on the DellComputer");

        System.out.println("Broncher l'ordinateur au VideoProjector: ");
        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setVga(new VideoProjector());
        computer.setHdmi(hdmiVgaAdapter);
        computer.display("Computer Screen displayed on the VideoProjector via hdmiVgaAdapter");
    }
}
