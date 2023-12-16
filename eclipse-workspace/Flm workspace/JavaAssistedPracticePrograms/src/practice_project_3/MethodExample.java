package practice_project_3;



public class MethodExample {

	//method with no return type and no parameters
	
		public void msk() {
			System.out.println("print msk");
		}
		
		//method with return type and parameters
		
		public int add(int a,int b) {
			
			return  a+b;
		}
		
		 // Static method with parameters and a return value
	    public static double multiply(double x, double y) {
	        return x * y;
	    }
	    
	    //method with parameters and no return type
	    public void wish(String name) {
			System.out.println("hello  "+name);
		}
	    
	    //main method is used to call the methods
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			MethodExample me = new MethodExample();
			
			me.msk();
			
			int addition = me.add(4,5);
			System.out.println("add is  "+addition);
			
			 me.wish("sai");
			 
			 double product = MethodExample.multiply(2.5, 4.0);
		        System.out.println("Product: " + product);

		}

	}


