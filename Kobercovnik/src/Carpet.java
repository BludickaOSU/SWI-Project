public class Carpet {
    private String color;
    private int sizeWidth;
    private int sizeHeight;

    public Carpet(String color, int sizeWidth, int sizeHeight) {
        this.color = color;
        this.sizeWidth = sizeWidth;
        this.sizeHeight = sizeHeight;
    }

    public String getColor() {
        return color;
    }

    public int getSizeWidth() {
        return sizeWidth;
    }

    public int getSizeHeight() {
        return sizeHeight;
    }
    public int getArea(){
        return sizeWidth*sizeHeight;
    }


    @Override
    public String toString() {
        return "Carpet{" +
                "color='" + color + '\'' +
                ", sizeWidth=" + sizeWidth +
                ", sizeHeight=" + sizeHeight +
                '}';
    }
}
