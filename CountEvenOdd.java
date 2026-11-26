public class CountEvenOdd{
    public static void main(String args[]){
        int Array[] = {1, 2, 3, 4, 5, 6};
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < Array.length; i++){
            if(Array[i] % 2 == 0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        System.out.println("Total Count of Even Numbers : " + countEven);
        System.out.println("Total Count of Odd Numbers : " + countOdd);
    }
}