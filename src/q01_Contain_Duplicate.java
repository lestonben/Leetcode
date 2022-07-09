import java.util.HashSet;
import java.util.Set;

public class q01_Contain_Duplicate {

    public boolean containsDuplicate(int[] nums) {
        // 使用set来保存独特的值
        Set<Integer> uniques = new HashSet<>();
        for (int num: nums) {
            // 尝试添加的过程 如果存在则condition = false 那么会直接返回true 表示重复值
            if (!uniques.add(num)) {
                return true;
            }
        }
        return false;
    }
}
