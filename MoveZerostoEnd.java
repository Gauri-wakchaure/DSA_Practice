public class MoveZerostoEnd{
    public static void main(String[] args) {
        int Array[] = {0,0,0,3,12};
        int size = Array.length;

        for(int i = 0; i < size; i++){
            if(Array[i] == 0){
                int temp = Array[i];
                 for (int k = i; k < size - 1; k++) {
                        Array[k] = Array[k + 1];
                    }
                Array[size-1] = temp;
                size--;
                i--;
            }           
        }

        for(int i = 0; i < Array.length; i++){
            System.out.print(Array[i] + " ");
        }
    }
}