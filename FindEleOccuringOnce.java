public class FindEleOccuringOnce{
    public static void main(String[] args) {
        
        int Array[] = {2, 2, 3, 5, 5, 3, 4};
        int uniqueEle = 0;

        for(int i = 0; i < Array.length; i++){
            boolean isUnique = true;
            int count = 1;
            for(int j = 0; j < Array.length; j++){
            if(Array[i] == Array[j] && i != j){
                 count++;
                 isUnique = false;
            }
            }
            if(count == 1 && isUnique == true){
                uniqueEle = Array[i];
          }
        
                 
    
    
        }
        System.out.println("Element Occuring Only once is : " + uniqueEle);
             
    } 
    
}