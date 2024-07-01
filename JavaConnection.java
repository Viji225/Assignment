package Week2.Day4;

public class JavaConnection extends MySqlConnection{

	public void connect() {
		System.out.println("Connect from Java");
		
	}

	public void disconnect() {
		System.out.println("DisConnect from Java");
		
	}

	public void executeUpdate() {
		System.out.println("ExecuteUpdate from Java");
		
	}
public static void main(String[] args) {
	JavaConnection Jc= new JavaConnection();
	Jc.connect();
	Jc.disconnect();
	Jc.executeUpdate();
	Jc.executeQuery();
}
}
