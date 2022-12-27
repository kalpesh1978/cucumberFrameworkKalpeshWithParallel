Feature: Category Page

Scenario Outline: select brand

Given go to Url "https://www.amazon.co.uk/"
And enter "mobile phone" in search text box
When click on search button 
#Then redirect to category page having page title as "mobiles"
Then redirect to category page

Given User is on category page have title as "<category>"
And Check the value in textbox is "<textvalue>"
When User check on "<brandname>" checkbox
Then Redirected to page having title "<title>"

Examples:
|category|textvalue|brandname|title|
|amazon.co.uk : mobiles|mobiles|samsung|amazon.co.uk : mobiles|  