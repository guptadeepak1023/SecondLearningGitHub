package calculator;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		boolean continueTheCalculation=true;
		
		
		
		while(continueTheCalculation){
			System.out.print(" Enter The First Number:-");
			int firstnum=s.nextInt();
			System.out.print(" Enter The Second Number:-");
			int secondnum=s.nextInt();
			System.out.println();
			System.out.println(" Different Operations:");
			System.out.println(" Enter 1 For Addition.");
			System.out.println(" Enter 2 For Subtraction.");
			System.out.println(" Enter 3 For Multiplication.");
			System.out.println(" Enter 4 For Divison.");
			System.out.print(" Please Choose Opeartion:-");
			
			int ans=0;
			
			
			int chooseoperation=s.nextInt();
			System.out.println();
			switch(chooseoperation){
			
			case 1:
				Addition obj1=new Addition(firstnum,secondnum);
				ans=obj1.addResult(firstnum,secondnum);
				System.out.println(" Addition Of The Numbers Is:"+ans);
				System.out.println();
				break;
			case 2:
				Subtraction obj2=new Subtraction(firstnum,secondnum);
				ans=obj2.subResult(firstnum,secondnum);
				System.out.println(" Subtraction Of The Numbers Is:"+ans);
				System.out.println();
				break;
			case 3:
				Multiplication obj3=new Multiplication(firstnum,secondnum);
				ans=obj3.multiplyResult(firstnum,secondnum);
				System.out.println(" Multiplication Of The Numbers Is:"+ans);
				System.out.println();
				break;
			case 4:
				Divison obj4=new Divison(firstnum,secondnum);
				ans=obj4.divideResult(firstnum,secondnum);
				System.out.println(" Division Of The Numbers Is:"+ans);
				System.out.println();
				break;
				default:
					System.out.println(" *** Please Enter Valid Operation ***");
				}
			
			
			System.out.println("Do you Wish To Continue ?");
			System.out.println("Enter 'Yes' For Continue.");
			System.out.println("Enter 'No' To Exit");
			String str=s.next();
			if(str.equals("Yes"))
				continueTheCalculation=true;
			else{
				continueTheCalculation=false;
			
			}
			   
			  
		}
		
		
		
		
		
	}
	
	

}
