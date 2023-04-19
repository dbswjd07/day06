package test;

import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	String evenOdd;
	int index=0;
	
	int arr[] = {10,54,13,17,25,30};
	System.out.print("짝수, 홀수 입력: ");
	evenOdd = input.next();
	
	for(int i:arr) {
		if(evenOdd.equals("짝수")) {
			if(arr[index]%2==0) {
				System.out.println("짝수: "+arr[index]);
			}
		}else {
			if(arr[index]%2!=0) {
				System.out.println("홀수: "+arr[index]);
			}
		}
		
		index++;
		
	}
	
	
}
}
