@orangehrm @EmpReg
Feature: New Employee Registration

  @New_Emp_Registration
  Scenario: Check New Employee Registration with valid data
    Given i open browser with url
    When i enter the username as "Admin"
    And i enter password as "admin123"
    And i click login
    When i goto add employee page
    And i enter firstname as "Rajesh"
    And i enter lastname as "Patra"
    And i click save
    And i click logout
    When i close browser