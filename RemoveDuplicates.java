public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 4, 2, 4, 5, 5, 6, 7};
        int size = arr.length;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] == arr[j]) {

                    for (int k = j; k < size - 1; k++) {
                        arr[k] = arr[k + 1];
                    }

                    size--;
                    j--;
                }
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
