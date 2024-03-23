// claculating the sum of all elements in the array
class Sum{
    public static void main(String[] args) {
     //initialaization of array elements
     int a[] = {20,40,60,80,100};
     //declaring a variable name 'sum' and assinging a value is '0'
     int sum = 0;
     //in arrays we use for each loop condition
     for(int i:a){
        sum = sum+i;
     }
     System.out.println(sum);
    }
}
