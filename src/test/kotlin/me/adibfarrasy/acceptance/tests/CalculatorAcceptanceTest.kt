package me.adibfarrasy.acceptance.tests

import me.adibfarrasy.MyNumber
import me.adibfarrasy.drivers.counters.Calculator
import me.adibfarrasy.utils.CounterChannel
import me.adibfarrasy.utils.CounterChannelEnums
import org.junit.Test

class CalculatorAcceptanceTest {

    private val counter = Calculator()

    @Test
    @CounterChannel(CounterChannelEnums.CALCULATOR)
    fun shouldAddInitialNumberByOne() {
        counter.setInitialNumber(MyNumber(1))
        counter.addBy(MyNumber(1))
        val result = counter.getResult()

        assert(result.getValue() == 2)
    }
}