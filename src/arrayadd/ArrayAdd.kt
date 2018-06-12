package arrayadd

fun main(args: Array<String>) {
    val myArray = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)
    val sum = myArray
            .filter({n -> (n%2)==1})
            .map({n -> n * 2})
            .reduce({n, acc -> acc + n})
    println(sum)
}
