package Week2.Day4;

public abstract class MySqlConnection implements DatabaseConnection{
public void executeQuery() {
	System.out.println("ExecuteQuery from MySql");
}
public static void main(String[] args) {
	//MySqlConnection sq = new MySqlConnection(); //we cannot obj for abstract so that only we create concrete class (JavaConnection)
	
}
}
