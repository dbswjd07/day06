package array;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int arr[] = {10,54,13,17,15,30};
	String num, even="짝수", odd="홀수";
	
	
	System.out.print("짝수, 홀수 입력: ");
	num=input.next();
	
	for(int i=0;i<arr.length;i++) {
		if(num.equals(even)&&arr[i]%2==0) {
			System.out.println("짝수: "+arr[i]);
		}else {
			System.out.println("홀수: "+arr[i]);
		}
		
		
	}
}
}
