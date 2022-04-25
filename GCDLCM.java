package replit;

import java.util.Scanner;

public class GCDLCM {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
		Input :
		30 and 40
		Expected OutPut:
		GCD for 30 and 40 = 10
		LCM for 30 and 40 = 120*/
		 System.out.println("input first an in num1");
		 int num1=scan.nextInt();
		 System.out.println("input second integer num2");
		 int LCM;
         int num2=scan.nextInt();
         int k=0;
         if(num1<num2) {
        	 for(int i=1;i<num2;i++) {
        		 if (num1%i==0 && num2%i==0){
        			 if(i>k) {
        				 k=i;
        			 }
        		 }
        	 }
        	 System.out.println(k);
        	 LCM= ( Math.min(num1/k, num2/k))*num2;
         }else {
        	 for(int i=1;i<num1;i++) {
        		 if (num1%i==0 && num2%i==0){
        			 if(i>k) {
        				 k=i;
        			 }
        		 }
         }
        	 LCM= ( Math.min(num1/k, num2/k))*num1; 
    	}
       System.out.println("Greatest Common Divisor numbers is= "+k);
       System.out.println("Leats Common Multiple numbers  is= " + LCM );
	}
	}

