public class Main {
    public static void main(String[] args) {

        int[] array = { 20, -22, 10, 15, 7, 35, 55};

        for(int gap = array.length/2; gap > 0; gap /= 2) {
            for(int i = gap; i < array.length; i++ ) {
                int newElement = array[i];

                int j = i;

                while(j >= gap && array[j - gap] > newElement) {
                    array[j] = array[j - gap];
                    j-= gap;
                }
                array[j] = newElement;
            }
        }
        for(int i:array) System.out.print(i + " ");
    }
}