package week2.day4;

public class JavaConnection extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("Connect method is called");
		
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect method is called");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate method is called");
		
	}
	
	public static void main(String[] args) {
		JavaConnection javaCon = new JavaConnection();
		javaCon.connect();
		javaCon.disconnect();
		javaCon.executeQuery();
		javaCon.executeUpdate();
	}

}
