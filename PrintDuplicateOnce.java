public class PrintDuplicateOnce{
    public static void main(String[] args) {
        int Array[] = {2, 2, 3, 9, 5, 5, 3, 4, 7, 8};

        for(int i = 0; i < Array.length; i++){
            int count = 1;
            boolean isDuplicate = false;
            for(int j = 0; j < Array.length; j++){
                if(Array[i] == Array[j] && i != j){
                    count++;
                }
            }

            for(int j = 0; j < i; j++){
                if(Array[i] == Array[j]){
                    isDuplicate = true;
                }
            }

            if(count >= 2 && isDuplicate == false){
                System.out.println(Array[i]);
            }
        }
    }
}