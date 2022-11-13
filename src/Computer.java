import java.util.Scanner;

public class Computer {
    String pcColor;
    String graphicCard;
    String usbPorts;
    String maker;

    Display display;
    Ram ram;
    HardDisk hardDisk;
    UsbPort usbPort;
    Keaboard keaboard;

    public Computer(String pcColor, String graphicCard, String usbPorts, String maker, Display display, Ram ram, HardDisk hardDisk, UsbPort usbPort, Keaboard keaboard) {
        this.pcColor = pcColor;
        this.graphicCard = graphicCard;
        this.usbPorts = usbPorts;
        this.maker = maker;
        this.display = display;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.usbPort = usbPort;
        this.keaboard = keaboard;
    }

    @Override
    public String toString() {
        return "Computer:\n" +
                "PC COLOR: " + pcColor + '\'' +
                ", GRAPHIC CARD: '" + graphicCard + '\'' +
                ", USB PORTS: '" + usbPorts + '\'' +
                ", MARKER: '" + maker + '\'' +
                ",\nDISPLAY: " + display +
                ",\nRAM: " + ram +
                ",\nHARD DISK: " + hardDisk +
                ",\nUSB PORT: " + usbPort +
                ",\nKEYBOARD: " + keaboard
                ;
    }
}
