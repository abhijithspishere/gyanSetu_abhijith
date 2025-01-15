Feature: User Profile Completion after Logging in

  Scenario Outline: User Logging in and Completing the Profile Editing page in One Flow
    Given user navigate to login page
    When user enters valid username as "<username>" and password as "<password>"
    And user clicks on Sign in Now Button
    Then Validate the user can see the profile creation page

    # Filling Basic Information Section
    Given The user is on the Basic Information section
    When The user enters "<firstName>" as First Name
    And The user enters "<lastName>" as Last Name
    And The user selects Gender
    And The user enters DOB
    And The user enters "<fatherName>" as Father Name
    And The user enters "<motherName>" as Mother Name
    And The user enters "<guardianName>" as Guardian Name
    And The user enters "<aim>" as Aim
    And The user uploads a profile picture
    And The user clicks the Address Section

    # Filling Current Address
    And The user enters "<firstAddress>" as FirstAddress
    And The user enters "<secondAddress>" as SecondAddress
    And The user selects "<country>" as Country
    And The user selects "<state>" as State
    And The user enters "<city>" as City
    And The user enters "<district>" as District
    And The user enters "<pincode>" as Pincode

    # Selecting Same as Current Address for Permanent Address
    And The user selects Same as Current Address for permanent address
    And The user clicks the Hobbies Language Session

    # Filling Hobbies and Languages
    And The user selects different Hobbies
    And The user selects Known Languages
    And The user selects Both as Proficiency
    And The user clicks the Academic History Session

    # Filling Academic History
    And The user selects Institute Type as "<instituteType>"
    And The user selects "<board>" as Board
    And The user selects "<class>" as Class
    And The user clicks next
    And The user clicks the Contact Details

    # Filling Contact Details
    And The user enters "<mobileNumber>" as Mobile Number
    And The user enters "<whatsappNumber>" as WhatsApp Number
    And The user clicks on Subject Preference Session

    # Filling Subject Preferences
    And The user selects "<subject>" as Subject
    And The user enters the preferences
    And The user enters "<scorePercentage>" as Score Percentage
    And The user clicks the Submit button
    Then Displays User entered profile details successfully

    Examples:
      | username              | password    | firstName | lastName | fatherName   | motherName | guardianName   | aim                | firstAddress                       | secondAddress                    | country | state    | city        | district           | pincode | instituteType | board | class | mobileNumber | whatsappNumber | subject  | scorePercentage |
      | sushma.@gmail.com     | Xtreme@1    | Arjun     | Suresh   | Suresh Kumar | Ajanta     | Suresh Kumar   | Software Engineer  | NNRA 58 Nalanda Nanthencode        | Kowdiar PO Thiruvananthapuram    | India   | Kerala   | Varkala     | Thiruvananthapuram | 695003  | School        | CBSE  | 10  | 1234567890     | 0987654321     | Science  |  85             |
      | priya123@gmail.com    | Xtreme@1    | Priya     | Ramesh   | Ramesh Kumar | Latha      | Ramesh Kumar   | Doctor             | 23 Residency Road                  | MG Road Bangalore                | India   | Karnataka| Bangalore   | Bangalore          | 560001  | School        | ICSE  | 12   | 9876543210    | 8765432109     | Commerce |  90             |
      | aravindkumar@gmail.com| Xtreme@1    | Aravind   | Kumar    | Kumar Raj    | Meena      | Kumar Raj      | Civil Engineer     | 45 Green Avenue Chennai            | T Nagar Chennai                  | India   | Tamil Nadu| Chennai    | Chennai            | 600017  | School        | State | BE   | 9999999999    | 8888888888     | Maths    |  92             |
