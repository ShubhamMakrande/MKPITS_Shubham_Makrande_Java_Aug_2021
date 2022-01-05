import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
class Server5
{
    public static void main(String[] args)
    {
        try {
            ServerSocket ss = new ServerSocket(2000);//server ip port
            Socket s = ss.accept();
            DataInputStream din =new DataInputStream(s.getInputStream());
            DataOutputStream dout= new DataOutputStream(s.getOutputStream());

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String msgin="",msgout="";
            while(!msgin.equals("bye")) {
                msgin = din.readUTF();
                System.out.println(msgin);//printing client msg
                msgout = br.readLine();
                dout.writeUTF(msgout);
                dout.flush();
            }
            s.close();
            }catch(Exception e)
            {
               //handle exception
            }



        }




}

