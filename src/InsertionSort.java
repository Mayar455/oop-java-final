 
 class InsertionSort
{
    public int[] getSortedArray(int[] initialArray)
    {   
        for(int m = 1; m < initialArray.length; m++ )
        {   // comparing the current element to its predecessor
            int tmp = initialArray[m], n;
            for(n = m; n > 0; n-- )
            {
                if( initialArray[n - 1] < tmp)
                    break;
                initialArray[n] = initialArray[n - 1]; // If the key element is smaller than its predecessor, compare it to the elements before. 
            }
            initialArray[n] = tmp;
        }
        return initialArray;
    }
}