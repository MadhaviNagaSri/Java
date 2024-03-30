//reversing a string there 8is no direct reverse() method in java for reversing a string

public class Reversestring{
    public static void main(String[] args) {
    String s = "Madhavi";
    int size = s.length();//7
    String rev ="";
    for(int i=size-1;i>=0;i--){
      rev = rev+s.charAt(i);
    }
    System.out.println("The original sytring is:"+s);
    System.out.println("The reversed string is:" +rev);
  }
}
