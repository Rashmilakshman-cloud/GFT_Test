Feature: Implementing data driven approach

Scenario Outline: Successfull Registration
  Given user access the registration page
  When user enters "<username>" , "<firstname>" , "<lastname>" , "<password>" , "<confirmpassword>" , "<gender>" , "<email>" , "<mobileno>" ,"<dateOfBirth>" ,"<address>","<Securityquestion>","<answer>"
  Then user navigtes to login page
  
   Examples:
   | username|firstname|lastname|password|confirmpassword|gender|email           |mobileno  |dateOfBirth|address |Securityquestion  |answer    |
   |Sanjana |ananth   |Bs      |12345   |12345          |male  |ananth@gmail.com|9087654    |20/01/98|Chennai   |My fav food?      |Biriyani  |