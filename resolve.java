import java.awt.List;
import java.net.UnknownHostException;
import java.net.InetAddress;


class resolve{
    public static void main(String[] args){
	String ip;
	InetAddress temp;
	int i = 0;
	do{
	    try{
		temp = InetAddress.getByName(args[i]);
		ip = temp.getHostAddress();
		System.out.println(args[i] + " : " + ip);
	    }catch(ArrayIndexOutOfBoundsException e){
		System.err.println("Usage: resolve <name1> <name2> ... <nameN>");
	    }catch(UnknownHostException e){
		System.err.println(args[i] + " : unknown host");
	    }catch(Exception e){
		System.err.println(e.toString());
	    }finally{
		i++;
	    }
	}while(i < args.length);
    }
}
