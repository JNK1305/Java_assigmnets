/*SET 1*/

/*  SET 1 - Q1

    Write a program that accepts an integer from the user and prints it.
    Input: A single integer
    Output: Same integer
    Example: Input: 11 → Output: 11
*/
import java.util.Scanner;
class User_input{
  public static void main (String []args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int num = sc.nextInt();

	System.out.println("The entered value is : "+ num);
  }
}

/*
    SET 1 - Q2
    Accept an integer n and print the sum of numbers from 1 to n.
    Example: Input: 10 → Output: 55
*/
import java.util.Scanner;
class User_input{
  public static void main (String []args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int num = sc.nextInt();
	int sum = 0;

	for(int i = 1;i<=num;i++){
		 sum = sum + i;
	}
	System.out.println("The sum of entered number is : "+ sum);
  }
}

/*
    SET 1 - Q3
    Accept an integer and print whether it is Odd or Even.
    Example: Input: 2 → Output: 2 is an Even Number
*/
import java.util.Scanner;
class User_input{
  public static void main (String []args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int num = sc.nextInt();

	if(num % 2==0){
		System.out.println(num + " is a even no .");
	}else{
		System.out.println(num + " is a odd no .");
	}
  }
}

/*
    SET 1 - Q4
    Accept 10 integers and print their sum and average.
    Example Input: 1 2 3 4 5 6 7 8 9 10
    Output: Sum = 55, Avg = 5.5
*/
import java.util.Scanner;
class User_input{
  public static void main (String []args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int num = sc.nextInt();
	int sum = 0;

	for(int i = 1;i<=num;i++){
		 sum = sum + i;
	}
	System.out.println("The sum of entered number is : "+ sum);

	double avg = sum / 10.0 ;
	System.out.println("The Average of entered number is : "+ avg);
  }
}

/*
    SET 1 - Q5
    Pattern:
    0000
    1111
    0000
    1111
*/
class Pattern{
  public static void main (String[]args){
	for(int i=1; i<= 4 ; i++){
		for(int j=1; j<= 4 ; j++){
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
    SET 2 - Q1
    Print squares of first 10 numbers.
    Example:
    Square of 1: 1
    Square of 2: 4
*/
class A{
  public static void main (String[]args){
	for(int i=1; i<=10 ; i++){
		int squr = i*i;
	System.out.println("The square of "+ i +" is " + squr);
	}
  }
}

/*
    SET 2 - Q2
    Print cubes of first 20 numbers.
    Example:
    Cube of 1: 1
    Cube of 2: 8
*/
class A{
  public static void main (String[]args){
	for(int i=1; i<=20 ; i++){
		int cube = i*i*i;
	System.out.println("Cube of" + i + ":" + cube);
	}
  }
}

/*
    SET 2 - Q3
    Print table of 2.
    Output: 2 4 6 8 10 12 14 16 18 20
*/
class A{
  public static void main (String[]args){
	for(int i=1; i<=10 ; i++){
		int table = i*2;
	System.out.print(table);
	}
  }
}

/*
    SET 2 - Q4
    Accept a number and print its table.
    Example Input: 4
    Output: 4 8 12 16 20 24 28 32 36 40
*/
import java.util.Scanner ;
class A{
  public static void main (String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a no :");
	int n = sc.nextInt();
	
	for(int i=1; i<=10 ; i++){
		int table = i*n;
	System.out.print(table + " ");
	}
  }
}

/*
    SET 2 - Q5
    Pattern:
    0
    0 0
    0 0 0
*/

class A{
  public static void main (String[]args){
	for(int i=1;i<=3;i++){
		for(int j=1;j<=i;j++){
			System.out.print("0");
		}
	System.out.println(" ");
	}
  }
}


/*
    SET 3 - Q1
    Accept two integers and print:
    - Their addition
    - Their subtraction (subtract using greater number)
    Example: 10 20 → Addition: 30, Subtraction: 10
*/
import java.util.Scanner;
class User_input{
  public static void main (String []args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int num1 = sc.nextInt();

	System.out.print("Enter second number : ");
	int num2 = sc.nextInt();

	int sum = num1 + num2;
	System.out.println("Addition : " + sum);

	int sub;
	if(num1 > num2){
		sub = num1 - num2;
	}
	else{
		sub = num2 - num1;
	}

	System.out.println("Subtraction : " + sub);
  }
}

/*
    SET 3 - Q2
    Accept two integers and print:
    - Multiplication
    - Division (use smaller number as divisor)
    Example Input: 10 20 → Multiplication: 200, Division: 2
*/
import java.util.Scanner;
class User_input{
  public static void main (String []args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int num1 = sc.nextInt();

	System.out.print("Enter second number : ");
	int num2 = sc.nextInt();

	int mul = num1 * num2;
	System.out.println("Multiplication : " + mul);

	int div;
	if(num1 > num2){
		div = num1 / num2;
	}
	else{
		div = num2 / num1;
	}

	System.out.println("Division : " + div);
  }
}

/*
    SET 3 - Q3
    Accept two integers and print:
    - Addition of their cubes
    - Subtraction of their squares
    Example: 10 & 20 → Cubes: 9000, Squares: 300
*/
import java.util.Scanner;
class User_input{
  public static void main (String []args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter first number : ");
	int n1 = sc.nextInt();

	System.out.print("Enter second number : ");
	int n2 = sc.nextInt();
	
	int cube_sum = (n1*n1*n1) + (n2*n2*n2);
	System.out.println("Addition of ther cubes : " + cube_sum);

	int squr_sub;
	if(n1 > n2){
		squr_sub = (n1*n1) - (n2*n2);
	}
	else{
		squr_sub = (n2*n2) - (n1*n1);
	}

	System.out.println("Subtraction : " + squr_sub);
  }
}

/*
    SET 3 - Q4
    Simple Calculator
    Accept operator: +, -, *, /
*/

import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char store = sc.next().charAt(0);

        double result;

        if(store == '+'){
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if(store == '-'){
            result = num1 - num2;
            System.out.println("Result: " + result);
        }
        else if(store == '*'){
            result = num1 * num2;
            System.out.println("Result: " + result);
        }
        else if(store == '/'){
            if(num2 == 0){
                System.out.println("Error");
            } else {
                result = num1 / num2;
                System.out.println("Result: " + result);
            }
        }
        else{
            System.out.println("Invalid..");
        }
    }
}


/*
    SET 3 - Q5
    Pattern:
    *
    * *
    * * *
    * * * *
*/
class A{
  public static void main (String[]args){
	for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
	System.out.println(" ");
	}
  }
}

/*
    SET 4 - Q1
    Pattern:
    1
    22
    333
    4444
*/
class A{
  public static void main (String[]args){
	for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
			System.out.print(i);
		}
	System.out.println(" ");
	}
  }
}

/*
    SET 4 - Q2
    Pattern:
    1
    2 3
    4 5 6
*/
class A{
  public static void main (String[]args){
	int count = 1;
	for(int i=1;i<=3;i++){
		for(int j=1;j<=i;j++){
			System.out.print(count);
			count++;
		}
	System.out.println(" ");
	}
  }
}

/*
    SET 4 - Q3
    Pattern starting from 7:
    7
    8 9
    10 11 12
*/
class A{
  public static void main (String[]args){
	int count = 7;
	for(int i=1;i<=3;i++){
		for(int j=1;j<=i;j++){
			System.out.print(count);
			count++;
		}
	System.out.println(" ");
	}
  }
}

  /*
    SET 4 - Q4
    Asterisk Pattern:
    *
    * *
    * * *
    * * * *
*/
class A{
  public static void main (String[]args){
	for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
	System.out.println(" ");
	}
  }
}

  /*
    SET 4 - Q5
    Factorial Program
    Example: Input: 5 → Output: 120
*/  
import java.util.Scanner;
class User_input{
  public static void main (String []args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number :");
	int num = sc.nextInt();
	int fact = 1;

	for(int i=1;i<=num;i++){
		fact = fact * i;
	}
	System.out.println("The Factorial of" + num + " is : " + fact);
  }
}
