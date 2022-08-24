Feature: validate facebook sign up


@signup1
Scenario Outline: verify user can sign up with invalid information
Given user can launchs urls
Then  user caan type "<firstname>"
Then user can "<lastname>"
Then user can type "<email>"
Then user can write "<newpassword>"
Then user can select month and date and year
Then user can select genders
Then user can click sign up

Examples:
| firstname | lastname|    email        |   newpassword       |
| Jack      | Jr      | jill.Jr0019456@ | Rover.Putla-Man0022 |






@signup2
Scenario Outline: verify user can sign up with invalid information
Given user can launch urll
Then  user caan write "<firstname>"
Then user can types "<lastname>"
Then user can writee "<email>"
Then user cann writee "<newpassword>"
Then user can selectt month and date and year
Then user can selectt genders
Then user can clickk sign up

Examples:
| firstname | lastname|    email        |   newpassword       |
| Jack      | Jr      |                 | Rover.Putla-Man0022 |




