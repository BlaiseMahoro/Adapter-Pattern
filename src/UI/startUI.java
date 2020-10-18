package UI;

import java.util.Scanner;

import PD.AdapterStack;

public class startUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Postfix Calculator");
		System.out.println("Enter postfix expression");
		String expression = scan.nextLine();
		int result = evaluate(expression);
		System.out.println("Result = "+result);
	}
	
	public static int evaluate(String expression) {
		AdapterStack stack = new AdapterStack();
		
		for(int i = 0; i < expression.length(); i++) {
			if(expression.charAt(i) == ' ') 
				continue;
			if(expression.charAt(i)=='-' || expression.charAt(i) == '+' ||
					expression.charAt(i) == '*' || expression.charAt(i) == '/') {
				//POP STACK AND COMPUTE
				int num1 = stack.pop();
				int num2 = stack.pop();
				
				switch(expression.charAt(i)) {
					case '+':
						stack.push(num1+num2);
						break;
					case '-':
						stack.push(num2-num1);
						break;
					case '*':
						stack.push(num2*num1);
						break;
					case '/':
						stack.push(num2/num1);
						break;
				}
			}
			else {
				stack.push(Integer.parseInt(expression.charAt(i)+""));
			}
		}
		
		return stack.pop();
	}
}
