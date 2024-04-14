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