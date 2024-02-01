//Alex Wilson
//01/23/24
//Guessing Game

//Math.random

import java.util.Scanner;
import java.lang.Math;
class guessingnumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int target = (int)(Math.random()*100);
		int numberinput;
		System.out.print("Guess the Integer:");
		numberinput = scan.nextInt();
		while(target != numberinput){
			if(target>numberinput){
			System.out.println("Try a Bigger number!");
			}
			else{
				System.out.println("Try a smaller number!");
			}
			System.out.print("Try Again:");
			numberinput = scan.nextInt();
		}
		if(target == numberinput){
			System.out.println("Congrat! You Guessed It!");
		}
	}
}
