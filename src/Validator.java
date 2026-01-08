public class Validator {

    public static boolean isValidDOB(String dob) {
        // 1. Format check (Length and dashes)
        if (dob.length() != 10 || dob.charAt(4) != '-' || dob.charAt(7) != '-') {
            System.out.println(" Invalid format. Please use YYYY-MM-DD.");
            return false;
        }

        try {
            int year = Integer.parseInt(dob.substring(0, 4));
            int month = Integer.parseInt(dob.substring(5, 7));
            int day = Integer.parseInt(dob.substring(8, 10));

            // 2. Month check (01-12)
            if (month < 1 || month > 12) {
                System.out.println(" Invalid month. It must be between 01 and 12.");
                return false;
            }

            // 3. Year range check
            if (year > 2026 || year < 1900) {
                System.out.println(" Invalid year. Please enter a realistic birth year.");
                return false;
            }

            // 4. Maximum days per month logic
            int maxDay = 31; 
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDay = 30;
            } else if (month == 2) {
                // Leap year check
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
            }

            // 5. Day check
            if (day < 1 || day > maxDay) {
                System.out.println(" Invalid day. Month " + month + " has only " + maxDay + " days.");
                return false;
            }

            return true;

        } catch (NumberFormatException e) {
            System.out.println(" Invalid input. Please enter numbers only.");
            return false;
        }
    }
}