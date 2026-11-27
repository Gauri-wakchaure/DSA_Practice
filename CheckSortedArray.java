public class CheckSortedArray{

    public static boolean checkSortedArray(int Array[]){
        for(int i = 0; i < Array.length-1; i++){
                if(Array[i] > Array[i+1]){
                 return false;
               }
        }
        return true;
    }
    public static void main(String[] args) {
         int Array[] = {1, 2, 3, 4, 5};
         boolean sorted = checkSortedArray(Array);

        if(sorted == true){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is UnSorted");
        }   
    }
}