package gadugadu;


import com.sun.security.ntlm.Server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class GaduGaduServer {
    ArrayList klientArrayList;
    PrintWriter printWriter;

    // start programu
    public static void main(String[] args) {
        GaduGaduServer gaduGaduServer = new GaduGaduServer();
        gaduGaduServer.startServer();


    }

    // start servera
    public void startServer() {
        klientArrayList = new ArrayList();
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Słucham : " + serverSocket);
                printWriter = new PrintWriter(socket.getOutputStream());
                klientArrayList.add(printWriter);

                Thread thread = new Thread(new ServerKlient(socket));
                thread.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // klasa wewnetrzna
    class ServerKlient implements Runnable {

        Socket socket;
        BufferedReader bufferedReader;

        // konstruktor
        public ServerKlient(Socket socketKlient) {
            try {
                System.out.println("Połączony : ");
                socket = socketKlient;
                bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        @Override
        public void run() {
            String string;
            PrintWriter printWriter1 = null;
            try {
                while ((string = bufferedReader.readLine()) != null) ;
                System.out.println("Odebrano >> " + string);
                Iterator iterator = klientArrayList.iterator();
                while (iterator.hasNext()) {
                    printWriter1 = (PrintWriter) iterator.next();
                    printWriter1.println(string);
                    printWriter1.flush();
                }
            } catch (Exception e) {
            }
        }
    }
}


