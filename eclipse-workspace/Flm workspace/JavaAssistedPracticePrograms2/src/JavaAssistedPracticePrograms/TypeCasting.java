package JavaAssistedPracticePrograms;

public class TypeCasting {
	
	public static void main(String[] args) {

		System.out.println("Implicit Type casting");
		
		char a = 'c';
		System.out.println("value of a:"+a);
		
		int b = a;
		System.out.println("value of b:"+b);
		
		float c = b;
		System.out.println("value of c:"+c);
		
		long d = a;
		System.out.println("value of d:"+d);
		
		double e = a;
		System.out.println("value of e:"+e);
		
		System.out.println();
		
		System.out.println("Explicit Type casting");
		
		double E = 99.6;
		
		int F = (int) E;
		
		System.out.println("value of E:"+E);
		System.out.println("value of F:"+F);

}
}