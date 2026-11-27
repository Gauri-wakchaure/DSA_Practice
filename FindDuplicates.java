public class FindDuplicates{
    public static void main(String args[]){
       int Array[] = {1, 2, 3, 2, 4, 3, 3, 4, 1};	
       int count = 0;

       for(int i = 0; i < Array.length-1; i++){   
        boolean isDuplicate = false;
        for(int j = i+1; j < Array.length; j++) { 
            if(Array[i] == Array[j]){
                count++;
            }  
        } 

        for(int j = 0; j < i; j++){
            if(Array[i] == Array[j]){
                isDuplicate = true;
                break;
            }
        }
            if(count >= 1 && isDuplicate == false){
            System.out.print(Array[i] + " ");          
        }              
    }
 }
}