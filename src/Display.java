public class Display {
    double diagonal;
    String  maker;
    String matrixType;

    public double getDiagonal() {
        return diagonal;
    }

    public String getMaker() {
        return maker;
    }

    public String getMatrixType() {
        return matrixType;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setMatrixType(String matrixType) {
        this.matrixType = matrixType;
    }

    public Display(double diagonal, String maker, String matrixType){
        this.diagonal = diagonal;
        this.maker = maker;
        this.matrixType = matrixType;
    }

    @Override
    public String toString() {
        return "Display{" +
                "diagonal=" + diagonal +
                ", maker='" + maker + '\'' +
                ", matrixType='" + matrixType + '\'' +
                '}';
    }
}
