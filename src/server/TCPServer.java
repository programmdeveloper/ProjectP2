package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) {

        String name = "localhost";
        int port = 3333;
        try {
            Socket socket = new Socket(name, port);
            ServerSocket server = new ServerSocket(port);
            socket = server.accept();
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
        } catch (IOException ex){
            System.err.println("connection failed");
            System.exit(0);
        }


    }

}
