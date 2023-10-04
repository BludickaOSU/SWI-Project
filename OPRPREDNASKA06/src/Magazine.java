public class Magazine implements Items,InterfaceVisited{
    private String name;


    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return "Magazine: "+ name;
    }

    @Override
    public String accept(InterfaceVisitor visitor) {
        return visitor.get(this);
    }
}
