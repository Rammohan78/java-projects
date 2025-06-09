package calculate;
import java.util.*;
public class Calulator_program {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Simple Calculator");
		
		System.out.println("=================");
		System.out.println("enter the first number:");
		double a=sc.nextDouble();
		System.out.println("enter the second number:");
		double b=sc.nextDouble();
		System.out.println("choose an operation(+,-,*,/):");
		char operator= sc.next().charAt(0);
		double result;
		
		switch(operator) {
		case '+':
			
			result=a+b;
			System.out.println("addition:"+result);
			break;
			
		case 2:
			result=a-b;
			System.out.println("subtraction:"+result);
			break;
		case 3:
			result=a*b;
			System.out.println("multiplication:"+result);
			break;
		case 4:
			result=a/b;
			if(a==0) {
				System.out.println(0);
			}
			else {
				result=a/b;
				System.out.println("division:"+result);
				break;
			}
			default:
				System.out.println("error");
		}
		sc.close();
	}


	}

