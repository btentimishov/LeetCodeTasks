package easy

class BestPokerHand2347 {

    companion object {
        fun main(args: Array<String>) {

        }

    }

    fun bestHand(ranks: IntArray, suits: CharArray): String {
        //check for five
        //we check for five cards at the beginning
        for (i in 1 until suits.size) {
            if (suits[i] != suits[i - 1]) break
            if (i == suits.size - 1) return "Flush"
        }


        val map: MutableMap<Int, Int> = mutableMapOf()
        //add every value in maps
        for (i in ranks.indices) {
            map[ranks[i]] = if (map.containsKey(ranks[i])) map[ranks[i]]!! + 1 else 1
        }


        var isPair = false
        map.forEach { (_, v) ->
            when {
                v >= 3 -> return "Three of a Kind"
                v == 2 -> isPair = true
            }
        }

        return if (isPair) "Pair" else "High Card"
    }
//    fun bestHand(ranks: IntArray, suits: CharArray): String {
//        //check for five
//        //we check for five cards at the beginning
//        for (i in 1 until suits.size) {
//            if (suits[i] != suits[i-1]) break
//            if (i == suits.size - 1) return "Flush"
//        }
//
//
//        val map: MutableMap<Int, Int> = mutableMapOf()
//        //add every value in maps
//        for (i in ranks.indices) {
//            map[ranks[i]] = if (map.containsKey(ranks[i])) map[ranks[i]]!! + 1 else 1
//        }
//
//
//        var isPair = false
//        map.forEach { (_, v) ->
//            if (v >= 3) return "Three of a Kind"
//            if (v == 2) isPair = true
//        }
//
//        if (isPair) return "Pair"
//
//        return "High Card"
//    }


    fun canConstruct(r: String, m: String): Boolean {
        val map = mutableMapOf<Char, Int>()


        for (element in m) {
            map[element] = map.getOrDefault(element, 0) + 1
        }
        for (element in r) {
            if (map.containsKey(element)) {
                if (map[element]!! <= 0) return false
                else map[element] = map[element]!! - 1
            } else return false
        }
        return true
    }
}