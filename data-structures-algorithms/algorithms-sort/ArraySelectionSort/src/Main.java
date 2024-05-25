import sun.print.SunPrinterJobService;

public class Main {
    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestIndex = 0;


            for(int index = 1; index <= lastUnsortedIndex; index++) {

                if(array[index] > array[largestIndex]) {
                    largestIndex = index;
                }

            }

           swap(array, largestIndex, lastUnsortedIndex);

        }

        for(int i:array) System.out.print(i + " ");

    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

}