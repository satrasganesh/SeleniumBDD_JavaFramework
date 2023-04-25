Feature: Buggy Software Dashboard
  
  Background: User is on HomePage
 		Given User is on HomePage
 		When Enter user name "BuggyUserGS" and password "Abcd@1234"
  
  @smoketest
  Scenario: Verify Homepage
    Then Homepage is displayed
    And Close the Browser

  @smoketest
  Scenario Outline: Title of your scenario outline
    Given User is on profile page
    When Enter profile info "<gender>" and "<age>" and "<phone>" in additional info pane
    Then Verify profile saved!
    And Close the Browser

    Examples: 
      | gender  | age | phone 			|
      | male 		|  5  | 9090909090	|
      
  @smoketest
  Scenario: Verify Car Item
    When Popular Model "Guilia Quadrifoglio" is chosen
    Then Verify correct car popular model is opened
    And User logs out
    And Close the Browser
    
  @smoketest
  Scenario Outline: Register Page
    Then User logs out
    When Go to Register Page
    And Register with "<username>","<firstname>","<lastname>","<password>" and "<confirmPass>"
    Then Verify resgitered successfully
    And Close the Browser
    
    Examples: 
      | username  | firstname | lastname	| password 	| confirmPass 	|
      | BuggyUser |  Buggy  	| User			| Buggy@ 		| Buggy@				|
      
  @smoketest
  Scenario Outline: Write Review and Verify
  	Then User logs out
  	When Go to Register Page
    And Register with "<username>","<firstname>","<lastname>","<password>" and "<confirmPass>"
    Then Verify resgitered successfully
  	When Enter user name "<username>" and password "<password>" after registeration
  	Then Homepage is displayed
  	When Popular Model "Guilia Quadrifoglio" is chosen
  	When User puts comment "Nice Car"
  	Then User logs out
  	And Close the Browser
  	
    
    Examples: 
      | username  | firstname | lastname	| password 	| confirmPass 	|
      | BuggyUser |  Buggy  	| User			| Buggy@ 		| Buggy@				|
    