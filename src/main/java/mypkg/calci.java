package mypkg;

public class calci {
	public int add(int a , int b){
		return a+b;
	}
	public int diff(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	public int div(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		calci calc = new calci();
		System.out.println(calc.add(10,20));
		System.out.println(calc.diff(20,10));
		System.out.println(calc.mul(20,10));
		System.out.println(calc.div(20,10));
	}

}
