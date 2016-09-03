import java.net.*;
import java.io.*;

class SimpleServer{
    public static void main(String[] args){
	try {
	    ServerSocket ss = new ServerSocket(0);
	    while(true) {
		Socket client = ss.accept();
		PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
		InetAddress ip = client.getInetAddress();
		String name = ip.getHostName();
		String address = ip.getHostAddress();
		//BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
		//String line = reader.readLine();
		writer.println("Hi " + name);
		writer.println("Your IP address is " + address);
		client.close();
	    }
	}
	catch(Exception e) {
	    System.err.println("Exception: " + e);
	}
    }
}
