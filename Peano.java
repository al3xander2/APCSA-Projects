/* Name
* 2024JAN26
* Peano
* Given the natural numbers there is always 
* a next largest natural number. We can find
* the successive natural number by adding one. 
* This program shall consists of methods that take
* two arbitrary natural numbers and use the
* successor function perform addition, 
* multiplication, and exponentiation.
*/

import java.util.Scanner;

class Peano {
	public static void main(String[] args) {
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter in number:");
		number = scan.nextInt();
		System.out.println("Successor:"+succ(number));
		System.out.println("Addition:"+add(succ(number), succ(number)));
		System.out.println("Multiplication:"+mult(succ(number), succ(number)));
		System.out.println("Exponentation:"+exp(succ(number), succ(number)));
		
	}
	static int succ(int number){
		return number + 1;
	}
	static int add(int number, int y){
		int counter = 1;
		while(counter < y){
			number = succ(number);
			counter = succ(counter);
		}
		return number;
	}
	static int mult(int number, int y){
		int result = 0;
		int counter = 0;
		while(counter<y){
			result = add(result, number);
			counter = succ(counter);
		}
		return result;
	}
	static int exp(int number, int y){
		int result = 1;
		int counter = 0;
		while(counter<y){
			result = mult(number, result);
			counter = succ(counter);
		}	
		return result;
	}
}
