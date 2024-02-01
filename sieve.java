//Alex Wilson
//Feb 1 2024
//Sieve of E. Project
//APCSA

import java.util.Scanner;

class sieve{
	public static void main(String[] args){
		int n;
		//User input number
		Scanner scan = new Scanner(System.in);
		System.out.print("Number:");
		n = scan.nextInt();
		//do sieve method to check
		int[] prime = sievem(n);
		//print out only prime numbers
		for(int i = 2; i <= n; i++){
			//print all positions in array that = -1
			if(prime[i] != -1){
				System.out.println(i);
			}	
		}
	}
	//sieve method
	static int[] sievem(int n){
		//array for prime and composite numbers
		int[] prime = new int[n+1];
		//putting all numbers up to n
		for(int i = 2; i<=n; i++){
			prime[i] = i;
		}
		//marking composites from 2 by multiplying each number by itself
		for(int i = 2; i * i <=n; i++){
			//checking if prime by seeing if it can be multiplied by another number
			if(prime[i] != -1){
				//setting multiples of primes to composite
				for(int j = i * i; j<=n; j+=i){
					//set primes to -1
					prime[j] = -1;
				}
			}
		}
	return prime;
	}
}
