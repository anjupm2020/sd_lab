
import java.io.*;
import java.net.*; 
public class client1
{ 
        public static void main(String[] args) throws IOException 
                {
                Socket clientSock=new Socket("localhost", 3000);
                System.out.println("Client connected to the server");
                
                BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
                OutputStream ostream=clientSock.getOutputStream();
                
                PrintWriter pwrite=new PrintWriter(ostream,true);
                InputStream istream=clientSock.getInputStream();
                
                BufferedReader receiveRead=new BufferedReader(new InputStreamReader(istream));
                System.out.println("to Start the chat, type message and press Enter key"); 
                String receiveMessage , sendMessage;
                while(true)
                {
                        sendMessage=keyRead.readLine();
                        pwrite.println(sendMessage);
                        System.out.flush();
                        if((receiveMessage=receiveRead.readLine())!=null)
                        { 
                                System.out.println("server:>"+receiveMessage);
                        } 
                        if(sendMessage.equals("bye"))
                        {
                                break;
                        }
                
             }   
        }
}


