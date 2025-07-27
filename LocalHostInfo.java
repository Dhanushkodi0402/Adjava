import java.net.*;

public class LocalHostInfo {
    public static void main(String[] args) {
        try {
            // Get the InetAddress object for the local host
            InetAddress localHost = InetAddress.getLocalHost();

            // Display hostname and IP address
            System.out.println("Local Hostname: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to retrieve local host info: " + e.getMessage());
        }
    }
}
