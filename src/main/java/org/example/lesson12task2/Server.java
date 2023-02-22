package org.example.lesson12task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

  private ServerSocket serverSocket;
  private Socket clientSocket;
  private PrintWriter out;
  private BufferedReader in;

  public static void main(String[] args) throws IOException {
    Server server = new Server();

    try {
      server.start(6660);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      server.stop();
    }
  }

  public void start(int port) throws IOException {
    serverSocket = new ServerSocket(port);
    clientSocket = serverSocket.accept();
    out = new PrintWriter(clientSocket.getOutputStream(), true);
    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    out.println("[Server] " + in.readLine());
  }

  public void stop() throws IOException {
    in.close();
    out.close();
    clientSocket.close();
    serverSocket.close();
  }

}