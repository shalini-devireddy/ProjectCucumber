package stepdefs;

import com.examples.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDefinitions {

    private Integer firstNumber;
    private Integer secondNumber;
    private Integer sum;
    private Calculator calculator= new Calculator();

    @Given("two numbers {int} and {int}")
    public void getTwoNumbers(Integer aFirstNumber, Integer aSecondNumber) {
            firstNumber = aFirstNumber;
            secondNumber = aSecondNumber;
    }

    @When("the numbers are added")
    public void addTwoNumber() {

        sum = Integer.valueOf(calculator.add(firstNumber,secondNumber));
    }

    @When("the numbers are multiplied")
    public void multiplyTwoNumber() {

        sum = Integer.valueOf(calculator.multiplication(firstNumber,secondNumber));
    }

    @Then("the result is {int}")
    public void addResult(Integer result){

        Assert.assertEquals(sum.intValue(),result.intValue());
    }

    @Given("User Says {string}")
    public void userSays(String word) {
        System.out.println(word);
    }

    @When("the system is processing {string}")
    public void systemThinks(String word){
        System.out.println(word);
    }
    @Then("the system should say {string}")
    public void systemSays(String word){
        System.out.println(word);
    }

}
