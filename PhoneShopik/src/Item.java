public class Item {
    private Phone phone;
    private double price;
    private  String country;

    public Item(Phone phone, double price, String country) {
        this.phone = phone;
        this.price = price;
        this.country = country;
    }
    public String getPhoneName(){
        return getPhoneName();
    }

    public String getPhoneColor(){
        return phone.getColor();
    }

    public double getPrice() {
        return price;
    }

    public String getCountry() {
        return country;
    }


    public String getInfo() {
        return "Item{" +
                "phone=" + phone +
                ", price=" + price +
                ", country='" + country + '\'' +
                '}';
    }
}
