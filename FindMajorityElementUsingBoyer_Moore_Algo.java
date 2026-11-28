public class FindMajorityElementUsingBoyer_Moore_Algo{
    public static void main(String[] args) {
        int Array[] = {2, 2, 1, 2, 3, 2, 2};
        int count = 0;
        int i = 0;
        int candidate = Array[i];

        for(i = 0; i < Array.length; i++){
            if(count == 0){
                candidate = Array[i];
            }
            if(Array[i] == candidate){
               count++;
            }else{
                count--;
            }
        }
        int frequency = 0;

            for(int j = 0; j < Array.length; j++){
                if(candidate == Array[j]){
                    frequency++;
                }
        }
         if(frequency > Array.length/2){
                System.out.println(candidate);
        }
    }
    
}