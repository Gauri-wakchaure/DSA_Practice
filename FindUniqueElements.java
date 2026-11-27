public class FindUniqueElements{
    public static void main(String[] args) {
        int Array[] = {1, 2, 2, 3, 4, 4};
        int Array2[] = new int[Array.length];
        int index = 0;
        
        for(int i = 0; i < Array.length; i++){
            int count = 0;
            for(int j = 0; j < Array.length; j++){
                if(Array[i] == Array[j]){
                    count++;
                }
            }
            
                if(count == 1){
                Array2[index] = Array[i];
                index++;
                }
       }

        for(int i = 0; i < index; i++){
           System.out.print(Array2[i] + " ");
        }
    }
}