package practice_project_2;

public class AccessModifiersExample {
	
public int a = 10;
	
	private int b=100;
	
	protected int c = 1000;
	
	int  d = 101;
	
	public void pubmethod() {
		System.out.println("This is a public method");
	}
	
	
	
	private void primethod() {
		System.out.println("This is a private method");
	}
	protected void promethod() {
		System.out.println("This is a protected method");
	}
	 void defmethod() {
		System.out.println("This is a Default method");
	}

}
