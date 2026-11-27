public class CountPosNegZero{
    public static void main(String args[]){
        int Array[] = {10, -23, 0, 45, -34, 23, 0, -45, 7};
        int countPos = 0;
        int countneg = 0;
        int countzero = 0;

        for(int i = 0; i < Array.length; i++){
            if(Array[i] > 0){
                countPos++;
            }else if(Array[i] < 0){
                countneg++;
            }else{
                countzero++;
            }
        }
        System.out.println("Positive Numbers Count : " + countPos);
        System.out.println("Negtive Numbers Count : " + countneg);
        System.out.println("Zero Numbers Count : " + countzero);
    }
}