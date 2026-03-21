import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {

        Map<Integer, Integer> freq = new HashMap<>();

        int[] arr = {1, 1, 2, 3, 2, 3, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }

        System.out.println(freq);
    }
}
