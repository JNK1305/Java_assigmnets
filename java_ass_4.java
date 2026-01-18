/*Programming Practice Questions (35) Patterns,
Single Loop & Digit Extraction With Test Cases &
Output*/

/*Section 1: Pattern Problems (1–10)*/

//1. Solid Star Box
//Input: N = 4
//Output:
//****
//****
//****
//**** 

class A{
  public static void main(String [] args){
	int N = 4;
	for(int i =1;i<=N;i++){
		for(int j=1;j<=N;j++){
			System.out.print("*");
		}
		System.out.println();
	}
  }
}

// 2. Hollow Star Box
// Input: N = 5
// Output:
// *****
// *   *
// *   *
// *   *
// *****

class B{
  public static void main(String [] args){
	int N = 5;
	for(int i =1;i<=N;i++){
		for(int j=1;j<=N;j++){
			if(i==1||i==5||j==1||j==5){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
  }
}


// 3. Right Angled Triangle
// Input: N = 5
// Output:
// *
// * *
// * * *
// * * * *
// * * * * *

class C{
  public static void main(String [] args){
	int N = 5;
	for(int i =1;i<=N;i++){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
  }
}

// 4. Inverted Right Angled Triangle
// Input: N = 4
// Output:
// * * * *
// * * *
// * *
// *

class D{
  public static void main(String [] args){
	int N = 4;
	for(int i=N;i>=1;i--){
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
  }
}


// 5. Number Triangle
// Input: N = 4
// Output:
// 1
// 1 2
// 1 2 3
// 1 2 3 4

class E{
  public static void main(String [] args){
	int N = 4;
	for(int i=1;i<=N;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j);
		}
		System.out.println();
	}
  }
}

// 6. Row Number Triangle
// Input: N = 4
// Output:
// 1
// 2 2
// 3 3 3
// 4 4 4 4

class F{
  public static void main(String [] args){
	int N = 4;
	for(int i=1;i<=N;i++){
		for(int j=1;j<=i;j++){
			System.out.print(i);
		}
		System.out.println();
	}
  }
}

// 7. Character Triangle
// Input: N = 4
// Output:
// A
// A B
// A B C
// A B C D

class G {
    public static void main(String[] args) {
        int N = 4;
        for (int i = 1; i <= N; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}

// 8. Centered Pyramid
// Input: N = 4
// Output:
//    *
//   * *
//  * * *
// * * * *

class H{
    public static void main(String[] args) {
        int N = 4;
    }
}

// 9. Inverted Pyramid
// Input: N = 4
// Output:
// * * * *
//  * * *
//   * *
//    *

class I{
    public static void main(String[] args) {
        int N = 4;
    }
}

// 10. 0-1 Triangle
// Input: N = 4
// Output:
// 1
// 0 1
// 1 0 1
// 0 1 0 1

class J{
  public static void main(String[]args){
	int N = 4;
	for(int i=1;i<=N;i++){
		for(int j=1;j<=i;j++){
			if((i+j)% 2 == 0){
				System.out.print("1 ");
			}else{
				System.out.print("0 ");
			}
		}
		System.out.println();
	}
  }
}

/* Section 2: Single For Loop Questions (11–20) */

// 11. Print numbers from 1 to N
// Input: N = 5
// Output:
// 1 2 3 4 5

class K{
  public static void main(String[]args){
	int N = 5;
	for(int i=1;i<=N;i++){
		System.out.print(i+" ");
	}
  }
}

// 12. Print numbers from N to 1
// Input: N = 5
// Output:
// 5 4 3 2 1

class L{
  public static void main(String[]args){
	int N = 5;
	for(int i=N;i>=1;i--){
		System.out.print(i+" ");
	}
  }
}

// 13. Print even numbers from 1 to N
// Input: N = 10
// Output:
// 2 4 6 8 10

class M{
  public static void main(String[]args){
	int N = 10;
	for(int i=1;i<=N;i++){
		if(i%2==0){
		System.out.print(i+" ");
		}
	}
  }
}

// 14. Sum of first N natural numbers
// Input: N = 5
// Output:
// 15

class N{
  public static void main(String[]args){
	int N = 5;
	int sum = 0;
	for(int i=1;i<=N;i++){
		sum = sum + i;
	}
	System.out.println(sum);
  }
}

// 15. Multiplication table
// Input: N = 3
// Output:
// 3 x 1 = 3
// 3 x 2 = 6
// 3 x 3 = 9

class O{
  public static void main(String[]args){
	int N = 3;
	for(int i=1;i<=10;i++){
		System.out.println(N +"x"+"="+ N*i);
	}
  }
}

// 16. Factorial of a number
// Input: N = 5
// Output:
// 120

class P{
  public static void main(String[]args){
	int N = 5;
	int fact = 1;
	for(int i=1;i<=N;i++){
		fact = fact * i;
	}
	System.out.println(fact);
  }
}

// 17. Print squares from 1 to N
// Input: N = 4
// Output:
// 1 4 9 16

class Q{
  public static void main(String[]args){
	int N = 4;
	for(int i=1;i<=N;i++){
		int squr = i*i;
		System.out.print(squr + " ");
	}
  }
}


// 18. Print cubes from 1 to N
// Input: N = 3
// Output:
// 1 8 27

class R{
  public static void main(String[]args){
	int N = 3;
	for(int i=1;i<=N;i++){
		int cube = i*i*i;
		System.out.print(cube + " ");
	}
  }
}

// 19. Count numbers from 1 to N
// Input: N = 7
// Output:
// 7

class S{
  public static void main(String[]args){
	int N = 7;
	int count = 0;
	for(int i=1;i<=N;i++){
		count++;
	}
	System.out.print(count);
  }
}

// 20. Numbers divisible by 5
// Input: N = 20
// Output:
// 5 10 15 20

class T{
  public static void main(String[]args){
	int N = 20;
	for(int i=1;i<=N;i++){
		if(i%5==0){
		System.out.print(i+" ");
		}
	}
  }
}

/*Section 3: Digit Extraction Problems (21–35)*/

// 21. Print all digits of a number
// Input: N = 1234
// Output:
// 4
// 3
// 2
// 1

class U{
  public static void main(String[]args){
	int N = 1234;
	while(N>0){
		int rem = N % 10;
		System.out.println(rem);
		N = N / 10;
	}
  }
}

// 22. Count number of digits
// Input: N = 98765
// Output:
// 5

class V{
  public static void main(String[]args){
	int N = 98765;
	int count = 0;
	while(N>0){
		int rem = N % 10;
		count++;
		N = N / 10;
	}
	System.out.println(count);
  }
}

// 23. Sum of digits
// Input: N = 123
// Output:
// 6

class W{
  public static void main(String[]args){
	int N = 123;
	int sum = 0;
	while(N>0){
		int rem = N % 10;
		sum = sum + rem ;
		N = N / 10;
	}
	System.out.println(sum);
  }
}

// 24. Reverse a number
// Input: N = 456
// Output:
// 654

class X{
  public static void main(String[]args){
	int N = 456;
	int rev = 0;
	while(N>0){
		int rem = N % 10;
		rev = rev*10+rem;
		N = N / 10;
	}
	System.out.print(rev);
  }
}

// 25. Palindrome check
// Input: N = 121
// Output:
// Palindrome

class Y{
  public static void main(String[]args){
	int N = 121;
	int temp = N;
	int rev = 0;
	while(N>0){
		int rem = N % 10;
		rev = rev*10+rem;
		N = N / 10;
	}
	if(temp==rev){
		System.out.println("Palindrome");
	}else{
		System.out.println("Not Palindrome");
	}
  }
}

// 26. Product of digits
// Input: N = 234
// Output:
// 24

class Z{
  public static void main(String[]args){
	int N = 234;
	int mul = 1;
	while(N>0){
		int rem = N % 10;
		mul = mul * rem;
		N = N / 10;
	}
	System.out.print(mul);
  }
}

// 27. Largest digit
// Input: N = 5893
// Output:
// 9

class AA{
  public static void main(String[]args){
	int N = 5893;
	int max = 0;
	while(N>0){
		int rem = N % 10;
			if(rem>max){
			 	max = rem ;
		}
		N = N / 10;
	}
	System.out.println(max);
  }
}

// 28. Smallest digit
// Input: N = 9421
// Output:
// 1

class BB{
  public static void main(String[]args){
	int N = 9421;
	int min = 9;
	while(N>0){
		int rem = N % 10;
			if(rem<min){
			 	min = rem ;
		}
		N = N / 10;
	}
	System.out.println(min);
  }
}

// 29. Count even and odd digits
// Input: N = 12345
// Output:
// Even: 2
// Odd: 3

class CC{
  public static void main(String[]args){
	int N = 12345;
	int even = 0;
	int odd = 0;
	while(N>0){
		int rem = N % 10;
			if(rem % 2 == 0){
			 	even++ ;
			}else{
				odd++;
			}
		N = N / 10;
	}
	System.out.println("Even no count :" + even);
	System.out.println("Odd no count :" + odd);
  }
}

// 30. Harshad Number
// Input: N = 18
// Output:
// Harshad Number

class DD{
  public static void main(String[]args){
	int N = 18;
	int sum = 0;
	while(N>0){
		int rem = N % 10;
		sum = sum + rem;
		N = N / 10;
	}
	if(sum % 9 == 0){
		System.out.println("Harshad Number");
	}else{
		System.out.println("Not a Harshad Number");
	}
  }
}
// 31. Last digit of number
// Input: N = 5789
// Output:
// 9

class EE{
  public static void main(String[]args){
	int N = 5789;
	int rem = N % 10;
		System.out.println("Last no :" + rem);
  }
}

// 32. First digit of number
// Input: N = 5789
// Output:
// 5

class FF{
  public static void main(String[]args){
	int N = 5789;
	int rev = 0;
		while(N>0){
			int rem = N % 10;
			rev = rev * 10 + rem;
			N = N / 10;
		}
		int remm = rev % 10 ;
		System.out.println("First no :" + remm);
  }
}

// 33. First and Last digit
// Input: N = 5789
// Output:
// First Digit: 5
// Last Digit: 9

class GG{
  public static void main(String[]args){
	int N = 5789;
	int temp = N;
	int rev = 0;
		while(N>0){
			int rem = N % 10;
			rev = rev * 10 + rem;
			N = N / 10;
		}
		int remm = rev % 10 ;
		System.out.println("First digit :" + remm);
	int rem = temp % 10;
		System.out.println("Last digit :" + rem);

  }
}

// 34. Middle digit (odd digits)
// Input: N = 12345
// Output:
// 3

class HH{
  public static void main(String[]args){
	int N = 123456;
	int count = 0;
	while(N>0){
		int rem = N % 10;
		count++;
		N = N / 10;
	}
	int mid = count/2;
	System.out.print(mid);
  }
}

// 35. Two middle digits (even digits)
// Input: N = 123456
// Output:
// 34

class II{
  public static void main(String[]args){
	int N = 123456;
	int count = 0;
	while(N>0){
		int rem = N % 10;
		count++;
		N = N / 10;
	}
	int mid = count/2;
	System.out.print(mid);
	System.out.print(mid+1);
  }
}