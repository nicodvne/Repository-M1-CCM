package Intro;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Serveur {

	public static void main(String[] args) {
		
		try {
			ServerSocket servsocket = new ServerSocket(80, 10);
			while(true) {
				Socket socket = servsocket.accept(); 
				new Thread(new GestionClient(socket)).start();
			}
		}catch (IOException e) {
			Logger.getLogger(Serveur.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	
}
