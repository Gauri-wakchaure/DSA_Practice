public class ReverseArray{
    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 4, 5};
        int temp = 0;
        int first = 0;
        int last = Array.length-1;

        while(first < last){
            // Swapping
            temp = Array[last];
            Array[last] = Array[first];
            Array[first] = temp;
            first++;
            last--;
        }

        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }
}