package com.laurentcusimano.s2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<String> libs = new ArrayList<>();
        libs.add("aller en cours");
        libs.add("manger des pommes");
        libs.add("manger des poires");
        libs.add("aller au bar");
        libs.add("boire une pinte");

        Agenda agenda = new Agenda();

        for(int i = 0;  i<5; i++){
            agenda.addTask(new Task(libs.get(i)));
        }

        //System.out.println(agenda);

        try {
            ServerSocket serverSocket = new ServerSocket(6667, 10);
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("Connection established");;
                new Thread(new ClientManager(socket,agenda)).start();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
