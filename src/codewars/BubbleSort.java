package codewars;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] list){
        int temp =0;

        for(int i=0; i<list.length -1; i++){
            for (int j=0; j<list.length -1 -i; j++){
                if(list[j] > list[j + 1]){
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bubbleSort(new int[]{10, 14, 2, 23, 19})));
        System.out.println(Arrays.toString(bubbleSort(new int[]{12, -21, 0, 273, -19})));
        System.out.println(Arrays.toString(bubbleSort(new int[]{-10, 890, -263, 23, 19, 7, 23,42})));
        System.out.println(Arrays.toString(bubbleSort(new int[]{11, 49, 72, 223, -19})));
    }

}
