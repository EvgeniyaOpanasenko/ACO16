package base.demo;

/**
 * Created by Lisa on 11/1/2016.
 */
public class TeSelectSort {
    public static void main(String[] args) {
        int mas[] = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5, 111};

        selectSort(mas);

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }

    private static void selectSort(int[] mas) {
        int j, min;
        for (int i = 0; i < mas.length; i++){
            min = i;
            for ( j = i+1; j < mas.length && mas [j] < mas [min]; j++){
                int temp = mas [min];
                mas [min] = mas [j];
                mas [j] = temp;
            }
        }

    }
}