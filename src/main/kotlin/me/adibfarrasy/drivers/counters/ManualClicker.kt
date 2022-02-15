package me.adibfarrasy.drivers.counters

import me.adibfarrasy.MyNumber

class ManualClicker : CounterDSL {
    private lateinit var storedNumber: MyNumber

    override fun setInitialNumber(number: MyNumber) {
        storedNumber = number
    }

    override fun addBy(number: MyNumber) {
        for (i in 1..number.getValue()) {
            click()
        }
    }

    override fun getResult(): MyNumber {
        return storedNumber
    }

    private fun click() {
        storedNumber.addBy(MyNumber(1))
    }
}