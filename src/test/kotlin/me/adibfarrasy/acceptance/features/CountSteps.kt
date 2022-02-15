package me.adibfarrasy.acceptance.features

import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import me.adibfarrasy.acceptance.mocks.counters.CounterMock
import me.adibfarrasy.MyNumber

class CountSteps {
    private val dsl = CucumberDSL(counter = CounterMock())

    @Given("^Initial value of \\d+ $")
    fun initial_value_of(initialNumber: MyNumber) {
        dsl.counter.setInitialNumber(initialNumber)
    }

    @When("^I add by \\d+ $")
    fun i_add_by(number: MyNumber) {
        dsl.counter.addBy(number)
    }

    @Then("^I get result \\d+$")
    fun i_get_result() {
        dsl.counter.getResult()
    }
}