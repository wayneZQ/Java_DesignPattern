package AdapterPattern;

/**
 * @ClassName OperationAdapter
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/13 10:40
 **/
public class OperationAdapter implements ScoreOperation{

    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperationAdapter(){
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    /**
     * sort中调用被适配的quicksort方法
     * @param array
     * @return
     */
    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    /**
     * search中调用被适配的binarySearch方法
     * @param array
     * @param key
     * @return
     */
    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array,key);
    }
}
