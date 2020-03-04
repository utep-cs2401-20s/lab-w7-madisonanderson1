public class SortOfSorted {

    public static void main(String[] args) {
        int A[] = {1,8,5,7,2,6};
        sortOfSorted(A);
    }

    public static void sortOfSorted(int[] array){
        int swing = 1;
        int temp;
        int maxIndex=0;
        for(int i = 0; i < array.length-1; i++){

            if(swing%2 == 0){
                temp =
                findMaxEvenIndex(swing, i, array);
            } else {
                temp = findMaxOddIndex(swing, i, array);
                array[findMaxOddIndex(swing, i, array)]
            }

            if(i%2 != 0){
                swing++;
            }
        }
    }

    public static int findMaxEvenIndex(int swing, int i, int[] array){
        int max;

            for (int j = swing-i; j < (array.length-(swing+1)); j++){
                max =j;
                if (array[j] > max){
                    max = j;
                }
            }

        return max;
    }

    public static int findMaxOddIndex(int swing, int i, int[] array){
        int max = array[i];
        for (int j = swing -1; j < array.length-j; j++){
            if (array[j] > max){
                max = j;
            }
        }
        return max;
    }

}
