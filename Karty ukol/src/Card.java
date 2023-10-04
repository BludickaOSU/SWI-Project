public class Card {
    private String color;
    private String rank;
    private String Shape;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getShape() {
        return Shape;
    }

    public void setShape(String shape) {
        Shape = shape;
    }

    public Card(String color, String rank, String shape) {
        this.color = color;
        this.rank = rank;
        Shape = shape;
    }


    public String getInfo() {
        return "Card{" +
                "color='" + color + '\'' +
                ", rank='" + rank + '\'' +
                ", Shape='" + Shape + '\'' +
                '}';
    }
}
