public class Difference_LargestAndSmallest{
    public static void main(String[] args) {
        int Array[] = {10, 20, 5, 15, 3};
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < Array.length; i++){
            if(largest < Array[i]){
                largest = Array[i];
            }
            if(smallest > Array[i]){
                 smallest = Array[i];
            }
        }
        System.out.println(largest - smallest);

    }
}