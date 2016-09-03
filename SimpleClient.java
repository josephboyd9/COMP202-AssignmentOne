import java.net.*;
import java.io.*;

class SimpleClient{
    public static void main(String[] args){
	String line;
	try{
	    Socket server = new Socket(args[0], Integer.parseInt(args[1]));
	    BufferedReader reader = new BufferedReader(new InputStreamReader(server.getInputStream()));
	    //for(int i = 0; i<2; i++){
	    //while(true){
	    do{
		line = reader.readLine();
		if(line != null)
		System.out.println(line);
	    }while(line != null);
	    server.close();
	}catch(Exception e) {
	    System.err.println("Exception: " + e);
	}
    }
}