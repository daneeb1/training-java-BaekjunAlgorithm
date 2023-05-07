package beakjun.step06.beakjun1157;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 입력 및 초기화 
	
		String str = br.readLine().toUpperCase();	// 소문자를 대문자로 변환 
		
		int[] count = new int[26];	//대문자가 26개
		
		int maxValue = 0;
		char maxChar = '?';
		for(int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'A';
			if(maxValue < ++ count[index]) {
				maxValue = count[index];
				maxChar = str.charAt(i);
			}
			else if (maxValue == count[index])
				maxChar = '?';
		}
		
		bw.write(maxChar);
		bw.close();
		br.close();
		
		
		
	}

}
