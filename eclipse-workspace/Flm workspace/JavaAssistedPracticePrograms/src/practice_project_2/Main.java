package practice_project_2;

public class Main {
	
public static void main(String[] args) {
		

		AccessModifiersExample ex = new AccessModifiersExample();
		
		 // Public members are  accessible from outside the class
		 System.out.println("Public variable: " + ex.a);
	        ex.pubmethod();
	        
	        
	        // Private members are not accessible from outside the class
	     
	       // System.out.println("Private variable: " + ex.b);  This will cause a compilation error
	        //ex.primethod();This will cause a compilation error
	        
	        
	        //Protected members are  accessible from within package or subclass
	        System.out.println("Protected variable: " + ex.c);
	        ex.promethod();
	        
	      //default members are  accessible from same  package 
	        System.out.println("Default variable: " + ex.d);
	        ex.defmethod();

}
}