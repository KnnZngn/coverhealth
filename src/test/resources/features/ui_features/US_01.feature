Feature: Registration

  @ValidSSN
  Scenario Outline: User provide valid ssn in the ssn box
    Given user opens the URL "https://medunna.com"
    When Click on the sign in and account icon
    And Click on Register Button
    When Type the valid ssn as "<ssn>"
    And Close the application

    Examples:
      |ssn |
      |123-45-6789  |
      |223-45-6789  |
      |001-45-3789|
      |011-46-4789|
      |000-45-7892|
      |000-00-0000|


  @InvalidSSN
  Scenario Outline: User provide multiple invalid ssn in the ssn box
    Given user opens the URL "https://medunna.com"
    When Click on the sign in and account icon
    And Click on Register Button
    When Type the multiple invalid ssn as "<ssn>"
#    Then Verify text that "Your SSN is invalid" is displayed
#    And Close the application
    Examples:
      | ssn |
      |12345678991|
      |12345678|
      |001-45-3789|
      |011-46-4789|
      |000-45-7892|
      |000-00-0000|
      |12-45-7899|
      |1234-45-7893|
      |123-1-4444|
      |123-333-7893|
      |123-45-789|
      |123-45-78945|

    @EmptySSN
    Scenario Outline: User don't write any char in the ssn box
      Given user opens the URL "https://medunna.com"
      When Click on the sign in and account icon
      And Click on Register Button
      When Click on the ssn box and leave empty ssn
      And Enter a valid first name into the "<firstname>" box
      And Enter a valid last name into the "<lastname>"box
      And Enter a valid user name into the "<username>" box
      And Enter a valid email into the "<email>"
      And Enter a valid password into the "<newPassword>" box
      And Enter a confirming password into the "<confirmPassword>" box
#      When Click on the last Register button
      Then Verify text that "Your SSN is required" is displayed

      Examples:
        | firstname | lastname | username | email | newPassword | confirmPassword |
        | Adam | Blossom | Christ | adam@hotmail.com | adblch22. | adblch22. |

  @ValidFirstName
  Scenario Outline: User provide any char in the first name box
    Given user opens the URL "https://medunna.com"
    When Click on the sign in and account icon
    And Click on Register Button
    When Type the valid ssn as "<ssn>"
    And Enter a valid first name into the "<firstname>" box
      And Enter a valid last name into the "<lastname>"box
      And Enter a valid user name into the "<username>" box
      And Enter a valid email into the "<email>"
      And Enter a valid password into the "<newPassword>" box
      And Enter a confirming password into the "<confirmPassword>" box
      When Click on the last Register button
      Then Verify text that "Your SSN is required" is displayed
      Examples:
        | ssn | firstname | lastname | username | email | newPassword | confirmPassword |
        | 457-23-7048 | Faraklit | Miracle | ambassader | peace@gmail.com | Slms6666. | Slms6666. |
        | 457-23-7047 | . | Miracle | ambassader | peaces@gmail.com | Slms6666.. | Slms6666.. |
        | 457-23-7046 | 7 | Miracle | ambassader | peacess@gmail.com | Slms6666... | Slms6666... |
        | 457-23-7045 | 0 | Mracless | ambassadrr | peaceesss@gmail.com | Slms6666...s | Slms6666...s |
        | 457-23-7044 | ' | Mraclesss | ambassadrrr | peaceeesss@gmail.com | Slms6666...ss | Slms6666...ss |
        | 457-23-7043 | :) | Mraclessss | ambassadrrrr | peaceeeesss@gmail.com | Slms6666...sss | Slms6666...sss |








