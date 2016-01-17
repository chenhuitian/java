import java.nio.channels.FileChannel;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class BasicNio{
	public BasicNio(){

	}

	public void sampletranse(){
		try{
		FileChannel in = new FileInputStream("a.txt").getChannel();
		FileChannel out = new FileOutputStream("b.txt").getChannel();

		in.transferTo(0,in.size(),out);

		out.close();
		in.close();
	}
	catch(IOException e){

	}
	}

	public static void main(String args[]){
		BasicNio bn = new BasicNio();
		bn.sampletranse();
	}
}