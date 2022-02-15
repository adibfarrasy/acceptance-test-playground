package me.adibfarrasy

class MyNumber(
    private var value: Int
) {
    fun addBy(number: MyNumber) {
        value += number.getValue()
    }

    fun getValue(): Int {
        return this.value
    }
}