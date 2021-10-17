 
class BubbleSort
{
    public int[] getSortedArray(int[] array) {
        for(int m = 0; m < array.length; m++ )
        { // in here the last elements of array are already in place
            for(int n = 1; n < (array.length - m); n++ )
            {
                if( array[n - 1] > array[n] )
                {
                    changePlace(n - 1, n, array);
                }
            }
        }
        return array;
    }
    private void changePlace(int i, int j, int[] intitalarray)
    {
        int stored = intitalarray[i];
        intitalarray[i] = intitalarray[j];
        intitalarray[j] = stored;
    }

}