package calculator;

public class Subtraction {
	
	
	public int num1;
	public int num2;
	
	
	public Subtraction(int num1,int num2){
		
		this.num1=num1;
		this.num2=num2;
	}
	

	public int subResult(int num1,int num2){
		
		if(num1>num2)
		return num1-num2;
		else
			return num2-num1;
	}

}
