Feature: User Profile Completion

  Scenario: Filling Basic Information Section
    Given The user is on the Basic Information section
    When The user enters "John" as First Name
    And The user enters "Doe" as Last Name
    And The user selects "Male" as Gender
    And The user enters "01-01-1990" as DOB
    And The user enters "Michael Doe" as Father Name
    And The user enters "Jane Doe" as Mother Name
    And The user enters "Robert Smith" as Guardian Name
    And The user enters "Software Engineer" as Aim
    And The user uploads a profile picture
    And The user clicks the Next button
    Then The user should be navigated to the Address section

  Scenario: Filling Current Address
    Given The user is on the Address section
    When The user enters "123 Main Street" as Address 1
    And The user enters "Apt 101" as Address 2
    And The user selects "USA" as Country
    And The user selects "California" as State
    And The user enters "Los Angeles" as City
    And The user enters "Los Angeles" as District
    And The user enters "90001" as Pincode
    Then The current address should be filled successfully

  Scenario: Selecting Same as Current Address for Permanent Address
    Given The user has filled the current address
    When The user selects "Same as Current Address" for permanent address
    And The user clicks the Next button
    Then The user should be navigated to the Hobbies/Languages section

  Scenario: Filling Different Permanent Address
    Given The user has filled the current address
    When The user enters "456 Another St" as Permanent Address 1
    And The user enters "Suite 202" as Permanent Address 2
    And The user selects "USA" as Permanent Country
    And The user selects "Texas" as Permanent State
    And The user enters "Houston" as Permanent City
    And The user enters "Houston" as Permanent District
    And The user enters "77001" as Permanent Pincode
    And The user clicks the Next button
    Then The user should be navigated to the Hobbies/Languages section

  Scenario: Filling Hobbies and Languages
    Given The user is on the Hobbies/Languages section
    When The user selects "Reading" as Hobby
    And The user selects "English" as Language Known
    And The user selects "Fluent" as Proficiency
    And The user clicks the Next button
    Then The user should be navigated to the Academic History section

  Scenario: Filling Academic History
    Given The user is on the Academic History section
    When The user selects "High School" as School
    And The user selects "CBSE" as Board
    And The user selects "California" as State
    And The user selects "Class 12" as Class
    And The user clicks the Next button
    Then The user should be navigated to the Contact Details section

  Scenario: Filling Contact Details
    Given The user is on the Contact Details section
    When The user enters "1234567890" as Mobile Number
    And The user enters "0987654321" as WhatsApp Number
    And The user clicks the Next button
    Then The user should be navigated to the Subject Preferences section

  Scenario: Filling Subject Preferences
    Given The user is on the Subject Preferences section
    When The user selects "Computer Science" as Course
    And The user selects "Semester 1" as Semester
    And The user selects "Data Structures" as Subject
    And The user enters "85" as Score Percentage
    And The user clicks the Submit button
    Then The user profile completion should be successful
