/*DIGIT EXTRACTION PROGRAMS*/


/*
1. Extract digits of a number
Input: 1234
Output: 1 2 3 4
Test Case: 987 -> 9 8 7
*/
class A{
  public static void main(String[]args){
	int n = 1234;
	int rev=0;

	while(n>0){
		int rem = n % 10;
		rev = rev * 10 + rem;
		n = n / 10;
	}
	while(rev>0){
		int new_rem = rev % 10;
		System.out.print(new_rem + " ");
		rev = rev / 10;
	}
  }
}

/*
2. Count digits of a number
Input: 12345
Output: 5
Test Case: 900 -> 3
*/
class B{
  public static void main(String[]args){
  	int n = 12345;
	int count = 0;

	while(n>0){
		int rem = n % 10 ;
		count++;
		n = n / 10;
	}
	System.out.println(count);
  }
}

/*
3. Sum of digits
Input: 1234
Output: 10
Test Case: 505 -> 10
*/
class C {
  public static void main(String[]args){
  	int n = 1234;
	int sum = 0;

	while(n>0){
		int rem = n % 10 ;
		sum = sum + rem ;
		n = n / 10;
	}
	System.out.println(sum);

  }
}

/*
4. Product of digits
Input: 234
Output: 24
Test Case: 505 -> 0
*/
class D{
  public static void main(String[]args){
  	int n = 234;
	int mul = 1;

	while(n>0){
		int rem = n % 10 ;
		mul = mul * rem ;
		n = n / 10;
	}
	System.out.println(mul);

  }
}

/*
5. Reverse number (NO STRING)
Input: 1234
Output: 4321
Test Case: 900 -> 9
*/
class E{
  public static void main(String[]args){
  	int n = 1234;
	int rev = 0;

	while(n>0){
		int rem = n % 10 ;
		rev = rev *10 + rem ;
		n = n / 10;
	}
	System.out.println(rev);

  }
}

/*
6. Check Duck Number
Input: 1023
Output: Duck Number
Test Case: 123 -> Not Duck
*/
import java.util.Scanner;
class F{
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a no :");
  	int n = sc.nextInt();
	boolean isDuck = false;

	while(n>0){
		int rem = n % 10;
			if(rem == 0){
				isDuck = true;
				break;
			}
		n = n / 10;
	}
	if(isDuck){
		System.out.println("Duck no !");
	}else{
		System.out.println("Not Duck no !");
	}
  }
}

/*
7. First & Last digit
Input: 5678
Output: First=5, Last=8
Test Case: 9001 -> First=9, Last=1
*/
class G {
    public static void main(String[] args) {
        int n = 5678;
        int first, last;

        int temp = n; 

        last = n % 10;

        while (temp >= 10) {
            temp = temp / 10;
        }
        first = temp;

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}

/*
8. Middle digits
Input: 12345
Output: 234
Test Case: 9876 -> 87
*/
import java.util.Scanner;
class H{
  public static void main(String[]args){
  	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a no:");
	int n = sc.nextInt();
	
  }
}


/*
9. Palindrome number
Input: 121
Output: Palindrome
Test Case: 123 -> Not Palindrome
*/
import java.util.Scanner;

class I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n; 
        int rev = 0;

        while (temp > 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (rev == n) {
            System.out.println("Palindrome no!");
        } else {
            System.out.println("Not Palindrome no!");
        }
    }
}

/*
10. Largest digit in a number
Input: 4839
Output: 9
Test Case: 250 -> 5
*/
import java.util.Scanner;

class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int max = 0; 

        while (temp > 0) {
            int rem = temp % 10;

            if (rem > max) {
                max = rem;
            }

            temp = temp / 10;
        }

        System.out.println("Largest digit: " + max);
    }
}



 /*ARRAY PROGRAMS*/ 

/*
1. Take array from user & print elements
Input: n=5, arr = 1 2 3 4 5
Output: 1 2 3 4 5
*/
import java.util.Scanner;
class K{
  public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter size of array :");
	int n = sc.nextInt();

  	int [] arr = new int[n];
	
  }
}

/*
2. Find largest element
Input: 10 20 5 7
Output: 20
Test Case: 3 9 2 -> 9
*/
class L
  public static void main(String[]args){
  	int []arr = {10,20,5,7};
	int max = arr[0];
	
	for(int i=0;i<arr.length;i++){
		if (arr[i]>max){
			max = arr[i];
		}	
			
	System.out.println("Largest element: " + max);
	}
  }
}


/*
3. Find smallest element
Input: 10 20 5 7
Output: 5
Test Case: 3 9 2 -> 2
*/
class M{
  public static void main(String[]args){
  	int []arr = {10,20,5,7};
	int min = arr[0];
	
	for(int i=0;i<arr.length;i++){
		if (arr[i]<min){
			min = arr[i];
		}		
	}
	System.out.println("Smallest element: " + min);
  }
}


/*
4. Sum of array elements
Input: 1 2 3 4
Output: 10
Test Case: 10 10 -> 20
*/
class N
  public static void main(String[]args){
  	int []arr = {1,2,3,4};
	int sum = 0;
	
	for(int i=0;i<arr.length;i++){
		sum = sum + arr[i];
	}
	System.out.println("Sum of elements in array :" + sum);
  }
}

/*
5. Count even & odd numbers
Input: 1 2 3 4 5
Output: Even=2 Odd=3
Test Case: 2 4 6 -> Even=3 Odd=0
*/
 class O{
  public static void main(String[]args){
  	int []arr = {1,2,3,4,5};
	int evencount = 0;
	int oddcount = 0;

	
	for(int i=0;i<arr.length;i++){
		if(arr[i] % 2 ==0){
			evencount++;
		}else{
			oddcount++;
		}
	}
	System.out.println("Count of even elements in array : "+evencount);
	System.out.println("Count of even elements in array : "+oddcount);
  }
}


/*
6. Reverse array
Input: 1 2 3 4
Output: 4 3 2 1
Test Case: 5 6 -> 6 5
*/
class P{
  public static void main(String[]args){
  	int []arr = {1,2,3,4};

	for(int i=arr.length-1;i>=0;i++){
		System.out.println(arr[i]);
	}
  }
}

/*
7. Linear search
Array: 10 20 30 40
Search: 30
Output: Found
Test Case: Search 50 -> Not Found
*/
class Q{
  public static void main(String[]args){
  	int [] arr = {10,20,30,40};
	int Search = 30;
	Boolean isfound = false;

	for(int i=0;i<arr.length;i++){
		if(arr[i]==search){
			isfound = true;
			break;
		}
	}
	if(isfound){
		System.out.println("Found");
	}else{
		System.out.println("Not Found ");
	}
  }
}

/*
8. Second largest element
Input: 10 20 30 5
Output: 20
Test Case: 5 1 3 -> 3
*/
class R{
  public static void main(String[]args){
  	int []arr = {10,20,5,7};
	int max = arr[0];
	
	for(int i=0;i<arr.length;i++){
		if (arr[i]>max){
			max = arr[i-1];
		}	
	}
	System.out.println("Largest element: " + max);
  }
}

/*
9. Sort array (Ascending)
Input: 5 2 8 1
Output: 1 2 5 8
Test Case: 9 7 -> 7 9
*/
class S{
  public static void main(String[]args){
	int [] arr = {5,2,8,1};
	
	for(int i=0;i<arr.length;i++){
		if(){
			
		}
	}
	System.out.println();
  }
}


/*
10. Frequency of an element
Array: 1 2 2 3 2
Element: 2
Output: 3
Test Case: element=5 -> 0
*/
class U{
  public static void main(String[]args){
  	int []arr = {1,2,2,3,2};
	int count = 0;
	int search = 2;

	for(int i=0;i<arr.length;i++){
		if(arr[i]==search){
			count++;
		}
	}
	System.out.println("Count of that elemwnt:"+ count);
  }
}



