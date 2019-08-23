package org.autoframe.arpal.Steps;

import java.util.logging.Logger;

import org.autoframe.arpal.SetUp.Driver;
import org.autoframe.arpal.implement.TestStepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {

	TestStepDefinition tsd;

	Logger log = Logger.getLogger(Driver.class.getName());

	public TestSteps(TestStepDefinition tsd) {
		this.tsd = tsd;
	}

	@Given("^user navigate to Home page$")
	public void user_navigate_to_Home_page() throws Throwable {
		tsd.clickHome();
	}

	@When("^user enters \"([^\"]*)\" in email address$")
	public void user_enters_in_email_address(String emailText) throws Throwable {
		tsd.enterEmail(emailText);
	}

	@When("^user enters \"([^\"]*)\" in password$")
	public void user_enters_in_password(String passText) throws Throwable {
		tsd.enterPassWord(passText);
	}

	@When("^clicks on SignIn button$")
	public void clicks_on_SignIn_button() throws Throwable {
		tsd.clickSignInButton();
	}

	@Then("^user is navigated to the Home page$")
	public void user_is_navigated_to_the_Home_page() throws Throwable {
		tsd.verifyHomePage();
	}

	@When("^user checks the listgroup$")
	public void user_checks_the_listgroup() throws Throwable {
		tsd.verifySizeUOL();
	}

	@Then("^number of values in listgroup is (\\d+)$")
	public void number_of_values_in_listgroup_is(int number) throws Throwable {
		if(tsd.verifySizeUOL()==number)
			log.info("The number of values in the list group is 3.");
	}

	@Then("^value of second item in listgroup is \"([^\"]*)\"$")
	public void value_of_second_item_in_listgroup_is(String value) throws Throwable {
		if(tsd.getUOL2text().getText().contains(value))
			log.info("The value of the second item in the list is " + value +".");
	}

	@Then("^badge value of second list item is (\\d+)$")
	public void badge_value_of_second_list_item_is(int number) throws Throwable {
		int badgeValue = Integer.parseInt(tsd.getBadgeValue());
		if(badgeValue==number)
			log.info("The badge value is 6.");
	}

	@When("^user checks test(\\d+)div$")
	public void user_checks_test_div(int arg1) throws Throwable {
		tsd.verifyTestDiv3();
	}

	@Then("^default value if \"([^\"]*)\"$")
	public void default_value_if(String value) throws Throwable {
		tsd.verifyDefaultValTestDiv3(value);
	}

	@Then("^user selects the value \"([^\"]*)\"$")
	public void user_selects_the_value(String value) throws Throwable {
		tsd.selectValueDropdown(value);
	}

	@Then("^first button is enabled$")
	public void first_button_is_enabled() throws Throwable {
		tsd.buttonEnabled();
	}

	@Then("^second button is disabled$")
	public void second_button_is_disabled() throws Throwable {
		tsd.buttonDisabled();
	}

	@When("^user clicks the button$")
	public void user_clicks_the_button() throws Throwable {
		tsd.buttonClick();
	}

	@Then("^success message appears$")
	public void success_message_appears() throws Throwable {
		tsd.verifySuccesMessage();
	}

	@When("^user check the value of the table at (\\d+),(\\d+) co-ordinated$")
	public void user_check_the_value_of_the_table_at_co_ordinated(int row, int col) throws Throwable {

	}

	@Then("^the value fetched is \"([^\"]*)\"$")
	public void the_value_fetched_is(String value) throws Throwable {

	}	
}
