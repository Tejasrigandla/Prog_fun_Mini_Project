import java.util.Scanner;

import javax.swing.SwingConstants;

public class MiniProject {

	public static void main(String[] args) {
		int choice;
		char repeat = 'y';
		Scanner sc = new Scanner(System.in);

		while (repeat == 'y' || repeat == 'Y') {

			System.out.println("1. Addition");
			System.out.println("2. Substraction");
			System.out.println("3. Multiplication");
			System.out.println("4.Division");
			System.out.println("6.armstrong number");
			System.out.println("7.Palindrome number");
			System.out.println("8.reverse number");
			System.out.println("9.table");
			System.out.println("10.evenodd");
			System.out.println("11.factorial");
			System.out.println("12.prime number");
			System.out.println("13.pyramid");
			System.out.println("14.pattern");
			System.out.println("15.Search");
			System.out.println("16.Sorting");
			System.out.println("17.leapyear");
			System.out.println("18.Digit add");

			System.out.println("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				sub();
				break;
			case 3:
				mul();
				break;
			case 4:
				div();
				break;
			case 5:
				mod();
				break;
			case 6:
				armstrong();
				break;
			case 7:
				palindrome();
				break;
			case 8:
				reversenumber();
				break;
			case 9:
				table();
				break;
			case 10:
				evenodd();
				break;
			case 11:
				factorial();
				break;
			case 12:
				prime();
				break;
			case 13:
				pyramid();
				break;
			case 14:
				pattern();
				break;
			case 15:
				search();
				break;
			case 16:
				sorting();
				break;
			case 17:
				leapyear();
				break;
			case 18:
				digitadd();
				break;

			default:
				System.err.println("Incorrect choice");
			}

			System.out.println("Do you want to continue (y/n) : ");
			repeat = sc.next().charAt(0);
		}

	}

	static void add() {
		System.out.println("Enter a & b values");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// int a = 10, b=20;

		int c = a + b;

		System.out.println(c);
	}

	static void sub() {
		System.out.println("Enter a & b values");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a - b;

		System.out.println(c);
	}

	static void mul() {
		System.out.println("Enter a & b values");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a * b;

		System.out.println(c);
	}

	static void div() {
		System.out.println("Enter a & b values");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a / b;

		System.out.println(c);
	}

	static void mod() {
		System.out.println("Enter a & b values");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = a % b;

		System.out.println(c);
	}

	static void armstrong() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int originalNumber = number;
		int result = 0;
		int digits = 0;

		// Count the number of digits
		int temp = number;
		while (temp != 0) {
			temp /= 10;
			digits++;
		}

		// Calculate the sum of the power of each digit
		temp = number;
		while (temp != 0) {
			int remainder = temp % 10;
			result += Math.pow(remainder, digits);
			temp /= 10;
		}

		// Check if the number is an Armstrong number
		if (result == originalNumber) {
			System.out.println(originalNumber + " is an Armstrong number.");
		} else {
			System.out.println(originalNumber + " is not an Armstrong number.");
		}
	}

	static void palindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = sc.nextInt();
		int originalNumber = a; // Store the original number

		int r, sum = 0;
		while (a != 0) {
			r = a % 10;
			sum = (sum * 10) + r;
			a = a / 10;
		}

		if (originalNumber == sum) { // Compare with the original number, not 'a'
			System.out.println("It's a Palindrome number");
		} else {
			System.out.println("Not a palindrome");
		}
	}

	static void reversenumber() {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int digit;
		while (a != 0) {
			digit = a % 10;
			System.out.println(digit);
			a /= 10;
		}
	}

	static void table() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no ");
		int number = sc.nextInt();
		// int num=sc.nextInt();
		// loop start execution form and execute until the condition i<=10 becomes false
		for (int i = 1; i <= 10; i++) {
			System.out.println(number * i);
		}
	}

	static void evenodd() {
		System.out.println("Enter a  values");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		// int b = sc.nextInt();
		if (a % 2 == 0)
			System.out.println("a is even");
		else
			System.out.println("Odd");
	}

	static void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no ");
		int number = sc.nextInt();
		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		{
			System.out.println("Factorial of " + number + " is: " + fact);
		}
	}

	static void prime() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		if (flag) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}

	static void digitadd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int d, r, sum = 0;
		while (num > 0) {
			d = num % 10;
			sum = sum + d;
			num = num / 10;
		}
		System.out.println("SUm of the digits " + sum);
	}

	static void pyramid() {
		int rows = 5;
		for (int i = 0; i < rows; i++) {

			// Inner loop for leading spaces
			for (int j = 0; j < rows - i - 1; j++) {
				System.out.print(" "); // Three spaces for each leading space
			}

			// Inner loop for asterisks and spaces between them
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					System.out.print("* "); // Extra spaces for the first and last asterisks
				} else {
					System.out.print("      "); // Only spaces between asterisks
				}

			}
		}
	}

	static void pattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	static void search() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array:");
		int n = sc.nextInt();

		int[] a = new int[n];
		int flag = 0; // Initialize flag to indicate whether the key is found
		int position = -1; // Initialize position to a default invalid value

		System.out.println("Enter array elements:");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("Enter key to search for:");
		int key = sc.nextInt();

		// Search for the key in the array
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				position = i; // Update position with the index where key is found
				flag = 1; // Set flag to 1 indicating that the key is found
				break; // Exit the loop as we found the key
			}
		}

		// Output the result
		if (flag == 1) {
			System.out.println("Element found at position " + position);
		} else {
			System.out.println("Element not found");
		}
	}

	static void sorting() {
		System.out.println("Enter array size");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int[] a = new int[n];
		// int [] b= new int[n];
		// Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for (i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int j = 0; // Index for the target array b
		for (i = 0; i < n; i++) {
			int temp = a[i];
			for (j = i - 1; j >= 0; j--) {
				if (a[j] > temp) {
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
			// j++;
		}
		System.out.println("Ater sorting");
		for (int k : a)
			System.out.println(k);
	}

	static void leapyear() {
		System.out.println("Enter year");
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		if (year % 400 == 0 || year % 4 == 0) // for century years like 1900
			System.out.println(year + " Leap year");
		else if (year % 100 == 0) // for years which are divisible by 4 but not leapyears.
			System.out.println(year + " not leap year");
		// else if(year % 4==0)//for leap years 366days
		// System.out.println(year+" Leap year");
		else
			System.out.println(year + " not leap year");

	}

}
