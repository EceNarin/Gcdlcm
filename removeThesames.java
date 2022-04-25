package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class removeThesames {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	/*	Write a code that returns the duplicate chars in a String array.(interview Question)
		Input :
		String str=“Javaisalsoeasy”
		Output: [a, s]*/
		System.out.println("kelime giriniz");
		String str=scan.next();
		removeDuplicate(str);

	}

	private static void removeDuplicate(String str) {
		 String arr[]=str.split("");
		 //System.out.println(Arrays.toString(arr));
		 int count=0;
		 ArrayList<String> arr1=new ArrayList<>();
		 for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
					
					
				}
			}
		 }
		
	}

}
