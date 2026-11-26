public class FindLargestElement{
    public static void main(String args[]){
        int array[] = {23, 12, 45, 65, 11, 89, 54, 67};
        int largestEle = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(largestEle < array[i]){
                largestEle = array[i];
            }
        }
        System.out.println(largestEle);
    }
}