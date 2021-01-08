package StepsDefs;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multiplication {

	@Given("^I have variable a$")
	public int I_have_variable_a() throws Throwable {
		int a = 50;
		return a;
	}

	@And("^I have variable b$")
	public int I_have_variable_b() throws Throwable {
		int b = 50;
		return b;
	}

	@When("^I multiplication a and b$")
	public int I_multiplication_a_and_b() throws Throwable {
		int a = I_have_variable_a();
		int b = I_have_variable_b();
		int Mul = a * b;
		return Mul;
	}

	@Then("^Display the results$")
	public void Display_the_results() throws Throwable {
		int mul = I_multiplication_a_and_b();
		System.out.println(mul);
	}

	public class Number {
		int a, b;

		public int getFirst() {
			return a;
		}

		public int getSecond() {
			return b;
		}
	}

	@When("^Enter Numbers for Multiplication$")
	public void Enter_Numbers_for_Multiplication(List<Number> numbers) throws Throwable {
		System.out.println("MULTIPLICATION USING Class Objects");
		for (Number values : numbers) {
			System.out.println(
					values.getFirst() + "*" + values.getSecond() + "=" + values.getFirst() * values.getSecond());
		}
	}

	@When("^Multiplication of (\\d+) and (\\d+)$")
	public void multiplication_of_and(int arg1, int arg2) throws Throwable {
		System.out.println("MULTIPLICATION USING Scenario Outline");
		System.out.println(arg1 + "*" + arg2 + "=" + arg1 * arg2);
	}

	@When("^Enter Numbers for Multiplication using DataTable$")
	public void Enter_Numbers_for_Multiplication_using_DataTable(DataTable arg1) throws Throwable {
		List<List<Integer>> val = arg1.asLists(Integer.class);
		System.out.println("MULTIPLICATION USING Datatable");
		for (List<Integer> a : val) {
			System.out.println(a.get(0) + "*" + a.get(1) + "=" + a.get(0) * a.get(1));

		}

		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)

	}

}
