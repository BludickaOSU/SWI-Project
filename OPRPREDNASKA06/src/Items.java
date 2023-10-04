public interface Items extends InterfaceVisited {
    public String getDescription();

    @Override
    public String accept(InterfaceVisitor visitor);
}
