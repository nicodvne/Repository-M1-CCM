package Intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class GestionClient implements Runnable {
	private Socket socket;
	private BufferedReader reader;
	private PrintWriter writer;

	@Override
	public void run() {
		try {
			Employer employer = new Employer();
			//while(true) {
				
			//}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		writer.println("Bonjour");
		
		writer.flush();
		writer.close();

	}
	
	public GestionClient(Socket socket) throws IOException{
		this.socket = socket;
		reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
	}

}
