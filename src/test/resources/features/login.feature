@tag
  Feature: Admin Login

    @Login_Validate
    Scenario: Check admin login with valid data
      Given i open the browser with url
      Then i should the login screen
      When i enter the username  as "Admin"
      And i enter password as "admin123"
      And i click login
      Then i should see admin Dashboard

    @Login_Validate
    Scenario Outline: Check admin login with Invalid Data
      Given i open the browser with the url
      Then i should see a Login Screen
      When i enter the "<username>"
      And i enter the "<password>"
      And i click Login Button
      Then i should see Error Message
      When i Close the Browser

      Examples:
        | username | passwod |
        | neeraj   | neeraj  |
        | hello    | demo    |
        | Admin    | 1213213 |