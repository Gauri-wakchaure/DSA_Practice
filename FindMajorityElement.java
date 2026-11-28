public class FindMajorityElement{
    // Find Majority Element using Basic Approach
    public static void main(String[] args) {
        int Array[] = {2, 2, 1, 2, 3, 2, 2};

        for(int i = 0; i < Array.length; i++){
            int count = 0;
            boolean isDuplicate = false;
            for(int j = 0; j < Array.length; j++){
                if(Array[i] == Array[j]){
                    count++;
              }
            }

            for(int j = 0; j < i; j++){
               if(Array[i] == Array[j]){
                isDuplicate = true;
               }
            }

            if(count > Array.length/2 && isDuplicate == false){
                System.out.print(Array[i]);
            }
        }
    }
}