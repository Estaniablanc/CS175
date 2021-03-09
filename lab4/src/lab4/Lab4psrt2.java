package lab4;

import java.util.Scanner;

public class Lab4psrt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		Scanner in = new Scanner(System.in);
        System.out.println("please enter three number: ");
        num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		
	    
        if (num1 >= num2 && num2 > num3) 
        {
	       System.out.println(num3+" "+num2+" "+num1+" in order");
        }
        else if(num3>=num2 && num2>=num1)
        {	
        	System.out.println(num1+" "+num2+" "+num3+" in order");}
        else {
        	System.out.println(num1+" "+num2+" "+num3+" not in order");
        	
        
  
        	
        	
	}

  }
}