//searching an element string in the array list
class String {
    public static void main(String[] args) {
     //initialaization of array elements
     String s[] = {"Welcome","Java","Selenium"};
     boolean flag = false;
     String name = "Java";
     for(String i:s){
         if(i==name){
             System.out.println("Elemennt found");
             flag = true;
             break;
         }
     }
     if(flag==false){
        System.out.println("Element Not found");
         }
  
    }
}
