public class BreakAndContinue {

    // break; nhay khoi vong lap
    // continue tiep vong lap

    public static void testBreakAndContinue() {

        for (int i = 0; i < 10; i++) {

            if (i == 8) {
                System.out.println("gia trị i = " + i);
                break;

            } else if (i == 2)
                continue;
        }
    }

}