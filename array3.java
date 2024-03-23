//finding negative and positive elements in the array list
class N-P{
    public static void main(String[] args) {
     //initialaization of array elements
     int a[] = {-10,-20,-30,-40,0,10,20,30,40};
     System.out.println("The negative elements are.....");
     for(int i:a){
         if(i<0){
             System.out.println(i);
         }
     }
     System.out.println("The positive elements are.....");
     for(int i:a){
         if(i>0){
             System.out.println(i);
         }
     }
     System.out.println("The elements Zero is.....");
     for(int i:a){
         if(i==0){
             System.out.println(i);
         }
     }
    }
}
