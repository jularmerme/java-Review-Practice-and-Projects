package com.ds;

public class Main {
    public static void main(String[] args) {

        int[] arrayList = { 20, 1, -15, 7, 55, 1, -22 };

        for(int lastUnsorterdIndex = arrayList.length-1; lastUnsorterdIndex > 0; lastUnsorterdIndex--) {
            for(int i = 0; i < lastUnsorterdIndex; i++) {
                if(arrayList[i] > arrayList[i + 1]) {
                    swap(arrayList, i, i + 1);
                }
            }
        }

            for(int i:arrayList) {
                System.out.print(i + " ");
            }


    }

    public static void swap(int [] array, int i, int j) {
        if(i == j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}