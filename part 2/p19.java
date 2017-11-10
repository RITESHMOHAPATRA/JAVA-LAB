import java.net.InetAddress;

class HostName {
   public static void main(String[] args) throws Exception {
      InetAddress addr = InetAddress.getLocalHost();
 
      String hostname = addr.getHostName();
      System.out.println("Local host name: "+hostname);
   }
}