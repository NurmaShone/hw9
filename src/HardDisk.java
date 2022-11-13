public class HardDisk {
    int volumeOfstorage;
    int howToSplit;

    public int getVolumeOfstorage() {
        return volumeOfstorage;
    }

    public int getHowToSplit() {
        return howToSplit;
    }

    public void setVolumeOfstorage(int volumeOfstorage) {
        this.volumeOfstorage = volumeOfstorage;
    }

    public void setHowToSplit(int howToSplit) {
        this.howToSplit = howToSplit;
    }

    public HardDisk(int volumeOfstorage, int howToSplit){
        this.volumeOfstorage = volumeOfstorage;
        this.howToSplit = howToSplit;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "volumeOfstorage=" + volumeOfstorage +
                ", howToSplit=" + howToSplit +
                '}';
    }
}
