public class CD implements Items,InterfaceVisited {
    public String artist;

    public CD(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String getDescription() {
        return "Artist: "+ artist;
    }

    @Override
    public String accept(InterfaceVisitor visitor) {
        return visitor.get(this);
    }
}
