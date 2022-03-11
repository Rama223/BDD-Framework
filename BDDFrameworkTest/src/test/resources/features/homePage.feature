@HomePageTest
Feature: am going to test ntl taxi application
Scenario Outline: test ntl taxi app with valid data

Given open browser as <BROWSER>
Then enter url as <URL>
Then enter userName as <USERNAME>
Then enter mobileNo as <MOBILENO>
And enter pickup address as <PICADD>
Then enter drop address as <DROPADD>
And select basic as <BASIC>
When click book later checkbox
But dont click book button


Examples:
|BROWSER|URL|USERNAME|MOBILENO|PICADD|DROPADD|BASIC|
|firefox|http://www.ntltaxi.com/|testa|1234567890|ADYAR|ADAMBAKKAM|Sedan|
|firefox|http://www.ntltaxi.com/|testb|2345234523|ADYAR|ADAMBAKKAM|Sedan|
|firefox|http://www.ntltaxi.com/|testc|3456345634|ADYAR|ADAMBAKKAM|Sedan|
|firefox|http://www.ntltaxi.com/|testd|5678567856|ADYAR|ADAMBAKKAM|Sedan|