package test;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int num;
	String [] id = new String [5];
	String [] pwd = new String [5];
	
	String inputId,inputPwd;
	
	while(true){
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 나가기");
		System.out.print(">>> ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("아이디 입력: ");
			inputId = input.next();
			System.out.print("비밀번호 입력: ");
			inputPwd = input.next();
			
			System.out.println("로그인");break;
		case 2:System.out.println("회원가입");break;
		case 3:
			System.out.println("프로그램을 종료합니다");
			System.exit(1);
		}
	}
}
}
