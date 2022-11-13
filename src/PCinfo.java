public class PCinfo {
    public static void main(String[] args) {
        Display display = new Display(13.3, "samsung", "ips");
        Ram ram = new Ram(16, "hyperX");
        HardDisk hardDisk = new HardDisk(256, 2);
        UsbPort usbPort = new UsbPort(2.0, "type c");
        Keaboard keaboard = new Keaboard("En", "no", "yes");
        Computer computer = new Computer("Black", "ASUS", "rtx3090", "HDMI,USB,Type-C,VGA",display,ram,hardDisk,usbPort,
                keaboard);
        System.out.println(computer);
    }
    }

