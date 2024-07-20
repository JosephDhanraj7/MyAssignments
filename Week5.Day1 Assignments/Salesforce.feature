Feature: Account creation in Salesforce feature

Scenario: Login to Salesforce and create an account

Given Launch the browser and open Salesforce url
And Enter the username and Password
When Click on Login
Given Click on toggle button from the left corner
And Click View All and click Sales from App Launcher
And Click Accounts tab
And Click New button
And Enter 'your name' as Account name
And Selecting Ownership as Public
When Click Save
Then Verify Account is created
