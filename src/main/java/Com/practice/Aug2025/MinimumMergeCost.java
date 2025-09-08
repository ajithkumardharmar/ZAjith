package Com.practice.Aug2025;

import java.util.*;

public class MinimumMergeCost {

    public static int minCostToMerge(List<Integer> dataPoints) {
        if (dataPoints == null || dataPoints.size() <= 1) {
            return 0;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(dataPoints);

        int totalCost = 0;

        while (minHeap.size() > 1) {
            int val1 = minHeap.poll();
            int val2 = minHeap.poll();

            int mergedValue = val1 + val2;
            totalCost += mergedValue;

            minHeap.offer(mergedValue);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the data points (space-separated integers):");
        String inputLine = scanner.nextLine();

        List<Integer> dataPoints = new ArrayList<>();
        for (String part : inputLine.trim().split("\\s+")) {
            dataPoints.add(Integer.parseInt(part));
        }

        int result = minCostToMerge(dataPoints);
        System.out.println("Minimum cost to merge: " + result);
    }
}


//Input:  [20, 30, 40]
//Steps:
//  Merge 20 + 30 = 50 → Cost = 50
//  Merge 50 + 40 = 90 → Cost = 90
//  Total Cost = 50 + 90 = 140
//
//Output: Minimum cost to merge: 140

