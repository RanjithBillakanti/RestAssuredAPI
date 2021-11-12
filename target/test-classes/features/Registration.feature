Feature: Validating Registration API

Scenario: Verify user is able to make Registration successfully 
    Given Add Registration payload
    When User call "RegistrationAPI" with "POST" http request
    Then the API Calls is success with status code 200
    And "status" in response body is a "OK"


     