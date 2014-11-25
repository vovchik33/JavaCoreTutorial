package Tasks_01.Task_0001.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by vladimirkr on 11/26/2014.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("Server started...");
        ServerSocket serverSocket=new ServerSocket(4000);
        Socket fromClient=serverSocket.accept();

        BufferedReader in=new BufferedReader(new InputStreamReader(fromClient.getInputStream()));
        PrintWriter out=new PrintWriter(new OutputStreamWriter(fromClient.getOutputStream()));

        String inStr, outStr;
        while(true) {
            inStr = in.readLine();
            if (null!=inStr && inStr.equals("exit")) break;
            if (null!=inStr) System.out.println(inStr);
        }

        fromClient.close();
        serverSocket.close();
        System.out.println("Server finished");
    }
}
