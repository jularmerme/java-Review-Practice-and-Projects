package net.home.learning;

import java.sql.SQLOutput;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if(count == items.length) {
            int[] newItems = new int[2 * count];
            for(int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if(index < 0 || index >= count)
            throw new IllegalArgumentException();

        for(int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for(int i = 0; i < count; i++) {
            if(items[i] == item)
                return i;
        }
        return -1;
    }

    public void print() {
        System.out.print("numbers = [ ");
        for(int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.println("]");
    }

}
