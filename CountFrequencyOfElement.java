public class CountFrequencyOfElement{
    public static void main(String args[]){
        int Array[] = {1, 2, 2, 3, 3, 3};
        int Array1[] = new int[Array.length];
        for(int i = 0; i < Array.length; i++){
            int count = 0;
            for(int j = 0; j < Array.length; j++){
            if(Array[i] == Array[j]){
                count++;
                Array1[i] = count;
            }
        }   
    }
        
        for(int i = 0; i < Array1.length; i++){
            boolean isDuplicate = false;
            for(int j = 0; j < i; j++){
            if(Array[i] == Array[j]){
               isDuplicate = true;
            }       
        }
        if(isDuplicate == false){
               System.out.println(Array[i] + " -> " + Array1[i]);
            } 
    }
    }
}