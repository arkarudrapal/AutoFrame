@all
Feature: Resolver - Automation Case Study Test Page 

Background: 
	Given user navigate to Home page 
	
@test1 
Scenario: Test1 
	When user enters "arkarudrapal@gmail.com" in email address 
	And user enters "1234" in password 
	And clicks on SignIn button 
	Then user is navigated to the Home page 
	
@test2 
Scenario: Test2 
	When user checks the listgroup 
	Then number of values in listgroup is 3 
	And value of second item in listgroup is "List Item 2" 
	And badge value of second list item is 6 
	
@test3 
Scenario: Test3 
	When user checks test3div 
	Then default value if "Option 1" 
	And user selects the value "Option 3" 
	
@test4 
Scenario: Test4 
	When user checks test4div 
	Then first button is enabled 
	And second button is disabled 
	
@test5 
Scenario: Test5 
	When user clicks the button 
	Then success message appears 
		
@test6 
Scenario: Test6 
	When user check the value of the table at 2,2 co-ordinated 
	Then the value fetched is "Ventosanzap" 
							