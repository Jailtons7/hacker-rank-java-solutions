/*
You are updating the username policy on your company's internal networking platform.
According to the policy, a username is considered valid if all the following constraints are satisfied:

    1 - The username consists of 8 to 30 characters inclusive.
    If the username consists of less than or greater than
    characters, then it is an invalid username.

    2 - The username can only contain alphanumeric characters and underscores (_).
    Alphanumeric characters describe the character set consisting of lowercase characters,
    uppercase characters and digits.

    3 - The first character of the username must be an alphabetic character, i.e., either lowercase character
    or uppercase character.

Input Format:
The first line of input contains an integer, describing the total number of usernames.
Each of the next lines contains a string describing the username.

Sample Input 0:
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

Sample Output 0

Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid

 */
package strings;

import java.util.Scanner;


class UsernameValidator {
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}


public class ValidUsername {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
