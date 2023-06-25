package com.amrita.jpl.cys21011.pract.net;

import java.io.*;
import java.net.*;

public class SimpleServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2445);
            Socket socket = serverSocket.accept();

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String receivedMessage = "";
            String messageToSend = "";
            while (!receivedMessage.equals("exit") && !messageToSend.equals("exit")) {
                receivedMessage = inputStream.readUTF();
                System.out.println("Client message: " + receivedMessage);
                if (!receivedMessage.equals("exit")) {
                    messageToSend = reader.readLine();
                    outputStream.writeUTF(messageToSend);
                    outputStream.flush();
                }
            }

            inputStream.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
