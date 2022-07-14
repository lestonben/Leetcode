import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class q22_Car_Fleet {

    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> cars = new TreeMap<>(Collections.reverseOrder());
        for (int i=0; i<position.length; i++) {
            cars.put(position[i], (double)(target - position[i])/speed[i]);
        }
        int res = 0;
        double cur = 0;
        for (double time: cars.values()) {
            if (time > cur) {
                cur = time;
                res++;
            }
        }
        return res;
    }
}
