package array;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int num;
	boolean bool = true;
	String[] id = new String[5];
	String[] pwd = new String[5];
	
	while(bool) {
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 종료");
		System.out.print(">>> ");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			for(int i =0;i<id.length;i++) {
				System.out.print("아이디 입력: ");
				id[i]=input.next();
				System.out.print("비밀번호 입력: ");
				pwd[i]=input.next();
				for(int j=0;j<id.length;j++) {
					if(id[i].equals(id[j])){
						for(int k=0;k<pwd.length;k++) {
							if(pwd[i].equals(pwd[j])) {
								System.out.println("로그인 완료");
							}else {
								System.out.println("비밀번호가 틀렸습니다");
							}
						}
					}
				}
		
				break;
			}
			break;
			
			
		case 2:
			for(int i=0;i<id.length;i++) {
				if(id[i] == null) {

					System.out.print("새로운 아이디 입력: ");
					id[i]=input.next();
					for(int j=0;j<id.length;j++) {
						if(id[i].equals(id)) {
							System.out.println("동일한 아이디가 존재합니다");
						}else {
							System.out.print("새로운 비밀번호 입력: ");
							pwd[i]=input.next();
							System.out.println("가입을 축하합니다");
						}
					
				
					break;
					}
					
				}
				
				
			}
			break;
			
		case 3:
			System.out.println("프로그램을 종료합니다");
			bool = false;
			break;
		
	 }
	
	}
}
}
