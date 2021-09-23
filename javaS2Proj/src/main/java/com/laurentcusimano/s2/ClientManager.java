package com.laurentcusimano.s2;

import java.io.*;
import java.net.Socket;

public class ClientManager implements Runnable {
    private final Socket socket;
    private final BufferedReader reader;
    private final PrintWriter writer;
    private Employee employee;

    public ClientManager(Socket socket, Agenda agenda) throws IOException {
        this.socket = socket;
        reader = new BufferedReader(new
                InputStreamReader(socket.getInputStream()));
        writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        employee = new Employee();
        employee.setAgenda(agenda);
    }

    @Override
    public void run() {
        while (true) {
            try {
                if (!reader.readLine().equals("")) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        writer.println("################################\n");
        writer.println("Welcome " + employee + "\n");
        writer.println("Here is your agenda :\n" + employee.getAgenda().toString());
        writer.println("################################\n");

        writer.flush();
        writer.close();
    }
}
