//Alex Wilson 

//Jan 22 2024

//Leap Year

//Ca;culates if a year that is inputed is a leap year or not.

import java.util.Scanner;

class LeapYear {
	public static void main(String[] args){
		double year;
		Scanner sc = new Scanner(System.in);
		System.out.print("What year is it:");
		year = sc.nextDouble();
		
		if(year % 100 == 0){
			if(year % 400 == 0){
				System.out.println("This is a leap year!");
			}
			else{
				System.out.println("This is not a leap year!");
			}
		}
		else if(year%4==0){
			System.out.println("This is a leap year!");
		}
		else{
			System.out.println("This is not a leap year :(");
		}
	}
}
