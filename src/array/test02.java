package array;

import java.util.Scanner;

public class test02 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int num,i,j,k;
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
			for(i=0;i<id.length;i++) {
				System.out.println(id[i]);
				System.out.print("아이디 입력: ");
				id[i]=input.next();
				for(i=0;i<id.length;i++) {
					if(id[i].equals(id[i])) {
						System.out.println("존재하지 않는 아이디입니다");
						break;
					}else {
						System.out.print("비밀번호 입력: ");
						pwd[i]=input.next();
						for(i=0;i<pwd.length;i++) {
							if(pwd[i].equals(pwd[i])) {
								System.out.println("로그인 완료");
								break;
							}else {
								System.out.println("비밀번호가 틀렸습니다");
								break;
							}
						}
						break;
					}
				}
				
			}
			break;
		case 2:
			for(i=0;i<id.length;i++) {
				System.out.print("새로운 아이디 입력: ");
				id[i]=input.next();
				System.out.println("새로운 비밀번호 입력: ");
				pwd[i]=input.next();
				break;
			}
			break;
		case 3:
			System.out.println("프로그램을 종료합니다");
			bool = false;
		}
	}
}
}
