class HelloWorld {
    public static void main(String[] args) {
        //searching an element presence in array using SINLEDIMENSIONAL ARRAY
        int a[] = {120,140,160,180,200};
        //searching 200 in the  above array list
        int num = 45;
        //using for each loop condition
        boolean flight= false;
        //for checking the condition
        for(int i:a){
            if(i==num){
                System.out.println("Element found");
                flight = true;
                break; //after the element is found the loop will break 
            }
        }
        //the if condition will execute when the element is not found on the above array list
      if(flight== false){
        System.out.println("Element not found");
      }
    }
}
