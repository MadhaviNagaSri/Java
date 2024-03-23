// finding the EVEN numbers in the array
class HelloWorld {
    public static void main(String[] args) {
     //initialaization of array elements
     int a[] = {20,25,30,35,40,45,50,55,60,80,100};
        int sum=0;
    System.out.println(".......................................");
      for(int i:a){
          
          if(i%2==0){
              System.out.println("The Even numbers are:"+ i);
          }
      }
      /* else if(i%2!=0){
              System.out.println("The odd numbers are:"+i);
          }*/
      }
    System.out.println("...........................................");
      for(int i:a){
     if(i%2!=0){
              System.out.println("The odd numbers are:"+i);
          }
      }
System.out.println("......................................");
for(int i:a){
    sum=sum+i;
}
   System.out.println("The sum of elements is:"+sum);
    }
}
