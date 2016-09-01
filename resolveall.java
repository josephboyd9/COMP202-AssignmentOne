import java.awt.List;
import java.net.UnknownHostException;
import java.net.InetAddress;


class resolveall{
    public static void main(String[] args){
	String[] ipList;
	InetAddress[] temp;
	int i = 0;
	int n;
	do{
	    try{
		temp = InetAddress.getAllByName(args[i]);
		ipList = new String[temp.length];
		for(n=0; n<temp.length; n++)
		    ipList[n] = temp[n].getHostAddress();
		System.out.print(args[i]);
		for(n=0; n<ipList.length; n++)
		    System.out.print(" : "+ipList[n]);
		    System.out.println();
		//in case there are a lot of addresses making a mess
		if(ipList.length>10)
		    System.out.println();
	    }catch(ArrayIndexOutOfBoundsException e){
		System.err.println("Usage: resolveall <name1> <name2> ... <nameN>");
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
