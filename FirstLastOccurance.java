public class FirstLastOccurance{
    public static void main(String[] args) {
        int Array[] = {1, 1, 2, 3, 2, 4, 2, 7, 2};
        int key = 2;
        int first_Occ = 0;
        int last_Occ = 0;

        for(int i = 0; i < Array.length; i++){
           if(Array[i] == key){
            first_Occ = i;
            break;
           }                 
        }
        for(int j = Array.length-1; j >= 0; j--){
              if(Array[j] == key){
              last_Occ = j;
              break;
              }
           }   
        System.out.println("First Occurance of key is : " + first_Occ);
        System.out.println("Last Occurance of key is : " + last_Occ);

    }
}