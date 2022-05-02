public class TravelDistance {
    private static final String ERR_MSG = "Invalid input!";

   aram n the distance (in feet) to reach
     
    public static int calculateWays(int n) throws Exception {

        if (n < 0) {
            System.out.println(ERR_MSG);
        } else {
            calcWaysHelper(n);
        }
        return calcWaysHelper(n);

    }



public static int calcWaysHelper (int n){
// base case
            if (n == 0) {
                return 1;
            } else if (n < 0) {
                return 0;

            }

            return calcWaysHelper(n - 3) + calcWaysHelper(n - 1);

        }

    }
