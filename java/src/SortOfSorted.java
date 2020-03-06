public class SortOfSorted {

    public static void main(String[] args) {
        int A[] = {1,8,5,7,2,6};
        sortOfSort(A);
    }

    public static void sortOfSort(int[] array){
        int swing =0;
        int temp = 0;
        int max= 0;
        for(int i = 0; i < array.length; i++){
            if(i%2 == 0){
                swing++;
            }
            if(swing%2 != 0){
                max = swing - 1;
                for(int j = swing - 1; j <= array.length-(i+2-swing);j++){
                    if(array[j]>array[max]){
                        max = j;
                    }
                }
                temp = array[array.length-(i+2-swing)];
                array[array.length-(i+2-swing)] = array[max];
                array[max] = temp;
            } else {
                max = i - swing;
                for(int j = swing - 1; j < array.length-(swing);j++){
                    if(array[j] > array[max]){
                        max = j;
                    }
                }
                temp = array[i - swing];
                array[i - swing] = array[max];
                array[max] = temp;
            }
        }
    }

}
