import java.util.*;

public class Main{
   
    public static void main(String[] args) {
     //checking the given number is negative or positive by using nested ifelse conditional statement 
      //the Scanner is used to take the input from the user
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the number:");
      int num = s.nextInt();
      
      if(num<0){
        System.out.println("the number is negative:"+""+num);
      }
      else if(num>0){
        System.out.println("The number is positive:"+""+num);
      }
      else{
        System.out.println("The number is egaual to zero:"+""+num);
      }
  }
}
