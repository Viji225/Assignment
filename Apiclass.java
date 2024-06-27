package Week2.Day3;

public class Apiclass {
public void sendRequest(String endpoiint)
{
	System.out.println("Endpoint");
}
public void sendRequest(String endpoint,String requestBody,boolean requestStatus)
{
	System.out.println("Endpoint");
	System.out.println("requestBody");
	System.out.println("requestStatus");
}
public static void main(String[] args) {
	Apiclass api= new Apiclass();
	api.sendRequest("Storyend");//string endpoint
	api.sendRequest("Java", "Selenium", false);
	
}
}

