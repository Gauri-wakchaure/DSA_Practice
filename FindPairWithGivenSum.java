public class FindPairWithGivenSum{
    public static void main(String[] args) {
        int Array[] = {2, 7, 11, 15};
        int k = 9;

        for(int i = 0; i < Array.length; i++){           
             for(int j = i+1; j < Array.length; j++){
                if(Array[i] + Array[j] == k){
                    System.out.println("Pair with Given Sum is : " + i + " , " + j);
                    break;
                }
             }          
        }
    }
}