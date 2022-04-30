public class TypeOfNumber {

// For a given integer M, perform the following conditional actions:
//If M is a multiple of 3 and 5, return "Nice number".
//If M is only a multiple of 3 and not 5, return "Invalid number".
//If M is only a multiple of 5 and not 3, return "Bad Number".
//If M does not satisfy any of the above conditions, return "-1".

    public String typeOfNumber(int a) {
        if (a % 3 == 0 && a % 5 == 0) {

            return "Nice number";
        } else if (a % 3 == 0 && a % 5 != 0) {

            return "Invalid number";
        } else if (a % 5 == 0 && a % 3 != 0) {

            return "Bad Number";
        } else {

            return "-1";
        }
    }
}
