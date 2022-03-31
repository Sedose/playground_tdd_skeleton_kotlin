import io.kotest.core.spec.style.FunSpec
import io.kotest.core.tuple
import io.kotest.matchers.shouldBe

class Test: FunSpec({

    listOf(
        tuple(intArrayOf(2,7,11,15), 9, intArrayOf(0, 1)),
        tuple(intArrayOf(3,2,4), 6, intArrayOf(1, 2)),
        tuple(intArrayOf(3,3), 6, intArrayOf(0, 1)),
    ).forEach { (inputArray, target, expected) ->
        test("should work)") {
            twoSum(inputArray, target) shouldBe expected
        }
    }
})
