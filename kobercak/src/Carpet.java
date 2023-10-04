public class Carpet {
    private String color;
    private int sizeWidth;
    private int getSizeHeight;

    public String getColor() {
        return color;
    }

    public int getSizeWidth() {
        return sizeWidth;
    }

    public int getGetSizeHeight() {
        return getSizeHeight;
    }

    public Carpet(String color, int sizeWidth, int getSizeHeight) {
        this.color = color;
        this.sizeWidth = sizeWidth;
        this.getSizeHeight = getSizeHeight;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "color='" + color + '\'' +
                ", sizeWidth=" + sizeWidth +
                ", getSizeHeight=" + getSizeHeight +
                '}';
    }
}
