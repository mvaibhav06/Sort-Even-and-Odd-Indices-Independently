import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEvenOddIndices {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, (a, b) -> Integer.compare(b,a));
        int i = 0;
        int j = 0;
        int k = 0;
        while(k<nums.length){
            if(k%2 == 0){
                nums[k++] = even.get(i++);
            }else{
                nums[k++] = odd.get(j++);
            }
        }
        return nums;
    }
}
