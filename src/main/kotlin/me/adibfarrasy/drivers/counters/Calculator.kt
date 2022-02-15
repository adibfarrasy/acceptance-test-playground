package me.adibfarrasy.drivers.counters

import me.adibfarrasy.MyNumber

class Calculator: CounterDSL {
    private lateinit var storedNumber: MyNumber
    private lateinit var storedOperator: String
    private lateinit var storedNumber2: String

    override fun setInitialNumber(number: MyNumber) {
        storedNumber = number
    }

    override fun addBy(number: MyNumber) {
        setOperator("+")
        setNumber2("${number.getValue()}")
        executeCalculation()
    }

    override fun getResult(): MyNumber {
        return storedNumber
    }

    private fun setOperator(operator: String){
        storedOperator = operator
    }

    private fun setNumber2(number: String) {
        storedNumber2 = number
    }

    private fun executeCalculation() {
        val newValue = if (storedOperator == "+") storedNumber.getValue().plus(storedNumber2.toInt()) else 0
        storedNumber = MyNumber(
            value = newValue
        )
    }
}