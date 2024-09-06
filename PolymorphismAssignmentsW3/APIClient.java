package week3.PolymorphismAssignmentsW3;

public class APIClient {

	//1st Method
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint is set as = "+endpoint);
	}
	
	//2nd Method
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint is set as = "+endpoint);
		System.out.println("Request Body is set as = "+requestBody);
		System.out.println("Request status is = "+requestStatus);
	}
	
	//Main Method
	public static void main(String[] args) {
		//Object creation of Class
		APIClient ap = new APIClient();
		
		//1st Method execution
		ap.sendRequest("Request from 1st Method");
		
		//2nd Method execution
		ap.sendRequest("Request from 2nd Method", "Request Body from 2nd Method", true);
	}
}
