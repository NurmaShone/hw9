public class Keaboard {
    String hasNumPad;
    String hasRgb;
    String layoutType;



    public String getHasNumPad() {
        return hasNumPad;
    }

    public String getHasRgb() {
        return hasRgb;
    }

    public String getLayoutType() {
        return layoutType;
    }



    public void setHasNumPad(String hasNumPad) {
        this.hasNumPad = hasNumPad;
    }

    public void setHasRgb(String hasRgb) {
        this.hasRgb = hasRgb;
    }

    public void setLayoutType(String layoutType) {
        this.layoutType = layoutType;
    }

    public Keaboard(String hasNumPad, String hasRgb, String layoutType) {
        this.hasNumPad = hasNumPad;
        this.hasRgb = hasRgb;
        this.layoutType = layoutType;
    }

    @Override
    public String toString() {
        return "Keaboard{" +
                "hasNumPad='" + hasNumPad + '\'' +
                ", hasRgb='" + hasRgb + '\'' +
                ", layoutType='" + layoutType + '\'' +
                '}';
    }
}

