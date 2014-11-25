package Tasks_01.Task_0001.client;

import java.io.*;
import java.net.Socket;
import java.nio.Buffer;

/**
 * Created by vladimirkr on 11/26/2014.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Client started...");
        Socket fromServer = new Socket("127.0.0.1", 4000);

        BufferedReader in=new BufferedReader(new InputStreamReader(fromServer.getInputStream()));
        PrintWriter out=new PrintWriter(fromServer.getOutputStream(), true);

        out.println("Hello");
        out.println("my");
        out.println("dear");
        out.println("Friend");
        //out.println("exit");

        fromServer.close();

        System.out.println("Client finished");
    }
}
