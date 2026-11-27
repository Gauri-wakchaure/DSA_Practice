public class Count_Frequency{
    public static void main(String[] args) {
        int Array[] = {1, 2, 3, 2, 4, 5, 2, 6, 2, 7};
        int key = 2;
        int count = 0;

        for(int i = 0; i < Array.length; i++){
           if(Array[i] == key){
            count++;
           }
        }
        System.out.println("Frequency of key element is : " + count);
    }
}