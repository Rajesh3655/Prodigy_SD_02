package demo;
import java.util.*;
public class Task2 {
	static int num;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		int count=0;
		int rr=random();
//		System.out.println(rr);
		System.out.println("!.....GUESSING GAME.....!\n");
		while(0==0) 
		{
			System.out.println("Guess the number(the range is 0 to 99):");
			num=sc.nextInt();
			if((num>=0)&&(num<=99))
			{
				if(rr==num) 
				{
					System.out.println("yahhh congratulation you win....!\n");
					count++;
					System.out.println("you took "+count+" attempts to guess");
					break;
				}
				else {
					System.out.println("Sorry number not match..!");
					count++;
					int difference;
					if(num>rr) {
						difference=num-rr;
					}
					else {
						difference=rr-num;
					}
					int high=(rr+5);
					int low=(rr-5);
					if((difference<=10)&&(difference>0)) {
						System.out.println("!.....your guess is too low.....!\n");
						System.out.println("Hint:the number between "+low+" and "+high);
					}
					else if((difference<=20)&&(difference>10)) {
						System.out.println("!.....your guess is too low.....!\n");
						System.out.println("Hint:the number between "+low+" and "+high);
					}
					else if((difference<=30)&&(difference>20)) {
						System.out.println("!.....your guess is too low.....!\n");
						System.out.println("Hint:the number between "+low+" and "+high);
					}
					else if((difference<=40)&&(difference>30)) {
						System.out.println("!.....your guess is too low.....!\n");
						System.out.println("Hint:the number between "+low+" and "+high);
					}
					else if((difference<=50)&&(difference>40)) {
						System.out.println("!.....your guess is too low.....!\n");
						System.out.println("Hint:the number between "+low+" and "+high);
					}
					else if((difference<=99)&&(difference>50)) {
						System.out.println("!.....your guess is too high.....!\n");
					}
				}
			}
			else
			{
				System.out.println("please enter the number within the range(0 to 99):\n");
				count++;
			}
		}
	}
	public static int random() 
	{
		Random random=new Random();
		int rr=random.nextInt(99);
		return rr;
	}

}
