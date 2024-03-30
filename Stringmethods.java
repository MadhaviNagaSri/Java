//String methods
public class Stringmethods{
    public static void main(String[] args) {
    
    //length() method ==> give the lenght of string
    String s1 ="Madhavi";
     int a= s1.length();
     System.out.println(a);//7
     
     //concat() method ==> add strings
    String s2 = "NagaSri";
    System.out.println(s1+s2);
    System.out.println(s1+" "+s2);
    System.out.println("Madhavi"+" "+"Naga"+" "+"Sri");//Madhavi Naga Sri
    System.out.println(s1.concat(s2));
    System.out.println("Madhavi".concat("NagaSri"));
    
    //trim() method ==> cut the extra spaces in string
    s1 = "     java programing language   ";
    System.out.println(s1);
    System.out.println(s1.trim());//java programing language
    
    System.out.println("...........");
    
    /*equals() method ==> it compares the strings
    means original and inputted strings are equal or not and
    it will gives true or false as a output*/
    s2 = "Java language";
    System.out.println(s2.equals("javaprograming"));//false
    System.out.println(s2.equals("Java language"));//true
    
    System.out.println("...........");
    
    //equalsIgnoreCase()method ==> it doesn't check like equals()
    System.out.println(s2.equalsIgnoreCase("java language"));//true
    
    System.out.println("...........");
    
    /*contains()method ==> searches the sequence of charecters
    gives the output as true or false*/
    System.out.println(s2.contains("java"));//false
    System.out.println(s2.contains("Java"));//true
    
    System.out.println("...........");
    
    //charAt()method ==> returns a char value at the given index number
    System.out.println(s2.charAt(7));//n
    
    //replace() ==>replace the old charecters
    //#1 method
    System.out.println(s2.replace('a','i'));//Jivi linguige
    //#2 method
    System.out.println(s2.replace("Java","JavaScrpit"));//JavaScrpit language
    
    //Substring() ==>returns string based on starting and ending indexes
    System.out.println(s2.substring(0,4));//Java
    System.out.println(s2.substring(6,8));//an
    System.out.println(s2.substring(0,13));//J..e
    
    System.out.println("...........");
    
    //toUpperCase() ==>convert string into uppercase 
    System.out.println(s2.toUpperCase());//JAVA LANGUAGE
    
    //toLowerCase() ==>converts strin g into lower case
    System.out.println(s2.toLowerCase());//java language
      
    }
}
