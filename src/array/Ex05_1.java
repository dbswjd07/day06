package array;

import java.util.Scanner;

public class Ex05_1 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int arr[] = {10,54,13,17,15,30};
	String  oddEven;
	
	System.out.print("짝수, 홀수 입력: ");
	oddEven=input.next();
	if(oddEven.equals("짝수")) {
		for(int num :arr) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
	}else {
		for(int num: arr) {
			if(num%2!=0) {
				System.out.println(num);
			}
		}
	}
	
	
}
}
