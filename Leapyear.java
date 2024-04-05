
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // year to be checked
    Scanner n = new Scanner(System.in);
System.out.println("Enter the year:");
int y = n.nextInt();
    boolean isLeapYear = false;


    //  leap year if it
    // divisible by 4
    if (y % 4  == 0) {
      isLeapYear = true;
    }
    // century year is not a leap year if it will not 
    // divisible by 400
    else if (y % 400 != 0) {
      isLeapYear = false;
    }
    // other century years are
    // not leap years
    else if (y % 100 == 0) {
      isLeapYear = false;
    }
    // remaining years are leap years
    else {
      isLeapYear = true;
    }

    if (isLeapYear) {
      System.out.println(y + " is a leap year.");
    }
    else {
      System.out.println(y + " is not a leap year.");
    }
  }
}
