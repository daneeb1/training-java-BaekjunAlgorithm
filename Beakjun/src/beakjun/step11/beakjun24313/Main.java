package beakjun.step11.beakjun24313;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a0 = sc.nextInt();
		
		int c = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		if(((a1*n)+ a0 <= c*n) && (c >= a1)){
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		
	}

}
