package arrays

// 66. Plus One
fun plusOne(digits: IntArray): IntArray {
    for(i in (digits.size - 1) downTo 0) {
        if(digits[i] == 9) {
            digits[i] = 0
        } else {
            digits[i]++
            return digits
        }
    }

    return IntArray(digits.size + 1){ index ->
        if(index == 0){
            1
        } else{
            0
        }
    }
}


fun main(args: Array<String>) {
    val inputTest1 = intArrayOf(1,2,3)
    val outputTest1 = intArrayOf(1,2,4)

    val inputTest2 = intArrayOf(4,3,2,1)
    val outputTest2 = intArrayOf(4,3,2,2)

    val inputTest3 = intArrayOf(9)
    val outputTest3 = intArrayOf(1,0)

    val result1 = plusOne(inputTest1)
    assert(result1.equals(outputTest1))

    val result2 = plusOne(inputTest2)
    assert(result2.equals(outputTest2))

    val result3 = plusOne(inputTest3)
    assert(result3.equals(outputTest3))

}