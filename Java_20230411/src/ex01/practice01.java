package ex01;

import java.util.Scanner;

/*
 * 1. 몇개의 숫자를 받을지 물어보는 코드를 작성하고,
 * 2. 숫자를 받아서 짝수의 값만 합해서 나오는 코드를 작성하시오.
 * 3. 소수점이나 문자를 받으면 다시 쓰라고 해야하며 일을 끝내야 함.
 */
public class practice01 {

	public static void main(String[] args) {
		
		int count=0;
		int num;
		int sum=0;
		int i;
		Scanner sc = new Scanner(System.in);
		
		
		for(i = count; ;) {
		System.out.println("몇개의 숫자를 입력하시겠습니까?");
		num = sc.nextInt();
		//숫자를 입력하세요
		
		System.out.println(num);
		}
			
//		sum +=num;
		
//		System.out.println(sum);

	}

}
