Feature: Validating Registration API
@Regression
Scenario: Verify user is able to make Registration successfully 
    Given Add Registration payload
    When User call "RegistrationAPI" with "POST" http request
    Then the API Calls is success with status code 200
    And "success" in response body is a "true"


     