

Feature: Verifying registration page taking valid details
  

  @tag1
  Scenario: User want to register sucessfully
    Given User is landed on nopecommerce page
    When User clicks on Register button
    And User want to fill the required details has below
    | Naveen Reddy | Kotha | naveen777@gmail.com| Naveen#777 |
    Then After sucessfull registration verify with this msg "Your registration completed"
  
