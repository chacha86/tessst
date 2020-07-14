package java_board;

import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String cmd = "";
		
		while(true) {
			cmd = sc.nextLine();
			
			if(cmd.equals("exit")) {
				System.out.println("program exit");
				break;
			} else if(cmd.equals("add")) {
				System.out.print("제목을 입력해주세요 : ");
				//sc.nextLine();
				String title = sc.nextLine();
				System.out.print("내용을 입력해주세요 : ");
				String body = sc.nextLine();
				System.out.println(title + ", " + body);
			} else if(cmd.equals("show")) {
				
			}
		}
		
	}
}
