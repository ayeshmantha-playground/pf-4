import java.util.Scanner;

void main() {

    final Scanner SCANNER = new Scanner(System.in);
//    String clearTerminal = "\"\\033[H\\033[2J\")";
    String allNames = "";
    final String BLUE = "\033[34m";
    final String RED = "\033[31m";
    final String RESET = "\033[0m";

    main:
    while (true) {
//        System.out.println(clearTerminal);
        System.out.println("=============================================");
        System.out.println("        WELCOME TO STUDENT DB");
        System.out.println("=============================================");
        System.out.println("1. Add New Student");
        System.out.println("2. Delete Student");
        System.out.println("3. View All Student");
        System.out.println("4. Exit");
        System.out.println();
        System.out.print("Enter Your Command : ");


        switch (SCANNER.nextInt()) {
            case 1 -> {
                System.out.println("=============================================");
                System.out.println("        ADD NEW STUDENT");
                System.out.println("=============================================");
                SCANNER.skip("\n");
                addStudent:
                while (true) {

                    System.out.print("Enter Student Name: ");

                    String newName = SCANNER.nextLine();

                    if (newName.isBlank()) {
                        System.out.println(STR."\{RED}Invalid Name:\{RESET}");
                        continue;
                    }

                    System.out.println(STR."\{BLUE}Student Added SuccessFully\{RESET}");
                 //   allNames = allNames.isBlank() ? newName : allNames + "," + newName;
                    allNames = STR."\{allNames}\{newName},";

                    while (true) {
                        System.out.print("Do you want to add another Student( Y / N): ");
                        switch (SCANNER.next()) {
                            case "Y" -> {
                                SCANNER.skip("\n");
                                continue addStudent;
                            }
                            case "N" -> {
                                continue main;
                            }
                            default -> {
                                System.out.println("Invalid Input");
                            }
                        }
                    }


                }


            }
            case 2 -> {
                System.out.println("=============================================");
                System.out.println("DELETE STUDENT");
                System.out.println("=============================================");


                SCANNER.skip("\n");
                deleteStudent:
                while (true) {
                    System.out.print("Enter student name to delete: ");
                    String nameDelete = SCANNER.nextLine()+",";

                    if (!allNames.contains(nameDelete)) {
                        System.out.println("Name not found");
                        continue;
                    }

                    allNames = allNames.replace(nameDelete, "");
                    System.out.println(STR."\{BLUE}Student deleted Successfully\{RESET}");
                    while (true) {
                        System.out.print("Do you want to delete another student (Y / N)");
                        switch (SCANNER.next()) {
                            case "Y" -> {
                                continue deleteStudent;
                            }
                            case "N" -> {
                                continue main;
                            }
                            default -> {
                                System.out.println("Invalid Input");
                            }
                        }
                    }

                }

            }
            case 3 -> {
                System.out.println("=============================================");
                System.out.println("                ALL STUDENTS");
                System.out.println("=============================================");
                System.out.println(allNames);

                while (true) {
                    System.out.print("Enter \"H\" to go back to Home (H): ");
                    if (SCANNER.next().equals("H")) {
                        continue main;
                    }
                }
            }
            default -> {
                System.out.println(STR."\{RED}Invalid Command: \{RESET}");
            }
        }

    }


}