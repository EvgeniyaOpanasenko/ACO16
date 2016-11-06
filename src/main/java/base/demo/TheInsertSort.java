package base.demo;

/**
 * Created by Lisa on 10/31/2016.
 */
public class TheInsertSort {
    public static void main(String[] args) {
        /*int[] list = new int [10];
        for (int i = 0; i < list.length; i++){
            list [i] = (int)Math.round(Math.random()*100);
        }*/
        int list [] = {10,1,9,2,8,3,7,4,6,5};

        insertSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private static void insertSort(int[] mas) {
        // first element is marked as sorted
        int j;
      for (int i = 0; i < mas.length; i ++){ // element at possition cell 0 is sorted
          int temp = mas [i];
          for (j = i -1; j >= 0 && mas [j] > temp ;j--){
             mas [j+1] = mas [j];
          }
          mas [j+1] = temp;
          }

      }
    }

