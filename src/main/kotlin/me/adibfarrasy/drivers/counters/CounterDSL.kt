package me.adibfarrasy.drivers.counters

import me.adibfarrasy.MyNumber

interface CounterDSL {

    fun setInitialNumber(number: MyNumber)

    fun addBy(number: MyNumber)

    fun getResult(): MyNumber
}