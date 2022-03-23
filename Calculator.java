package week1.day2.assignments;

public class Calculator {
	
	
	
	public int add3nos(int num1,int num2,int num3)
	{
		int sum = num1+num2+num3 ;
		return sum;
		
		}
	public int sub2nos(int num1,int num2)
	{
		int sub=num1-num2;
		return sub;
	}
	public double mul2nos(double num1,double num2)
	{
		double mul=num1*num2;
	    return mul;
	}
	public float div2nos(float num1,float num2)
	{
		float div=num1/num2;
	    return div;
	}

	public static void main(String[] args) {
		
		Calculator mycl = new Calculator();
		System.out.println("add"+ mycl.add3nos(5,5,5));
		System.out.println(("sub"+ mycl.sub2nos(10,5)));
		System.out.println("mul"+ mycl.mul2nos(2,3));
		System.out.println(("div"+mycl.div2nos(6,3)));
		
				
	}
}
