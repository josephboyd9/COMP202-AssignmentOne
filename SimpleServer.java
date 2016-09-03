import java.net.*;
import java.io.*;

class SimpleServer{
    public static void main(String[] args){
	try {
	    ServerSocket ss = new ServerSocket(8080);
	    while(true) {
		Socket client = ss.accept();
		PrintWriter writer = new
		    PrintWriter(client.getOutputStream(), true);
		BufferedReader reader = new
		    BufferedReader(new InputStreamReader(client.getInputStream()));
		String line = reader.readLine();
		writer.println("You said: " + line);
		client.close();
	    }
	}
	catch(Exception e) {
	    System.err.println("Exception: " + e);
	}
    }
}
