import utilities.CalcHelper;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {

    // Parse string values
    /*var s1 = "Welcome to Georgia!";
    System.out.println("length of String: " + s1.length());

    int position = s1.indexOf("Georgia");
    System.out.println("The position is " + position);

    var sub = s1.substring(11);
    System.out.println("Substring from s1 starting from " + position + " is equal to: " + sub);

    String s2 = "Welcome!     ";
    var len = s2.length();
    System.out.println("s2 variable length is: " + len);
    var trimmed = s2.trim();
    System.out.println(trimmed.length());*/

    /* Get string values from user input using Scanner
    first the library needs to be imported in order to use the */

    /*var scanner = new Scanner(System.in);
    System.out.println("Enter a value: ");
    var input = scanner.nextLine();
    System.out.println(input);

    System.out.println("Enter number 1: ");
    var number1 = scanner.nextInt();
    System.out.println("Enter number 2: ");
    var number2 = scanner.nextInt();

    var sum = number1 + number2;
    System.out.println("The result of the sum is: " + sum);*/

    //Challenge: Create a simple calculator
    /*Scanner input = new Scanner(System.in);

    System.out.println("Enter first number: ");
    var number1 = input.nextDouble();

    System.out.println("Enter second number: ");
    var number2 = input.nextDouble();

    double result = number1 / number2;
    System.out.println("The answer is: " + result);*/

    // Convert String in char Array
//    String string = "convert this";
//    var chars = string.toCharArray();
//    System.out.println(chars);

    // Evaluate conditions with if-else
    /*var scanner = new Scanner(System.in);
    System.out.println("Enter a month number(1-12): ");
    var monthNumber = scanner.nextInt();*/

    var now = LocalDateTime.now();
    var monthNumber = now.getMonthValue();

    /*String message;
    if(monthNumber < 1 || monthNumber > 12) {
      message = "That isn't a valid month!";
    } else if(monthNumber <=3) {
      message = "That's in Quarter 1!";
    } else if(monthNumber <=6) {
      message = "That's in Quarter 2!";
    } else {
      message = "That isn't in the first half of the year";
    }

    System.out.println(message);*/

    // Evaluate conditions with switch-case

    /*switch(monthNumber) {
      case 1:
        System.out.println("The month is January.");
        break;
      case 2:
        System.out.println("The month is February.");
        break;
      case 3:
        System.out.println("The month is March.");
        break;
      case 9:
      case 10:
      case 11:
      default:
        System.out.println("You choose another month.");
    }*/

    // Create looping code blocks
    String[] months = {"January", "February", "March",
                        "April", "May", "June",
                        "July", "August", "September",
                        "October", "November", "December"};

    // Method #1
    /*for(int i=0; i<months.length; i++) {
      System.out.println(months[i]);
    }*/

    // Method #2
    /*for(String month : months) {
      System.out.println(month);
    }*/

    // Method #3
    /*var whileCounter = 0;
    while(whileCounter < months.length) {
      System.out.println(months[whileCounter]);
      whileCounter++;
    }*/

    // Method #4
    /*var doCounter = 0;
    do {
      System.out.println(months[doCounter]);
      doCounter++;
    } while (doCounter < months.length);*/

    // Create reusable code with Methods
    /*var sc = new Scanner(System.in);

    double d1 = getInput(sc);
    double d2 = getInput(sc);

    double result = d1/d2;

    System.out.println("the answer is " + result);*/

    // Create overloaded methods
    /*Scanner sc = new Scanner(System.in);
    var i1 = getInput(sc, "Enter value 1: ");
    var i2 = getInput(sc, "enter value 2: ");

    double result = addValues(i1, i2);
    System.out.println("The sum is " + result);

    double resultOfFour = addValues(i1, i2, i1, i2);
    System.out.println("The sum is " + resultOfFour);

    double resultOfMultiple = addValues(i1, i2, i1, i2, i1, i2, i2);
    System.out.println("The sum of Multiple is " + resultOfMultiple);*/

    //Handle exceptions with try/catch
    /*String s = null;
    try {
      var sub = s.substring(1);
    } catch(Exception e) {
      e.printStackTrace();
    }
    System.out.println("I'm not dead yet!");*/

    //Create a multi catch blocks
    /*String s = "";
    try {
      var sub = s.substring(1);
    } catch(NullPointerException e) {
      e.printStackTrace();
      System.out.println("Null pointer: " + e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
      e.printStackTrace();
      System.out.println("Out of bounds: " + e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("I don't know what happened.");
    }
    System.out.println("I'm not dead yet!");*/

    //Close objects with try-with-resources
    /*var file = new File("hello.txt");
    System.out.println("File exists: " + file.exists());

    try(FileReader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader)) {
      var text = br.readLine();
      System.out.println(text);
    } catch (IOException e) {
      e.printStackTrace();
    }*/

    var sc = new Scanner(System.in);

    double d1, d2;
    try {
      System.out.println("Enter a numeric value: ");
      d1 = sc.nextDouble();
      sc.nextLine();
      System.out.println("Enter a numeric value: ");
      d2 = sc.nextDouble();
      sc.nextLine();
    } catch(InputMismatchException e) {
      System.out.println("Couldn't format as a number");
      return;
    }

    System.out.println("Select an operation (+ - * /): ");
    var operation = sc.nextLine();

    double result;
    switch(operation) {
      case "+":
        result = CalcHelper.addValues(d1, d2);
        break;
      case "-":
        result =  CalcHelper.subtractValues(d1, d2);
        break;
      case "*":
        result = CalcHelper.multiplyValues(d1, d2);
        break;
      case "/":
        result = CalcHelper.divideValues(d1, d2);
        break;
      default:
        System.out.println("You didn't choose a valid operation.");
        return;
    }
    System.out.println("The result is " + result);

  }

  private static double getInput(Scanner sc, String prompt) {
    System.out.println("Enter a numeric value: ");
    return sc.nextDouble();
  }

  private static double addValues(int i1, int i2) {
    return i1 + i2;
  }

  private static double addValues(int i1, int i2, int i3, int i4) {
    return i1+ i2 + i3 + i4;
  }

  private static double addValues(double... values) {
    double result = 0;
    for(var value : values) {
      result += value;
    }
    return result;
  }

}
