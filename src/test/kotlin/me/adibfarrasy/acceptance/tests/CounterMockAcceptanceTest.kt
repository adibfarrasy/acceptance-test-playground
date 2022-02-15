package me.adibfarrasy.acceptance.tests

import me.adibfarrasy.acceptance.mocks.counters.CounterMock
import me.adibfarrasy.MyNumber
import me.adibfarrasy.utils.CounterChannel
import me.adibfarrasy.utils.CounterChannelEnums
import org.junit.Test

class CounterMockAcceptanceTest {

    private val counter = CounterMock()

    @Test
    @CounterChannel(CounterChannelEnums.MOCK)
    fun shouldAddInitialNumberByOne() {
        counter.setInitialNumber(MyNumber(1))
        counter.addBy(MyNumber(1))
        val result = counter.getResult()

        assert(result.getValue() == 2)
    }
}