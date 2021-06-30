import adapter.Hdmi;
/**This class will act as a Client that requests a service from another entity*/
public class Computer {
    private Hdmi hdmi;

    public void display(String string){
        hdmi.signalHdmi(string);
    }

    public void setHdmi(Hdmi hdmi) {
        this.hdmi = hdmi;
    }
}
