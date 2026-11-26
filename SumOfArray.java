public class SumOfArray{
    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int i = 0; i < Array.length; i++){
            sum = sum + Array[i];
        }
        System.out.println("Sum of all elements in the array is : " + sum);
    }
}