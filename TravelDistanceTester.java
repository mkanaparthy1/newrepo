public class TravelDistanceTester {
    
    public static void main(String[] args) {

        TravelDistance traveldistance = new TravelDistance();
        try {
            System.out.println(traveldistance.calculateWays(3));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // The number of ways to reach distance of 4 should be 3.
        try {
            if (TravelDistance.calculateWays(4) != 3) {
                System.out.println("TEST 1 FAILED.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // The number of ways to reach distance of 5 should be 5.
        try {
            if (TravelDistance.calculateWays(5) != 4) {
                System.out.println("TEST 2 FAILED.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
}
