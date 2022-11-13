public class UsbPort {
    double typeOfport;
    String  portId;

    public double getTypeOfport() {
        return typeOfport;
    }

    public String getPortId() {
        return portId;
    }

    public void setTypeOfport(double typeOfport) {
        this.typeOfport = typeOfport;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public UsbPort (double typeOfport, String portId){
        this.typeOfport = typeOfport;
        this.portId = portId;
    }

    @Override
    public String toString() {
        return "UsbPort{" +
                "typeOfport=" + typeOfport +
                ", portId='" + portId + '\'' +
                '}';
    }
}
