package easy

class MaximumNumberofPairsinArray2341 {
    fun numberOfPairs(nums: IntArray): IntArray {
        var pairs = 0

        var left = 0

        val map = IntArray(101)


        for (n in nums) {
            if (map[n] > 0) {
                pairs++
                map[n]--
            } else {
                map[n]--
            }
        }

        for (m in map) {
            left += m
        }

        return intArrayOf(pairs, left)
    }
}