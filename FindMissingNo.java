public class FindMissingNo{
    public static void main(String[] args) {
        int Array[] = {2, 3, 4, 5};
        int n = 5;
        int exp_sum = n*(n+1)/2;
        int sum = 0;

        for(int i = 0; i < Array.length; i++){
             sum = sum + Array[i];
        }

        int result = exp_sum - sum;
        System.out.println("Missing number is : " + result);
    }
}