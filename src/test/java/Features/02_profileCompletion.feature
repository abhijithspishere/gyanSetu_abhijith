Feature: User Profile Completion

  Scenario: Completing User Profile in One Flow
# Filling Basic Information Section
    Given The user is on the Basic Information section
    When The user enters "Suresh" as First Name
    And The user enters "Kumar" as Last Name
    And The user selects Gender
    And The user enters DOB
    And The user enters "Michael Doe" as Father Name
    And The user enters "Jane Doe" as Mother Name
    And The user enters "Robert Smith" as Guardian Name
    And The user enters "Software Engineer" as Aim
    And The user uploads a profile picture
    And The user clicks the Next button

# Filling Current Address
    And The user enters "123 Main Street" as Address 1
    And The user enters "Apt 101" as Address 2
    And The user selects "USA" as Country
    And The user selects "California" as State
    And The user enters "Los Angeles" as City
    And The user enters "Los Angeles" as District
    And The user enters "90001" as Pincode

# Selecting Same as Current Address for Permanent Address
    And The user selects "Same as Current Address" for permanent address
    And The user clicks the Next button

# Filling Hobbies and Languages
    And The user selects "Reading" as Hobby
    And The user selects "English" as Language Known
    And The user selects "Fluent" as Proficiency
    And The user clicks the Next button

# Filling Academic History
    And The user selects "High School" as School
    And The user selects "CBSE" as Board
    And The user selects "California" as State
    And The user selects "Class 12" as Class
    And The user clicks the Next button

# Filling Contact Details
    And The user enters "1234567890" as Mobile Number
    And The user enters "0987654321" as WhatsApp Number
    And The user clicks the Next button

# Filling Subject Preferences
    And The user selects "Computer Science" as Course
    And The user selects "Semester 1" as Semester
    And The user selects "Data Structures" as Subject
    And The user enters "85" as Score Percentage
    And The user clicks the Submit button