package model;

public class ConnectionWithChange extends Connection {

    private Connection destinationConn;

    public ConnectionWithChange(Connection thisConn, Connection destinationConn) {

        super(thisConn.getFlightID(),
                thisConn.getPlaceFrom(),
                thisConn.getPlaceTo(),
                thisConn.getDepartureTime(),
                thisConn.getArrivalTime(),
                thisConn.getAirline(),
                thisConn.getPrice(),
                thisConn.getAirlineClass());

        setDestinationConn(destinationConn);
    }

    public Connection getDestinationConn() {
        return destinationConn;
    }

    public void setDestinationConn(Connection destinationConn) {
        this.destinationConn = destinationConn;
    }

    @Override
    public long getFlightDuration() {
        return super.getFlightDuration() + getDestinationConn().getFlightDuration();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + getDestinationConn().getPrice();
    }

    @Override
    public String toString() {
        return "┎ " + super.toString() + "\n┖ " + getDestinationConn().toString() + " -- TOTAL PRICE: " + getPrice() + ", TOTAL DURATION: " + getFlightDuration();
    }
}
