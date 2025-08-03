public class heart {
    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {

            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }

            for (int j = 2; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }


            for (int j = (2 * i - 2); j < (2 * 5 - 2); j++) {
                System.out.print(" ");
            }

            for (int j = 2; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = 9; i >= 1; i--) {
            // Spaces before stars
            for (int j = i; j < 9; j++) {
                System.out.print(" ");
            }
            System.out.print(" ");


            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

