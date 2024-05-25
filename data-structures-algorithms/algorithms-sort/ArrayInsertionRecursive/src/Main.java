public class Main {
    public static void main(String[] args) {

        int[] array = { 20, -22, 10, 15, 7, 35, 55};

        insertionSort(array, array.length);

//        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
//            int newElement = array[firstUnsortedIndex];
//
//            int i;
//
//            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
//                array[i] = array[i - 1];
//            }
//            array[i] = newElement;
//        }

        for(int i:array) System.out.print(i + " ");

    }

    public static void insertionSort(int[] input, int numItems) {

        if(numItems < 2) return;

        insertionSort(input, numItems - 1);

        int newElement = input[numItems - 1];

        int i;

        for(i = numItems - 1; i > 0 && input[i - 1] > newElement; i--) {
            input[i] = input[i - 1];
        }

        input[i] = newElement;
    }

}