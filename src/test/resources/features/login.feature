  @orangehrm @Login
  Feature: Admin Login

    @Login_with_valid_data
    Scenario: Check admin login with valid data
      Given i open the browser with url
      When i enter the username as "Admin"
      And i enter password as "admin123"
      And i click login
      Then i should see admin Dashboard

    @Login_with_invalid_data
    Scenario Outline: Check admin login with Invalid Data
      Given i open the browser with url
      When i enter the username as "<username>"
      And i enter password as "<password>"
      And i click login
      Then i should see "Invalid credentials" Message

      Examples:
        | username | password    |
        | admin    | admin1234  |
        | Admin    | demo@125   |
