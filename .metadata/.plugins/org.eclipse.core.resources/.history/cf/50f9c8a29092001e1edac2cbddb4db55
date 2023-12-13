Feature: Login into Appian Application

Scenario: Verifying login functionality

	* configure driver = { type: 'chrome', addOptions: ["--remote-allow-origins=*"] } 
	Given driver 'https://yexledemo.appiancloud.com/suite/sites/automation-cases'
	* delay(2000)
	* maximize()
	* delay(2000)
	And input('#un', 'YexleQA')
	* delay(2000)
	And input('#pw', 'Test1235')
	* delay(2000)
	And mouse("input[value='Sign In']").click()
	* delay(5000)