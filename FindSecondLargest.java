public class FindSecondLargest{
    public static void main(String[] args) {
        int array[] = {10, 20, 5, 18, 8, 19, 15};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(largest < array[i] ){
                secondLargest = largest;
                largest = array[i];
            }else if(secondLargest < array[i] && array[i] != largest){
                secondLargest = array[i];
            }
        }
        System.out.println(secondLargest);
    }
}