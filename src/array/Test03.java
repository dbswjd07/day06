package array;

import java.util.Scanner;

public class Test03 {
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
				System.out.print("아이디 입력: ");
				id[i]=input.next();
				for(i=0;i<id.length;i++) {
					if(id[i].equals(id[i])) {
						System.out.println("존재하지 않는 아이디입니다");
						break;
					}else {
						break;
					}
				}
				break;
			}
		}
	}
}
}
