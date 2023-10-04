import java.net.InetAddress;

public class Main {
    public static void main(String[] args) {


        try {
            InetAddress ipAddress = InetAddress.getLocalHost();
            System.out.println("Moje IP adresa: " + ipAddress.getHostAddress());
            System.out.println(ipAddress.hashCode());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}