package easy

class SummaryRanges228 {
    fun summaryRanges(nums: IntArray): List<String> {
        val result: MutableList<String> = ArrayList()
        var sb = StringBuilder()
        var i = 0
        while (i < nums.size) {
            val num = nums[i]
            sb.append(num)
            var temp = num
            while (i < nums.size - 1) {
                temp = if (nums[i + 1] - 1 == nums[i]) {
                    i++
                    nums[i]
                } else {
                    break
                }
            }
            if (num != temp) {
                sb.append("->").append(temp)
            }
            result.add(sb.toString())
            sb = StringBuilder()
            i++
        }
        return result
    }
    companion object {

        fun not(f: (Int) -> Boolean): (Int) -> Boolean {
            return {n -> !f.invoke(n)}
        }
        @JvmStatic
        fun main(args: Array<String>) {

//            val fooString = "My String Is Here!"
//            val barString = "Printing on a new line?\nNo Problem! Foostring is here: ${fooString.length}"
//            val bazString = "Do you want to add a tab?\tNo Problem!"
//            println(fooString)
//            println(barString)
//            println(bazString)
//            val notPositive = not {it > 0}
//            println(notPositive(10))
//            println(notPositive(-1))
//            val fooRawString = """
//                fun helloWorld(val name : String) {
//                    println("Hello, world!")
//                }
//                """
//            println(fooRawString)
//            val sum = SummaryRanges228()
//            val arr = intArrayOf(0,1,2,4,5,7)
//            println(sum.summaryRanges(arr))



//            val fooExampleClass = ExampleClass(7)
            // Member functions can be called using dot notation.
//            println(fooExampleClass.memberFunction(4)) // => 11
            /*
            If a function has been marked with the "infix" keyword then it can be
            called using infix notation.
            */
//            println(fooExampleClass infixMemberFunction 5) // => 28


//            val z = (1..9).map {it * 3}
//                .filter {it < 25}
//                .groupBy {it % 2 == 0}
////                .mapKeys {if (it.key) "even" else "odd"}
//            println(z) // => {odd=[3, 9, 15], even=[6, 12, 18]}
//            for (c in "hello") {
//                println(c)
//            }


//            var ctr = 0
//            while (ctr < 5) {
//                println(ctr)
//                ctr++
//            }
//            println("Index $ctr")
//            println("It's break")
//            ctr = 0
//            do {
//                println(ctr)
//                ctr++
//            } while (ctr < 5)
//
//            println("Index $ctr")




            var fooString = "hello world"
            val i = 10
            when {
                i < 7 -> {
                    println("first block")
                }
                fooString.startsWith("hello") -> println("second block")
                else -> println("else block")
            }

        }


    }

    class ExampleClass(val x: Int) {
        fun memberFunction(y: Int): Int {
            return x + y
        }

        infix fun infixMemberFunction(y: Int): Int {
            return x * y
        }
    }
}