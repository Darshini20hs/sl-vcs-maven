package mypkg;

public class calci {
	int add(int a , int b){
		return a+b;
	}
	int diff(int a, int b) {
		return a-b;
	}
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		calci calc = new calci();
		System.out.println(calc.add(10,20));
	}

}
