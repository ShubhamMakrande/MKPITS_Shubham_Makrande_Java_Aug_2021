import java.io.*;
import java.net.*;
public class client1 {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",6666);
           DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");//writeUTF-Converted String to Bytes
            dout.flush();
            dout.close();
            s.close();
        }catch(Exception e){System.out.println(e);}
    }
}