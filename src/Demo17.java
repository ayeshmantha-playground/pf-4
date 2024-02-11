import java.io.IOException;
import java.util.Scanner;

void main() throws IOException, InterruptedException {
    final Scanner SCANNER = new Scanner(System.in);

    main:
    while (true) {

        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.println("============================");
        System.out.println("         DEMO APP            ");
        System.out.println("============================");

        System.out.println("1. First Screen");
        System.out.println("2. Second Screen");
        System.out.println("3. Third Screen");

        System.out.println();
        System.out.print("Enter a screen number to navigate :");

        switch (SCANNER.nextInt()) {
            case 1 -> {

//            new ProcessBuilder("clear").inheritIO().start().waitFor();
                System.out.println("============================");
                System.out.println("         SCREEN 1           ");
                System.out.println("============================");

                System.out.println("1. Go Back");
                System.out.println("2. Exist");

                while (true) {
                    System.out.println("Enter your option");
                    switch (SCANNER.nextInt()) {
                        case 1 -> {
                            continue main;
                        }
                        case 2 -> System.exit(0);
                        default -> System.out.println("\033[31mInvalid Command\033[0m");
                    }
                }


            }
            case 2 -> {

                // Todo: Display Screen 2
            }
            case 3 -> {

                // Todo: Display Screen 3
            }
            default -> System.out.println("Invalid Screen Number");

        }
    }


}