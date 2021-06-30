package adapter;

import vga.Vga;

public class HdmiVgaAdapter implements Hdmi{

    private Vga vga;

    @Override
    public void signalHdmi(String s) {
        System.out.println("Inside the Adapter :-)");
       byte[] data = s.getBytes();
       vga.signalVga(data);
    }

    public void setVga(Vga vga) {
        this.vga = vga;
    }
}
