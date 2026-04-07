import java.util.*;

public class Problem5 {

    public static void main(String[] args) {

        String[] arr = {"accA", "accB", "accB", "accC"};

        // Linear search
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("accB")) {
                System.out.println("Found at index " + i);
                break;
            }
        }

        // Binary search
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, "accB");
        System.out.println("Binary index: " + index);
    }
}