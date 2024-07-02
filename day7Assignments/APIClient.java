package week2.day3;

public class APIClient {
	
	//Overloading in java
	
	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}
	
    public void sendRequest(String endpoint,String requestBody,Boolean requestStatus) {
		System.out.println(endpoint);
		System.out.println(requestBody);
		System.out.println(requestStatus);
	}
    
    public static void main(String[] args) {
		APIClient api = new APIClient();
		api.sendRequest("Welcome");
		api.sendRequest("Testing");
		api.sendRequest("calling", "methods", true);
		api.sendRequest("Champions", "Arena", true);
	}

}
