import java.awt.List;
import java.net.UnknownHostException;
import java.net.InetAddress;


class reverse{
    public static void main(String[] args){
	String hostName;
	InetAddress temp;
	int i = 0;
	do{
	    try{
		temp = InetAddress.getByName(args[i]);
		hostName = temp.getHostName();
		if(args[i].compareTo(hostName)==0)
		    throw new UnknownHostException();
		System.out.println(args[i] + " : " + hostName);
	    }catch(ArrayIndexOutOfBoundsException e){
		System.err.println("Usage: resolve <address1> <address2> ... <addressN>");
	    }catch(UnknownHostException e){
		System.err.println(args[i] + " : no name");
	    }catch(Exception e){
		System.err.println(e.toString());
	    }finally{
		i++;
	    }
	}while(i < args.length);
    }
}
