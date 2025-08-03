import java.util.Scanner;

public class  complete_abcd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alpha;

        System.out.println("Please enter your name in caps: ");
        alpha = scanner.nextLine();
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }

            for (int j = (2 * i - 2); j < (2 * 5 - 2); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 9; i >= 1; i--) {
            for (int j = i; j < 9; j++) {
                System.out.print(" ");
            }
            System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int n = 0; n < alpha.length(); n++) {
            char ch = alpha.charAt(n);
            switch (ch) {
                case 'A':
                    System.out.println();
                    for (int i = 0; i <= 5; i++) {
                        for (int j = i; j <= 5; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("a");
                        for (int k = 1; k <= 2 * i - 1; k++)
                            System.out.print(" ");
                        System.out.print("a");
                        System.out.println();
                    }
                    break;
                case 'B':
                    System.out.println();
                    for (int i = 0; i <= 11; i++) {
                        for (int j = 0; j <= 2; j++) {
                            System.out.print("b");
                        }
                        for (int k = 1; k <= 5; k++) {
                            if (i >= 0 && i < 2 || i > 4 && i < 7 || i > 9 && i <= 11) {
                                System.out.print("bb");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        for (int j = 0; j <= 2; j++) {
                            if (i >= 0 && i < 2 || i > 4 && i < 7 || i > 9 && i <= 11) {
                                System.out.print(" ");
                            } else {
                                System.out.print("b");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 'C':
                    System.out.println();
                    System.out.println("c c c c c");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("c");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("c c c c c c");
                    break;
                case 'D':
                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("d");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("d");
                        System.out.println();
                    }
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("d");
                        for (int k = 5; k >= i; k--) {
                            System.out.print(" ");
                        }
                        System.out.print("d");
                        System.out.println();
                    }
                    break;
                case 'E':
                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        if (i % 2 != 0) {
                            for (int j = 1; j <= 4; j++) {
                                System.out.print("e");
                            }
                        } else {
                            System.out.print("e");
                        }
                        System.out.println();
                    }
                    break;
                case 'F':
                    System.out.println();
                    for (int i = 1; i <= 4; i++) {
                        if (i % 2 != 0) {
                            for (int j = 1; j <= 4; j++) {
                                System.out.print("f");
                            }
                        } else {
                            System.out.print("f\nf");
                        }
                        System.out.println();
                    }
                    break;
                case 'H':
                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("h");
                        for (int j = 1; j <= 7; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("h");
                    }
                    System.out.println("h h h h h");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("h");
                        for (int j = 1; j <= 7; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("h");
                    }
                    break;
                case 'I':
                    System.out.println();
                    System.out.println("i i i i i");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 4; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("i");
                    }
                    System.out.println("i i i i i");
                    break;
                case 'J':
                    System.out.println();
                    System.out.println("j j j j j");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 4; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("j");
                    }
                    System.out.println("j j");
                    break;
                case 'K':
                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("k");
                        for (int j = 4; j >= i; j--) {
                            System.out.print(" ");
                        }
                        System.out.print("k");
                        for (int k = 1; k <= i; k++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= 4; i++) {
                        System.out.print("k");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("k");
                        for (int k = 4; k >= i; k--) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 'L':
                    System.out.println();
                    for (int i = 1; i <= 6; i++) {
                        System.out.print("l");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("l l l l l");
                    break;
                case 'M':
                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("m");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("m");

                        for (int j = (2 * i - 2); j < (2 * 5 - 2); j++) {
                            System.out.print(" ");
                        }
                        System.out.print("m");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }

                        System.out.println("m");
                    }
                    break;
                case 'N':
                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("n");
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("n");
                        for (int j = i; j <= 5; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("n");
                    }
                    break;
                case 'O':
                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 4; j >= i; j--) {
                            System.out.print(" ");
                        }
                        System.out.print("o");
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print(" ");
                        }
                        System.out.print("o");
                        System.out.println();
                    }
                    for (int i = 5; i >= 1; i--) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("o");
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print(" ");
                        }
                        System.out.print("o");
                        System.out.println();
                    }
                    break;
                case 'P':
                    System.out.println();
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("p");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("p");
                        System.out.println();
                    }
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("p");
                        for (int k = 3; k >= i; k--) {
                            System.out.print(" ");
                        }
                        System.out.print("p");
                        System.out.println();
                    }
                    for (int l = 1; l <= 4; l++) {
                        System.out.println("p");
                    }
                    break;
                case 'Q':
                    System.out.println();
                    System.out.println("q q q q q");
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("q");
                        for (int j = 1; j <= 7; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("q");
                    }
                    System.out.println("q q q q q");
                    for (int j = 1; j <= 9; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("q");
                    break;
                case 'R':
                    System.out.println();
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("r");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("r");
                        System.out.println();
                    }
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("r");
                        for (int k = 5; k >= i; k--) {
                            System.out.print(" ");
                        }
                        System.out.print("r");
                        System.out.println();
                    }
                    for (int i = 1; i <= 6; i++) {
                        System.out.print("r");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("r");
                    }
                    break;
                case 'S':
                    System.out.println();
                    System.out.println("s s s s");
                    for (int i = 1; i <= 4; i++) {
                        System.out.print("s");
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("s s s s");
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print(" ");
                        }
                        System.out.println("s");
                    }
                    for (int i = 1; i <= 7; i++) {
                        System.out.print("s");
                    }
                    break;
                case 'T':
                    System.out.println();
                    System.out.println("t t t t t");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 4; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("t");
                    }
                    break;
                case 'U':
                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("u");
                        for (int j = 1; j <= 7; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("u");
                    }
                    System.out.println("u u u u u");
                    break;
                case 'V':
                    System.out.println();
                    for (int i = 5; i >= 1; i--) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("v");
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print(" ");
                        }
                        System.out.println("v");
                    }
                    break;
                case 'W':
                    System.out.println();
                    for (int i = 1; i <= 5; i++) {
                        System.out.print("w");
                        for (int j = i; j <= 5; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("w");
                        for (int j = 1; j <= (2 * i - 2); j++) {
                            System.out.print(" ");
                        }
                        System.out.print("w");
                        for (int j = i; j <= 5; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("w");
                    }
                    break;
                case 'X':
                    System.out.println();
                    for (int i = 5; i >= 1; i--) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("x");
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print(" ");
                        }
                        System.out.println("x");
                    }
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 4; j >= i; j--) {
                            System.out.print(" ");
                        }
                        System.out.print("x");
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print(" ");
                        }
                        System.out.println("x");
                    }
                    break;
                case 'Y':
                    System.out.println();
                    for (int i = 5; i >= 1; i--) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        System.out.print("Y");
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print(" ");
                        }
                        System.out.println("Y");
                    }
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 4; j >= i; j--) {
                            System.out.print(" ");
                        }
                        System.out.print("Y");
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 'Z':
                    System.out.println();
                    System.out.println("z z z  z z z");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = i; j < 5; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= (2 * i - 1); j++) {
                            System.out.print(" ");
                        }
                        System.out.println("z");
                    }
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 4; j >= i; j--) {
                            System.out.print(" ");
                        }
                        System.out.print("z");
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print(" ");
                        }
                        System.out.println();
                    }
                    System.out.println("z z z  z z z");
                    break;
            }
        }
        scanner.close();
    }
}
