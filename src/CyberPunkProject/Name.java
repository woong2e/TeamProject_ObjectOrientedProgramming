package CyberPunkProject;

import java.util.Scanner;

public class Name {

	public static void setName() {
		System.out.println(" ");
		System.out.println("이름을 입력하세요. ");
		System.out.println(" ");
		Scanner in = new Scanner(System.in);
		String n = in.next();
		Me.name = n;
		System.out.println("이름이 " + n + "으로 설정되었습니다. ");
		System.out.println(" ");
	}

}