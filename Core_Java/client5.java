import javax.xml.crypto.Data;
import java.io.*;
import java.net.Socket;

public class client5
{
    public static void main(String[] args)
    {
        try
        {
            Socket s = new Socket("127.0.0.1", 2000);//server ip and port
            System.out.println("Client is sending request");
            DataInputStream din=new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                    String msgin="",msgout="";
            while(!msgin.equals("bye"))
            {
                msgout=br.readLine();
                dout.writeUTF(msgout);
                msgin=din.readUTF();
                System.out.println(msgin);//Printing Server msg.
            }

        }catch(Exception e)
            {

            }
    }
}