package easy

class BestPokerHand2347 {
    fun bestHand(ranks: IntArray, suits: CharArray): String {
        //check for five
        //we check for five cards at the beginning
        for (i in 1 until suits.size) {
            if (suits[i] != suits[i-1]) break
            if (i == suits.size - 1) return "Flush"
        }


        val map: MutableMap<Int, Int> = mutableMapOf()
        //add every value in maps
        for (i in ranks.indices) {
            map[ranks[i]] = if (map.containsKey(ranks[i])) map[ranks[i]]!! + 1 else 1
        }


        var isPair = false
        map.forEach { (_, v) ->
            if (v >= 3) return "Three of a Kind"
            if (v == 2) isPair = true
        }

        if (isPair) return "Pair"

        return "High Card"
    }
}