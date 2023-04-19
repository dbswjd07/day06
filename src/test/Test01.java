package test;

public class Test01 {
public static void main(String[] args) {
	int arr[] = {10,54,13,17,25,30};
	int index=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			System.out.println("짝수: "+arr[i]);
		}else {
			System.out.println("홀수: "+arr[i]);
			
		}
	}
	
	System.out.println("===============");
	for(int i:arr) {
		if(arr[index]%2==0) {
			System.out.println("짝수: "+arr[index]);
		}else {
			System.out.println("홀수: "+arr[index]);
		}
		
		index++;
	}
	
}
}
