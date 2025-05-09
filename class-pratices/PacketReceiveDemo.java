import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class PacketReceiveDemo{
     public static void main(String[] args) {
        try{
            System.out.println("Binding to local port 2000");

            //create a datagram socket , bound to the specific port 2000
            DatagramSocket socket = new DatagramSocket(2000);

            //create a datagram packet ,containing a max buffer of 256 bytes
            DatagramPacket packet= new DatagramPacket(new byte[256],256);

            //receive a packet - remember by default this a blocking operation
            socket.receive(packet);
            System.out.println("Packet received");

            //display packet information
            InetAddress remote_addr=packet.getAddress();
            System.out.println("Sent by : " + remote_addr.getHostAddress());
            System.out.println("Sent from : "+packet.getPort());

            //Display packet contents ,by reading
            //from byte array

            ByteArrayInputStream bin = new ByteArrayInputStream(packet.getData());

            //display upto the length of the 
            //original UDP packet

            for (int i=0;i<packet.getLength();i++)
            {
                int data= bin.read();
                if(data==-1)
                {
                    break;
                }
                else
                {
                    System.out.println((char)data);
                }
            }
            socket.close();
        }catch(IOException ioe)
        {
            System.err.println("Error - " + ioe);
        }
    }
    
}