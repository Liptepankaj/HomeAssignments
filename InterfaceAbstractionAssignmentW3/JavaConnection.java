package week3.InterfaceAbstractionAssignmentW3;

public class JavaConnection implements DatabseConnection {

	//Abstract methods 

	@Override
	public void connect() {
		System.out.println("Connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Updates Executed");
	}

	public static void main(String[] args) {
		//Calling abstract methods by using concrete class object reference variable
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}
}
