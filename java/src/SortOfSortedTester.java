import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class SortOfSortedTester extends SortOfSorted{

    @Test
    public void testSort1(){ //inital test to make sure my code actually works in the way I want it to
        int A[] = {1,8,5,7,2,6};
        int expected[] ={ 6, 5, 1, 2, 7, 8};
        sortOfSort(A);
        assertArrayEquals(expected, A); // test passed on first try
    }

    @Test
    public void testSort2(){ // I want to make sure my code will still work with a smaller length
        int A[] = {2, 6, 9, 3};
        int expected[] ={3, 2, 6, 9};
        sortOfSort(A);
        assertArrayEquals(expected, A); // test passed on first try
    }

    @Test
    public void testSort3(){ // test to see if my code will work with an odd number of inputs
        int A[] = {2, 1, 6, 9, 3};
        int expected[] ={3, 2, 1, 6, 9};
        sortOfSort(A);
        assertArrayEquals(expected, A); // test passed on first try
    }

    @Test
    public void testSort4(){ // test if my code works with duplicates
        int A[] = {2, 1, 2, 9, 3};
        int expected[] ={2, 2, 1, 3, 9};
        sortOfSort(A);
        assertArrayEquals(expected, A); // test passed on first try
    }

    @Test
    public void testSort5(){ // test if can take a sorted array and sort it the way i want to
        int A[] = {1, 2, 3, 4, 5};
        int expected[] ={3, 2, 1, 4, 5};
        sortOfSort(A);
        assertArrayEquals(expected, A); // test passed on first try
    }
}
