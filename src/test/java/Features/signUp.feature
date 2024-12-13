Feature: signUp User View

  Scenario Outline: Validate the user can Sign up
    Given User navigate to signup page
    When User enters valid "<username>" and "<password>"
    Then user should be able to see User created successfully

    Examples:
      | username                      | password   |
      | demo.user015y@gmail.com       | Xtreme@123 |
      | sample.test024y@gmail.com     | Xtreme@123 |
      | user.example063y@gmail.com    | Xtreme@123 |

