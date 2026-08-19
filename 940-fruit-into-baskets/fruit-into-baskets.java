class Solution {
    public int totalFruit(int[] fruits) {

        int left = 0;
        int maxLen = 0;
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // Shrink window if more than 2 fruit types
            while (map.size() > k) {

                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}