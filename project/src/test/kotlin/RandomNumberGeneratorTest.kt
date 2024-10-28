import org.junit.Test

class RandomNumberGeneratorTest {

    @Test
    fun verifyTrueIsAlwaysTrue() {
        assert(true == true)
    }

//    @Test
//    fun verifyTrueIsNotAlwaysTrue() {
//        assert(true == false)
//    }

    @Test
    fun `getRandom returns value between 0 and 100`() {
        val random = getRandom(100)
        assert(random in 0 .. 100)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `getRandom throws exception when negative value is passed`() {
        getRandom(-1)

    }



}