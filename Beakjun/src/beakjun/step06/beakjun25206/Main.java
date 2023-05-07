package beakjun.step06.beakjun25206;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double title = 0;	// 학점 * 과목평
		double sum = 0;	// 총 학점
		
		for(int i = 0; i < 20; i++) {
			String sub = sc.next();
			double grade = sc.nextDouble();
			String avg = sc.next();
			
			if (!avg.equals("P")) {
				title += grade;
			}
			
			if(avg.equals("A+")) {
				sum += grade * 4.5 ;
			}else if(avg.equals("A0")) {
				sum += grade * 4.0 ;
			}else if(avg.equals("B+")) {
				sum += grade * 3.5 ;
			}else if(avg.equals("B0")) {
				sum += grade * 3.0 ;
			}else if(avg.equals("C+")) {
				sum += grade * 2.5 ;
			}else if(avg.equals("C0")) {
				sum += grade * 2.0 ;
			}else if(avg.equals("D+")) {
				sum += grade * 1.5 ;
			}else if(avg.equals("D0")) {
				sum += grade * 1.0 ;
			}
			
		}
		
			System.out.printf("%.6f", (sum / title));
		
	}

}
