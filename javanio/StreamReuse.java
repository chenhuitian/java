import java.io.InputStream;
import java.io.IOException;
import java.io.BufferedInputStream;

public class StreamReuse{
	private InputStream input;
	public StreamReuse(InputStream input){
		if(!input.markSupported()){
			this.input = new BufferedInputStream(input);
		}else{
			this.input = input;
		}
	}

	public InputStream getInputStream(){
		input.mark(Integer.MAX_VALUE);
		return input;
	}

	public void markUsed() throws IOException{
		input.reset();
	}
}