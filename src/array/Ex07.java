package array;

import java.util.Scanner;

public class Ex07 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String[] id=new String[5];
	String[] pwd=new String[5];
	String inputId=null,inputPwd=null;
	int num;
	boolean bool = true;
	int index = 0, count=0;
	
	while(true) {
		System.out.println("1.로그인");
		System.out.println("2.회원가입");
		System.out.println("3.특정회원 보기");
		System.out.println("4.특정회원 비밀번호 수정");
		System.out.println("5.특정회원 삭제");
		System.out.println("6.모든회원 삭제");
		System.out.println("7.종료");
		System.out.print(">>> ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			System.out.print("아이디 입력: ");
			inputId=input.next();
			System.out.print("비밀번호 입력: ");
			inputPwd=input.next();
//			for(int i=0;i<id.length;i++) {
//				if(inputId.equals(id[i])) {
//					if(inputPwd.equals(pwd[i])) {
//						System.out.println("인증 통과");
//					}else {
//						System.out.println("비밀번호가 틀렸습니다");
//					}
//					bool=false;
//					break;
//				}
//			}
//			if(bool) {//bool == true;
//				System.out.println("존재하지 않는 아이디입니다");
//				System.out.println("회원가입 먼저 하세요");
//				
//			}
			
			for(index=0;index<id.length;index++) {
				if(inputId.equals(id[index])) {
					if(inputPwd.equals(pwd[index])) {
						System.out.println("인증 통과");
					}else {
						System.out.println("비밀번호가 틀렸습니다");
					}
					//bool=false;
					break;
				}
			}
			if(index==id.length) {//bool == true;
				System.out.println("존재하지 않는 아이디입니다");
				System.out.println("회원가입 먼저 하세요");
				
			}
			
			System.out.println("로그인");break;
			
			
		case 2:
			System.out.print("아이디 입력: ");
			inputId=input.next();
			System.out.print("비밀번호 입력: ");
			inputPwd=input.next();
			
			if(count < id.length) {
				for(index=0;index<count;index++) {
					if(inputId.equals(id[index])) {
						System.out.println("중복된 아이디입니다");
						break;
					}
				}
				if(index==count) {
					id[count] = inputId;
					pwd[count] = inputPwd;
					count++;
 				}
			}else {
				System.out.println("저장공간 부족");
			}
			
//			for(index=0;index<id.length;index++) {
//				if(inputId.equals(id[index])) {
//					System.out.println("중복된 아이디입니다");
//					break;
//				}
//				if(id[index]==null) {
//					id[index] = inputId;
//					pwd[index] = inputPwd;
//					System.out.println("가입완료");
//					break;
//				}
//			}
//			if(index == id.length) {
//				System.out.println("저장공간이 부족합니다");
//			}
			
			System.out.println("회원가입");break;
		case 3:
			System.out.println("프로그램 종료");
			System.exit(1);
		}
	}
}
}
