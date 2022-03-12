import java.util.Scanner;

public class Main {

  public static void announceDeveloperTeaTime() {
    System.out.println("Waiting for developer tea time...");
    System.out.println("Type in a random word and press Enter to start developer tea time");
    Scanner input = new Scanner(System.in);
    input.next();
    System.out.println("It's developer tea time!");
  }

  public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate) {
    double tip = tipRate * listedMealPrice;
    double tax = taxRate * listedMealPrice;
    double result = listedMealPrice + tip + tax;
    return result;
//    System.out.println("Your total meal price is " + result);
  }

  public static double calculateEmployeeYearSalary(double hours, double salary) {
    double yearSalary = hours * salary;
    return yearSalary;
  }

  public static void main(String[] args) {
    /* Primitive Data Types */
        /* int studentAge = 20;
        double studentGPA = 3.5;
        char initialName = 'J';
        char initialLastName = 'M';
        boolean hasPerfectAttendance = true;

        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(initialName);
        System.out.println(initialLastName);
        System.out.println(hasPerfectAttendance); */

    /* Reference Data Types */
        /* String name = "Julian";
        String lastName = "Mercado";
        System.out.println(name + " " + lastName);
        System.out.println(lastName); */

    /* Input and output */
        /* System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(name + " " + lastName + " " + "now has a GP of " + studentGPA); */

    /* Fortune Teller code */
        /* System.out.println("Fortune Teller Mini Game");
        System.out.println("Pick a number between 1 and 10...");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        if(inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your shoe selection will make you very happy today");
        } */

    /* While Loop Control Flow */
        /*Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song off of repeat? If so, answer yes or no");
            String userInput = input.next();

            if(userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing next song");*/

    // Another example using if Statements
        /* String question = "What is the result of 2 + 9?";
        String answerOne = "1. 4";
        String answerTwo = "2. 11";
        String answerThree = "3. 7";
        Scanner scanner = new Scanner(System.in);

        System.out.println(question);
        System.out.println(answerOne);
        System.out.println(answerTwo);
        System.out.println(answerThree);
        System.out.println("Please select the number of your answer: ");

        int userAnswer = scanner.nextInt();

        if(userAnswer == 2) {
            System.out.println("The answer is correct");
        } else {
            System.out.println("The answer is not correct");
        } */

       /* System.out.println("Let's calculate the area of a triangle");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the base of the triangle (in inches).");
        double base = input.nextDouble();

        while (base <= 0) {
            System.out.println("That's invalid. Please input the base of the triangle (in inches).");
            base = input.nextDouble();
        }

        System.out.println("Please input the height of the triangle (in inches).");
        double height = input.nextDouble();
        while (height <= 0) {
            System.out.println("That's invalid. Please input the height of the triangle (in inches).");
            height = input.nextDouble();
        }

        double area = (base * height) / 2;
        System.out.println("The area is " + area);*/

   // announceDeveloperTeaTime();

    /*double totalMealResult = calculateTotalMealPrice(50, 0.05, 0.05);
    System.out.println(totalMealResult);

    totalMealResult = totalMealResult/5;

    System.out.println("Each person will pay: " + totalMealResult);*/

    /*Scanner input1 = new Scanner(System.in);
    System.out.println("Worked hours: ");
    double employeeHours = input1.nextDouble();

    Scanner input2 = new Scanner(System.in);
    System.out.println("Money per Hours: ");
    double employeeMoney = input2.nextDouble();

    double vacationDays = employeeHours/8;
    System.out.println("The employee got " + vacationDays + " vacation days.");

    double totalSalaryYear = calculateEmployeeYearSalary(employeeHours, employeeMoney);
    System.out.println(totalSalaryYear);*/

    // Creating a class with its constructor

    /*Triangle triangleA = new Triangle(15, 8, 15, 8, 3);
    Triangle triangleB = new Triangle(3, 2.598, 3, 3, 6);

    double triangleAArea = triangleA.findArea();
    System.out.println(triangleAArea);

    double triangleBArea = triangleB.findArea();
    System.out.println(triangleBArea);

    System.out.println(triangleA.sideLenThree);
    System.out.println(triangleB.base);

    System.out.println(triangleA.numOfSides);*/


    // Challenge: Student Profile
    Student firstStudent = new Student("juan", "Gomez", 2022, 4.5, "Yes");
    int graduateYear = firstStudent.increaseGraduateYear();
    System.out.println(graduateYear);

  }
}

