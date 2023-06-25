package com.amrita.jpl.cys21011.pract.net;

import java.io.*;
import java.net.*;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 2445);

            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String messageToSend = "";
            String receivedMessage = "";
            while (!messageToSend.equals("exit") && !receivedMessage.equals("exit")) {
                messageToSend = reader.readLine();
                outputStream.writeUTF(messageToSend);
                outputStream.flush();
                if (!messageToSend.equals("exit")) {
                    receivedMessage = inputStream.readUTF();
                    System.out.println("Server response: " + receivedMessage);
                }
            }

            outputStream.close();
            socket.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
