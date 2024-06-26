public class Main {
    public static void main(String[] args) {

        int[] intArray = { -22, -15, 1, 7, 20, 35, 55 };

        System.out.println(recursiveBinarySearch(intArray, 1));

    }

    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        while(start < end) {
            int midPoint = (start + end) / 2;
            if( input[midPoint] == value) {
                return midPoint;
            } else if(input[midPoint] < value) {
                start = midPoint + 1;
            } else {
                end = midPoint;
            }
        }

        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if(start >= end) return -1;

        int midpoint = (start + end) / 2;
        // System.out.println("Midpoint: " + midpoint);

        if(input[midpoint] == value) {
            return midpoint;
        } else if(input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        } else {
            return recursiveBinarySearch(input, start, midpoint, value );
        }
    }

}