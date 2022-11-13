public class Ram {
    int volumeOfStorage;
    String maker;

    public int getVolumeOfStorage() {
        return volumeOfStorage;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setVolumeOfStorage(int volumeOfStorage) {
        this.volumeOfStorage = volumeOfStorage;
    }

    public Ram(int volumeOfStorage, String maker){
        this.volumeOfStorage = volumeOfStorage;
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "volumeOfStorage=" + volumeOfStorage +
                ", maker='" + maker + '\'' +
                '}';
    }
}
