public class Linear_Search{

    public static int linearSearch(int Array[], int key, int keyFound){

        for(int i = 0; i < Array.length; i++){
          if(Array[i] == key){
              keyFound = i;
              break;
          }
       }
       return keyFound;
    }

    public static void main(String args[]){
       int Array[] = {10, -23, 0, 45, -34, 23, 0, -45, 7};
       int key = 23;
       int keyFound = -1;

       keyFound = linearSearch(Array, key, keyFound);

       if(keyFound != -1){
          System.out.println("Key Found at index : " + keyFound);
       }else{
        System.out.println("Key Not Found");
       }
    

    }
}