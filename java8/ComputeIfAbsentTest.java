import java.util.Map;
import java.util.HashMap;

public class ComputeIfAbsentTest
{
	private final Map<String,Person> allUsers = new HashMap<>();
	public void onMessage(String s){
		Person newstr = allUsers.computeIfAbsent(s,Person::new);
	}

	public Map<String,Person> getlist(){
		return allUsers;
	}

	public static void main(String args[]){
		ComputeIfAbsentTest tt = new ComputeIfAbsentTest();
		tt.onMessage("dss");
		System.out.print(tt.getlist().size());
	}
}