package testSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Test {
    @Given("^print a line$")
    public void printALine() throws Throwable {
        System.out.println("1");

    }

    @And("^print a second line$")
    public void printASecondLine() throws Throwable {
        System.out.println("2");
    }


}
