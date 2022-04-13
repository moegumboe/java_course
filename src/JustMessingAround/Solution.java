package JustMessingAround;

import java.util.HashMap;
import java.util.List;

public class Solution {

    public int[] twoSum(List<Integer> nums, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        for(int i = 0; i < nums.size(); i++){
            Integer requiredNum = (Integer)(target - nums.get(i));
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }
            indexMap.put(nums.get(i), i);
        }
        return null;
    }
}
