package Stepdefinitions;

import io.cucumber.java.en.*;

public class AASteps {
	
	@Given("Browser is opened")
	public void browser_is_opened() {
	  System.out.println("Inside step ->>Browser is opened");  
	  
	  
	}

	@When("user is on RE homepage")
	public void user_is_on_re_homepage() {
		System.out.println("Inside step ->>user is on RE homepage"); 
	}

	@When("Clicks on AA component")
	public void clicks_on_aa_component() {
		System.out.println("Inside step ->>Clicks on AA component");
	}

	@Then("user redirects to segment section")
	public void user_redirects_to_segment_section() {
		System.out.println("Inside step ->>user redirects to segment section"); 
	}

	@Then("clicks on audience screen")
	public void clicks_on_audience_screen() {
		System.out.println("Inside step ->>clicks on audience screen");
	}


	

	

}
