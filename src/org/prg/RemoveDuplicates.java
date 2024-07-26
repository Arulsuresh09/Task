package org.prg;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 2, 2, 3, 3, 3, 4, 5};
        int newLength = removeDuplicates(array);
        System.out.println("New Length: " + newLength);
        for (int k = 0; k < newLength; k++) {
            System.out.print(array[k] + " ");
        }
    }
    public static int removeDuplicates(int[] array) {
        if (array.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < array.length; j++) {
         
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }
        return i + 1;
    }
}
