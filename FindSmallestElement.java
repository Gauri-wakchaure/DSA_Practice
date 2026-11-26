public class FindSmallestElement{
    public static void main(String args[]){
        int array[] = {10, 20, 5, 8, 15};
        int smallestEle = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            if(smallestEle > array[i]){
                smallestEle = array[i];
            }
        }
        System.out.println(smallestEle);
    }
}