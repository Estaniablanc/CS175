package lab4;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1, num2, num3;
		Scanner in = new Scanner(System.in);
        System.out.println("please enter three numbers: ");
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        num3 = in.nextDouble();
        System.out.print("The Largest number is: ");
        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 +".");
        
	    else if (num2 >= num3)
            System.out.println(num2+".");
        else
            System.out.println(num3+".");
         
        }
	}	 




