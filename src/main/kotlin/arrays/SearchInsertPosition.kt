package arrays

// 35. Search Insert Position
fun searchInsert(nums: IntArray, target: Int): Int {

    var leftBound = 0
    var rightBound = nums.size - 1
    var middle: Int

    if (target < nums[leftBound]) return 0
    if (target > nums[rightBound]) return nums.size

    while (leftBound <= rightBound) {
        middle = (leftBound + rightBound) / 2
        when {
            nums[middle] == target -> return middle
            nums[middle] < target -> leftBound = middle + 1
            nums[middle] > target -> rightBound = middle - 1

        }
    }
    return leftBound
}


fun main(args: Array<String>) {
    val inputTest1 = intArrayOf(1,3,5,6)
    val inputTarget1 = 5
    val inputTarget2 = 2
    val inputTarget3 = 7
    val inputTarget4 = 0

    val inputTest2 = intArrayOf(1,3,5)
    val inputTarget5 = 4

    val result1 = searchInsert(inputTest1, inputTarget1)
    val index1 = inputTest1.indexOf(inputTarget1)
    assert(result1 == index1)

    val result2 = searchInsert(inputTest1, inputTarget2)
    assert(result2 == 1)

    val result3 = searchInsert(inputTest1, inputTarget3)
    assert(result3 == 4)

    val result4 = searchInsert(inputTest1, inputTarget4)
    assert(result4 == 0)

    val result5 = searchInsert(inputTest2, inputTarget5)
    assert(result5 == 2)
}