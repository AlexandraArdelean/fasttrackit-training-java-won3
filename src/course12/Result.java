package course12;

public class Result {
    public static int retrieveLongestSubarray(int[] arr) {

        int maxLength = 1;

        // min and max initialization

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int max = arr[i];


            // update the value of min and max
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max)
                    max = arr[j];

                if (arr[j] < min)
                    min = arr[j];


                // check the condition
                if ((max - min) <= 1) {
                    int currentLength = j - i + 1;


                    if (maxLength < currentLength)
                        maxLength = currentLength;
                }


            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        int arr[] = {3, 2, 3, 4, 5, 5};

        int maxLength = retrieveLongestSubarray(arr);
        System.out.println(maxLength);
    }
}



