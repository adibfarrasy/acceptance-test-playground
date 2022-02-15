package me.adibfarrasy.acceptance.tests

import me.adibfarrasy.MyNumber
import me.adibfarrasy.drivers.counters.ManualClicker
import me.adibfarrasy.utils.CounterChannel
import me.adibfarrasy.utils.CounterChannelEnums
import org.junit.Test

class ManualClickerAcceptanceTest {

    private val counter = ManualClicker()

    @Test
    @CounterChannel(CounterChannelEnums.MANUAL_CLICKER)
    fun shouldAddInitialNumberByOne() {
        counter.setInitialNumber(MyNumber(1))
        counter.addBy(MyNumber(1))
        val result = counter.getResult()

        assert(result.getValue() == 2)
    }
}