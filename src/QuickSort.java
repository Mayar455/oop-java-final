 
class QuickSort {
    public int [] getSortedArray(int initialArray[], int low, int heigh) {
        if (low < heigh) {  //recursion
            int part = slice(initialArray, low, heigh);
            getSortedArray(initialArray, low, part - 1);
            getSortedArray(initialArray, part + 1, heigh);
        }
        return initialArray;
    }
    int slice(int init[], int low, int high) { // taking first and last element as pivot , than checks each of them
        int indexer = (low - 1); int inter = init[high];
        for (int index = low; index < high; index++) {
            if (init[index] <= inter) {
                indexer++;
                int curr = init[indexer];init[indexer] = init[index];init[index] = curr;
            }
        } //swapping 
        int temporary = init[indexer + 1];init[indexer + 1] = init[high];
        init[high] = temporary;
        return (indexer + 1);
    }
}