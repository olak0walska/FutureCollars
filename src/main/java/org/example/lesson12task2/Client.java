package org.example.lesson12task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
  private Socket clientSocket;
  private PrintWriter out;
  private BufferedReader in;

  public static void main(String[] args) throws IOException {
    Client client = new Client();

    try {
      client.startConnection("127.0.0.1", 6660);
      System.out.println(client.sendMessage("super wiadomosc"));
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      client.stopConnection();
    }
  }

  public void startConnection(String ip, int port) throws IOException {
    clientSocket = new Socket(ip, port);
    out = new PrintWriter(clientSocket.getOutputStream(), true);
    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
  }

  public String sendMessage(String msg) throws IOException {
    out.println(msg);
    String response = in.readLine();
    return response.toUpperCase();
  }

  public void stopConnection() throws IOException {
    in.close();
    out.close();
    clientSocket.close();
  }

}
