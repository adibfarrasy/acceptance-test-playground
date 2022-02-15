package me.adibfarrasy.utils

@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class CounterChannel(val type: CounterChannelEnums)
