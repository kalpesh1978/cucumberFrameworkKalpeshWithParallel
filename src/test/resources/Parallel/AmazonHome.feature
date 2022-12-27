
      
      
      
Feature: Amazon Home Page


Scenario: To check product search according to the search text

Given go to Url "https://www.amazon.co.uk/"
And enter "mobile phone" in search text box
When click on search button 
#Then redirect to category page having page title as "mobiles"
Then redirect to category page
 
      
      