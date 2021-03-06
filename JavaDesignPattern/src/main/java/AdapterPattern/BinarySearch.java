package AdapterPattern;

/**
 * @ClassName BinarySearch
 * @Description TODO
 * @Author zwq
 * @Date 2022/6/13 10:37
 **/
public class BinarySearch {
    public int binarySearch(int[] array,int key){
        int low = 0;
        int high = array.length-1;
        while (low<=high){
            int mid = (low + high) / 2;
            int midVal = array[mid];
            if(midVal < key){
                low = mid + 1;
            }else if(midVal > key){
                high = mid -1;
            }else{
                return 1;
            }
        }
        return -1;
    }
}
