fun twoSum(nums: IntArray, target: Int): IntArray {
    return nums.asSequence()
        .withIndex()
        .windowed(2)
        .first { indexedValueList ->
            indexedValueList.sumOf {
                it.value
            } == target
        }.take(2)
        .map {
            it.index
        }.toList()
        .toIntArray()
}
