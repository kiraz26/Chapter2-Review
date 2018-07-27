package operators;

public class Operator {

	public static void main(String[] args) {

		// Assignment
		int studentCount = 150;
		studentCount = studentCount + 1;
		System.out.println(studentCount);

		// Compoud Assignment Operator +=, -=, *=, %=
		studentCount = 150;
		// studentCount = studentCount + 5;
		studentCount += 5;
		System.out.println(studentCount);

		studentCount -= 2;
		System.out.println(studentCount);
		studentCount *= 2;
		System.out.println(studentCount);
		studentCount /= 2;
		System.out.println(studentCount);

		// Increment - Decrement
		studentCount = 150;
		studentCount++; // studentCount = studentCount + 1;
		System.out.println(studentCount); // 151
		// Post Increment(studentCount++) ////// Pre-Increment (++studentCount)
		System.out.println("post increment " + studentCount++);
		System.out.println("after post increment" + studentCount);
		System.out.println("pre increment" + ++studentCount);
		System.out.println("after pre increment" + studentCount);
		System.out.println(studentCount);
		//
		studentCount = 10;
		studentCount = studentCount++ + --studentCount + 5;
		System.out.println(studentCount);
		studentCount = 10;
		studentCount = studentCount++ + studentCount-- + 5;
		System.out.println(studentCount);
		//
		studentCount = 10;
		studentCount = -studentCount;
		System.out.println(studentCount);
		// Binary Arithmetic Operator: +, -, *, /, %
		int i = 100, j = 3;
		double d = 3d;
		// int a = i / j;
		double a = i / j;
		double b = i / d;
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		// automatic promotion to int while doing arithmetic operation
		// data type has lower range than int
		// Casting
		byte b1 = 12, b2 = 13;
		byte b3 = (byte) (b1 + b2); // because of b1+b2=25 which is an integer we should make byte!!!
		System.out.println(b3);

		int i1 = 100;
		long i2;
		// Be careful, bear shouldn't injest large fluffy dog
		// boolean, char, byte, short, int, long, float, double
		i2 = i1;
		i1 = (int) i2;

		// Relational operator >,<=,<,<=,==,!=
		studentCount = 150;
		boolean bool = studentCount > 100;
		// !
		System.out.println(!bool);

		System.out.println(studentCount != 150);

		// Logical Operator &, ^, |
		System.out.println("true & true " + (true & true));
		System.out.println("true & false " + (true & false));
		System.out.println("false & true " + (false & true));
		System.out.println("false & false " + (false & false));

		// | (OR)
		System.out.println("true | true " + (true | true));
		System.out.println("true | false " + (true | false));
		System.out.println("false | true " + (false | true));
		System.out.println("false | false " + (false | false));

		// ^
		System.out.println("true ^ true " + (true ^ true));
		System.out.println("true ^ false " + (true ^ false));
		System.out.println("false ^ true " + (false ^ true));
		System.out.println("false ^ false " + (false ^ false));

		boolean day = true, night = false;
		String message = (day ^ night) ? "not dreaming" : "something is wrong"; // ternary operator

		if (day ^ night) {
			System.out.println("You are not dreaming");
		} else {
			System.out.println("day and night can not happen at the same time");
		}

		// Short Circuit Logical Operator &&, ^^, ||
		System.out.println("true && true " + (true && true));
		System.out.println("true && false " + (true && false));
		System.out.println("false && true " + (false && true));
		System.out.println("false && false " + (false && false));

		// || 
		System.out.println("true || true " + (true || true));
		System.out.println("true || false " + (true || false));
		System.out.println("false || true " + (false || true));
		System.out.println("false || false " + (false || false));

		

	}

}
