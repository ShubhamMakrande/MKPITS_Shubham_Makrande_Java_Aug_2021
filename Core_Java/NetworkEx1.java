package Networkpack;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx1 {
    public static void main(String[] arg) throws UnknownHostException {
        InetAddress ob=InetAddress.getLocalHost();
        System.out.println(ob);
        System.out.println(ob.getHostName());
        System.out.println(ob.getHostAddress());
        System.out.println(ob. 	getLoopbackAddress());
    }
}
