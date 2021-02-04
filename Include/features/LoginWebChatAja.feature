

Feature: Login Web Chataja feature
Scenario Outline: Test Login with valid credentials


Given User navigates to Login page
When User enters <phone_number> and <otp>
And Click on Login Button
Then User navigate to Home


	Examples:
	| phone_number | otp |
	| 89607257459 | otp |