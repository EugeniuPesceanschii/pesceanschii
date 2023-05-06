
package ipAddress;

public class IpAddressTest {

    public static void main(String[] args) {
        IpAddress a = new IpAddress("192.168.1.0", "255.255.255.0");
        
        System.out.println(a.stampaIp());
        
        System.out.println(a.classe());
        
        System.out.println(a.broadcast());
        
        System.out.println(a.rete());
    }   
}
