/*
 * JAVA BASICS - QUICK REVISION
 * Variables, Data Types, Literals, Type Conversion,
 * Assignment, Relational, Logical Operators,
 * If-Else, If-Else-If
 */

public class Main {

    public static void main(String[] args) {

        // =========================================================
        // 1. VARIABLES
        // =========================================================

        int age = 21;
        double salary = 70000.50;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Sarthak";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);


        // =========================================================
        // 2. DATA TYPES
        // =========================================================

        // Primitive Data Types

        byte b = 10;
        short s = 1000;
        int i = 100000;
        long l = 10000000000L;

        float f = 10.5f;
        double d = 99.99;

        char c = 'A';
        boolean flag = true;

        // Reference / Non-Primitive
        String message = "Hello Java";

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(flag);
        System.out.println(message);


        // =========================================================
        // 3. LITERALS
        // =========================================================

        int integerLiteral = 100;
        long longLiteral = 100000L;

        float floatLiteral = 10.5f;
        double doubleLiteral = 20.5;

        char charLiteral = 'A';
        String stringLiteral = "Java";

        boolean booleanLiteral = true;

        // Different integer representations
        int decimal = 10;
        int binary = 0b1010;
        int octal = 012;
        int hexadecimal = 0xA;

        System.out.println(decimal);
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hexadecimal);


        // =========================================================
        // 4. TYPE CONVERSION
        // =========================================================

        // Widening Conversion
        // Smaller type -> Larger type
        // Automatically performed by Java

        int num = 100;
        double convertedDouble = num;

        System.out.println(convertedDouble); // 100.0


        // Narrowing Conversion
        // Larger type -> Smaller type
        // Requires explicit casting

        double decimalNumber = 10.99;
        int convertedInt = (int) decimalNumber;

        System.out.println(convertedInt); // 10


        // Another example
        long longNumber = 1000;
        int intNumber = (int) longNumber;

        System.out.println(intNumber);


        // =========================================================
        // 5. ASSIGNMENT OPERATORS
        // =========================================================

        int x = 10;

        x += 5;     // x = x + 5
        System.out.println(x);

        x -= 2;     // x = x - 2
        System.out.println(x);

        x *= 2;     // x = x * 2
        System.out.println(x);

        x /= 2;     // x = x / 2
        System.out.println(x);

        x %= 3;     // x = x % 3
        System.out.println(x);


        // =========================================================
        // 6. RELATIONAL OPERATORS
        // =========================================================

        int a = 10;
        int z = 20;

        System.out.println(a == z); // Equal
        System.out.println(a != z); // Not Equal
        System.out.println(a > z);  // Greater
        System.out.println(a < z);  // Smaller
        System.out.println(a >= z); // Greater or Equal
        System.out.println(a <= z); // Smaller or Equal


        // =========================================================
        // 7. LOGICAL OPERATORS
        // =========================================================

        int marks = 85;
        int attendance = 90;

        // AND &&
        if (marks >= 80 && attendance >= 75) {
            System.out.println("Eligible");
        }

        // OR ||
        if (marks >= 90 || attendance >= 90) {
            System.out.println("At least one condition is true");
        }

        // NOT !
        boolean isLoggedIn = true;

        if (!isLoggedIn) {
            System.out.println("Please login");
        } else {
            System.out.println("Already logged in");
        }


        // =========================================================
        // 8. IF-ELSE
        // =========================================================

        int userAge = 21;

        if (userAge >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        // =========================================================
        // 9. IF-ELSE-IF
        // =========================================================

        int score = 85;

        if (score >= 90) {
            System.out.println("Grade A+");
        }
        else if (score >= 80) {
            System.out.println("Grade A");
        }
        else if (score >= 70) {
            System.out.println("Grade B");
        }
        else if (score >= 60) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }


        // =========================================================
        // 10. EVEN / ODD
        // =========================================================

        int number = 17;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


        // =========================================================
        // 11. POSITIVE / NEGATIVE / ZERO
        // =========================================================

        int value = -10;

        if (value > 0) {
            System.out.println("Positive");
        }
        else if (value < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }


        // =========================================================
        // 12. LARGEST OF TWO NUMBERS
        // =========================================================

        int n1 = 50;
        int n2 = 30;

        if (n1 > n2) {
            System.out.println(n1 + " is larger");
        }
        else if (n2 > n1) {
            System.out.println(n2 + " is larger");
        }
        else {
            System.out.println("Both are equal");
        }


        // =========================================================
        // 13. LARGEST OF THREE NUMBERS
        // =========================================================

        int p = 10;
        int q = 50;
        int r = 30;

        if (p >= q && p >= r) {
            System.out.println("Largest: " + p);
        }
        else if (q >= p && q >= r) {
            System.out.println("Largest: " + q);
        }
        else {
            System.out.println("Largest: " + r);
        }


        // =========================================================
        // 14. VOTING ELIGIBILITY
        // =========================================================

        int votingAge = 20;

        if (votingAge >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }


        // =========================================================
        // 15. SIMPLE CALCULATOR
        // =========================================================

        int first = 20;
        int second = 10;
        char operator = '+';

        if (operator == '+') {
            System.out.println(first + second);
        }
        else if (operator == '-') {
            System.out.println(first - second);
        }
        else if (operator == '*') {
            System.out.println(first * second);
        }
        else if (operator == '/') {
            System.out.println(first / second);
        }
        else if (operator == '%') {
            System.out.println(first % second);
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}