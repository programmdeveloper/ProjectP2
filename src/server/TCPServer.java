package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) {

        int port = 3333;
        try{
            ServerSocket server = new ServerSocket(port);
            System.out.println("Gestartet");

            Socket client = server.accept();

            InputStream is = client.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String receive = null;
            while ((receive = br.readLine()) != null) {
                System.out.println("Received: " + receive);
            }

            OutputStream os = client.getOutputStream();
            PrintWriter x = new PrintWriter(os);
            os.write("Hallo Welt".getBytes());

            try {
                Thread.sleep(5000);
            } catch (InterruptedException interruptedExceptionException){
                System.out.println("fail");
                System.exit(0);
            }

            client.close();
            server.close();

        }


        catch (IOException ex) {
            System.err.println("fail");
            System.exit(0);
        }

    }

}
