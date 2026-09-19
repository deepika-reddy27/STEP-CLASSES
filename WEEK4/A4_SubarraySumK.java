import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A4_SubarraySumK {

    static int subarraySum(int[] nums, int k) {

        // Stores prefix sum and its frequency
        Map<Integer, Integer> prefixSums = new HashMap<>();

        // Empty prefix has sum 0
        prefixSums.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // Add current element to running sum
            currentSum += nums[i];

            // We need an earlier prefix sum of currentSum - k
            int requiredSum = currentSum - k;

            if (prefixSums.containsKey(requiredSum)) {
                count += prefixSums.get(requiredSum);
            }

            // Store/update current prefix sum
            prefixSums.put(
                currentSum,
                prefixSums.getOrDefault(currentSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = subarraySum(nums, k);

        System.out.println("Number of subarrays: " + result);

        sc.close();
    }
}