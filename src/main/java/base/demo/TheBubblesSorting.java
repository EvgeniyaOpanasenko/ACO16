package base.demo;

/**
 * Created by Lisa on 10/31/2016.
 */
public class TheBubblesSorting {
    public static void main(String[] args) {
        int[] list = {16, 13, 42, 91, 8, 7, 6, 5};

        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }


    }

    private static void bubbleSort(int[] list) {

        for (int k = 0; k < list.length -1; k++){
            for (int j = 0; j < list.length -1; j ++){
                if (list [j] > list [j +1]){
                    int temp = list [j];
                    list [j] = list [j+1];
                    list [j+1] = temp;
                }
            }
        }
    }



}