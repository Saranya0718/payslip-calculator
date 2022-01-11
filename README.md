#Payslip Calculator

When I input the employee's details: first name, last name, annual salary(positive integer) and super rate (0% - 50% inclusive), payment start date, the program should generate payslip information with name, pay period, gross income, income tax, net income and super.

The calculation details will be the following:

pay period = per calendar month
gross income = annual salary / 12 months
income tax = based on the tax table provide below
net income = gross income - income tax
super = gross income x super rate
Notes: All calculation results should be rounded to the whole dollar. If >= 50 cents round up to the next dollar increment, otherwise round down.


Taxable income Tax on this income

0 - $20,000 Nil
$20,001 - $40,000 10c for each $1 over $20,000
$40,001 - $80,000 20c for each $1 over $40,000
$80,001 - $180,000 40c for each $1 over $80,000
$180,001 and over 40c for each $1 over $180,000


Build/Create JAR instructions
-------------------------------

To create new build from source:

gradle build

To run test cases:

gradle cleanTest test

To create an executable JAR:

gradle fatJar

Execute JAR:

Execute command:

java -jar payslip-calculator-1.0-SNAPSHOT.jar input.txt output.txt

