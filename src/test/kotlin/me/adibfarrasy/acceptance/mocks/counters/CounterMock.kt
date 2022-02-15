package me.adibfarrasy.acceptance.mocks.counters

import me.adibfarrasy.MyNumber
import me.adibfarrasy.drivers.counters.CounterDSL

class CounterMock: CounterDSL {
    private lateinit var storedNumber: MyNumber

    override fun setInitialNumber(number: MyNumber) {
        storedNumber = number
    }

    override fun addBy(number: MyNumber) {
        storedNumber.addBy(number)
    }

    override fun getResult(): MyNumber {
        return storedNumber
    }
}