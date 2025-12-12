/*
DailyFlash Set 1 - Program 1
Write a Program to print all the numbers between 1 to 100 
that are divisible by 3 or 5.
Output: 3 5 6 9 10 ... 99 100
*/  
class A {
  public static void main(String[]args){
System.out.println("The numbers between 1 to 100 which is divisible by 3 or 5:");
	for(int i=1;i<=100;i++){
		if(i%3==0||i%5==0){
			System.out.print(i + " ");
		}
	}
  }
}
/*
DailyFlash Set 1 - Program 2
Write a Program to print all the numbers between 1 to 100 
that are divisible by 4 and 7.
Output: 28 56 84
*/ 
class A {
  public static void main(String[]args){
System.out.println("The numbers between 1 to 100 which is divisible by 4 and 7:");
	for(int i=1;i<=100;i++){
		if(i%4==0 && i%7==0){
			System.out.print(i + " ");
		}
	}
  }
}
 
/*
DailyFlash Set 1 - Program 3
Print Cubes and Squares of all Odd numbers up to given input.
Input: 10
Output:
Cube of 1 : 1 and Square of 1 : 1
Cube of 3 : 27 and Square of 3 : 9
Cube of 5 : 125 and Square of 5 : 25
Cube of 7 : 343 and Square of 7 : 49
Cube of 9 : 729 and Square of 9 : 81
*/  
import java.util.Scanner;
class A {
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number :");
	int num = sc.nextInt();
	
	for(int i=1;i<=num;i++){
		if(i%2 !=0){
		int squr = i*i;
		int cube = i*i*i;

System.out.println("Cube of " + i + ":" + cube + " and " + "Square of " + i + ":" + squr);
		}

	}
  }
}

/*
DailyFlash Set 1 - Program 4
Pattern:
0
11
000
1111
00000
*/ 
class A{
  public static void main(String[]args){
	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			if(i%2==0){
				System.out.print("1");
			}else{
				System.out.print("0");
			}
		}
	System.out.println();
	}
  }
}

 /*
DailyFlash Set 1 - Program 5
Accept an integer and print all perfect divisors.
Input: 24
Output: Perfect Divisors of 24 are: 2 3 4 6 8 12
*/  
import java.util.Scanner;
class A{
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int num = sc.nextInt();	
	
	System.out.println("All perfect divisors of " + num + ":");
	for(int i=2;i<=num/2;i++){
		if(num % i ==0){
			System.out.println(i);
		}
	}
  }
}



/*
DailyFlash Set 2 - Program 1
Print series of odd numbers between two inputs.
Input: Min = 4, Max = 60
Output: 5, 7, 9, ... 59
*/ 
import java.util.Scanner;
class A{
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number :");
	int min = sc.nextInt();
	
	System.out.print("Enter a second number :");
	int max = sc.nextInt();

	System.out.print("Odd no between range " + min + " to "+ max + ":"); 
	for(int i=min;i<=max;i++){
		if(i%2 !=0){
			System.out.print(i + " ");
		}
	}
  }
}

 /*
DailyFlash Set 2 - Program 2
Accept two integers and swap them.
Input: 20 30
Output:
Before Swap: 20 30
After Swap : 30 20
*/  
import java.util.Scanner;

class A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int n2 = sc.nextInt();

        System.out.println("Numbers before swap: " + n1 + " " + n2);

        int c = n1; 
        n1 = n2;    
        n2 = c;     

        System.out.println("Numbers after swap: " + n1 + " " + n2);
    }
}


/*
DailyFlash Set 2 - Program 3
Print Cubes and Squares of all even numbers up to given input.
Input: 10
Output:
Cube of 2 : 8 and Square of 2 : 4
Cube of 4 : 64 and Square of 4 : 16
Cube of 6 : 216 and Square of 6 : 36
Cube of 8 : 512 and Square of 8 : 64
Cube of 10 : 1000 and Square of 10 : 100
*/
import java.util.Scanner;
class A {
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number :");
	int min = sc.nextInt();
	
	System.out.print("Enter a second number :");
	int max = sc.nextInt();
	
	for(int i=min;i<=max;i++){
		if(i%2 ==0){
		int squr = i*i;
		int cube = i*i*i;

System.out.println("Cube of " + i + ":" + cube + " and " + "Square of " + i + ":" + squr);
		}
	}
  }
}


 /*
DailyFlash Set 2 - Program 4
Pattern:
a
AA
aaa
AAAA
aaaaa
*/ 
class A{
  public static void main(String[]args){
	for(int i=1;i<=5;i++){
		for(int j=1;j<=i;j++){
			if(i%2==0){
				System.out.print("A");
			}else{
				System.out.print("a");
			}
		}
	System.out.println();
	}
  }
}
 
/*
DailyFlash Set 2 - Program 5
Accept two integers and print maximum.
Input: 56 99
Output: Maximum = 99
*/  
import java.util.Scanner;
class A {
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number :");
	int n1 = sc.nextInt();
	
	System.out.print("Enter a second number :");
	int n2 = sc.nextInt();
	
	if(n1>n2){
		System.out.print("Maximum number :" + n1);
	}else{
		System.out.print("Maximum number :" + n2);
	}
  }
}



/*
DailyFlash Set 3 - Program 1
Print series of Even numbers between two inputs.
Input: Min = 4, Max = 60
Output: 4, 6, 8, ... 60
*/ 
import java.util.Scanner;
class A{
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number :");
	int min = sc.nextInt();
	
	System.out.print("Enter a second number :");
	int max = sc.nextInt();

	System.out.print("Even no between range " + min + " to "+ max + ":"); 
	for(int i=min;i<=max;i++){
		if(i%2 ==0){
			System.out.print(i + " ");
		}
	}
  }
}
 
/*
DailyFlash Set 3 - Program 2
Print minimum of two numbers.
Input: 56 99
Output: Minimum = 56
*/
import java.util.Scanner;
class A {
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number :");
	int n1 = sc.nextInt();
	
	System.out.print("Enter a second number :");
	int n2 = sc.nextInt();
	
	if(n1<n2){
		System.out.print("Minimum number :" + n1);
	}else{
		System.out.print("Minimum number :" + n2);
	}
  }
}

/*
DailyFlash Set 3 - Program 3
Calculate Velocity = Distance / Time.
Input: Distance = 100m, Time = 20 sec
Output: Velocity = 5 m/s
*/  
import java.util.Scanner;
class A {
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter Distance :" );
	int Distance = sc.nextInt();

	System.out.print("Enter Time :");
	int Time = sc.nextInt();

	int Velocity = Distance / Time ;
	System.out.println("Velocity = " + Velocity + " m/s");
  }
}


/*
DailyFlash Set 3 - Program 4
Pattern:
1
4 9
16 25 36
49 64 81 100
*/ 
class A{
  public static void main(String[]args){
	int count = 1;
	for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
			System.out.print(count*count + " ");
			count++;
		}
	System.out.println();
	}
  }
}
 
/*
DailyFlash Set 3 - Program 5
Accept three integers and print maximum.
Input: 56 7 99
Output: Maximum = 99
*/
import java.util.Scanner;
class A {
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number :");
	int n1 = sc.nextInt();
	
	System.out.print("Enter a second number :");
	int n2 = sc.nextInt();

	System.out.print("Enter a third number :");
	int n3 = sc.nextInt();
	
	if(n1>n2 && n1>n3){
		System.out.print("Maximum number :" + n1);
	}else if (n2>n1 && n2>n3){
		System.out.print("Maximum number :" + n2);
	}else{
		System.out.print("Maximum number :" + n3);
	}
  }
}



/*
DailyFlash Set 4 - Program 1
Check Perfect Number.
Input: 6
Output: 6 is a Perfect number.
*/  
import java.util.Scanner;
class A{
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int num = sc.nextInt();
	int temp = num ;
	int sum = 0;	
	
	for(int i=1;i<=temp/2;i++){
		if(temp % i ==0){
			sum = sum + i;
		}
	}

	if(sum ==temp){
		System.out.println(num + " is a perfect no ..! ");
	}else{
		System.out.println(num + " is not a perfect no ..! ");
	

	}
  }
}

/*
DailyFlash Set 4 - Program 2
Print factorial of all numbers between two inputs.
Input: 1 to 5
Output:
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
*/
import java.util.Scanner;
class A {
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first number :");
	int num1 = sc.nextInt();

	System.out.print("Enter second number :");
	int num2 = sc.nextInt();
	int fact = 1;
	
	for(int i=num1;i<=num2;i++){
		fact = fact * i;
		System.out.println("The factorial of " + i + ":" +fact );
	}
  }
}
  
/*
DailyFlash Set 4 - Program 3
Implement Ohm’s Law: V = I * R
Input: I = 10 amp, R = 5
Output: Voltage = 50
*/  
import java.util.Scanner;
class A {
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	//To check ohm's law

	System.out.print("Enter current (I) :" );
	int I = sc.nextInt();

	System.out.print("Enter resistance (R) :");
	int R = sc.nextInt();

	int V = I*R;
	System.out.println("Voltage = " + V);
  }
}


/*
DailyFlash Set 4 - Program 4
Pattern:
1
8 27
64 125 216
343 512 729 1000
*/  
class A{
  public static void main(String[]args){
	int count = 1;
	for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
			System.out.print(count*count*count + " ");
			count++;
		}
	System.out.println();
	}
  }
}

/*
DailyFlash Set 4 - Program 5
Print minimum of three numbers.
Input: 56 7 99
Output: Minimum = 7
*/  
import java.util.Scanner;
class A {
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a first number :");
	int n1 = sc.nextInt();
	
	System.out.print("Enter a second number :");
	int n2 = sc.nextInt();

	System.out.print("Enter a third number :");
	int n3 = sc.nextInt();
	
	if(n1<n2 && n1<n3){
		System.out.println("Minimum number :" + n1);
	}else if (n2<n1 && n2<n3){
		System.out.println("Minimum number :" + n2);
	}else{
		System.out.println("Minimum number :" + n3);
	}
  }
}
