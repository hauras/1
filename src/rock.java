//가위바위보

import java.util.Scanner;

public class rock {
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("가위 바위 보 게임입니다");
		System.out.println("가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String a = in.next(); 
		System.out.println("영희 >> ");
		String b = in.next();
		
		if (a.equals("가위"))
		{
			if(b.equals("가위"))
			{
				System.out.println("비겼습니다");
			}
			else if(b.equals("바위"))
			{
				System.out.println("졌습니다");
			}
			
			else if(b.equals("보"))
			{
				System.out.println("이겼습니다.");
			}
		
		else if(a.equals("바위"))
		{
			if(b.equals("바위"))
			{
				System.out.println("비겼습니다");
			}
			else if(b.equals("보"))
			{
				System.out.println("졌습니다");
			}
			
			else if(b.equals("가위"))
			{
				System.out.println("이겼습니다.");
			}	
		}
			
		else if(a.equals("보"))
			{
				if(b.equals("보"))
				{
					System.out.println("비겼습니다");
				}
				else if(b.equals("가위"))
				{
					System.out.println("졌습니다");
				}
				
				else if(b.equals("바위"))
				{
					System.out.println("이겼습니다.");
				}	
		else
			System.out.println("다시 입력하세요");
				
		}
	}
		}
	}
