package array;

public class Ex03 {
public static void main(String[] args) {
	String[] str = {"aaa","bbb","ccc"};
	
	for(int i=0;i<str.length;i++) {
		System.out.println(str[i]);
	}
	
	System.out.println("=============");
	
	for(String s: str) {
		System.out.println(s);
	}
	
	System.out.println("==============");
	int arr[] = {10,54,13,17,15,30};
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println("짝수: "+arr[i]);
		}
		else {
			System.out.println("홀수: "+arr[i]);
		}
	}
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println(arr[i]+":짝수");
			continue;
		}
		System.out.println(arr[i]+":홀수");
	}
	
	
}
}
