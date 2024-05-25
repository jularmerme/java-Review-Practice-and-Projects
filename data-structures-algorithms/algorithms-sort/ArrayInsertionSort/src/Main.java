public class Main {
    public static void main(String[] args) {

        int[] array = { 20, -22, 10, 15, 7, 35, 55};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
        for(int i:array) System.out.print(i + " ");
    }
}