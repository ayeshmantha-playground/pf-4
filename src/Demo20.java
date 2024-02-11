import java.util.Scanner;

void main() {
    final Scanner SCANNER = new Scanner(System.in);
    final String RED = "\033[31m";
    final String BLUE = "\033[34m";
    final String RESET = "\033[0m";
    final String CLEAR_SCREEN = "\033[H\033[2J";

    String allNames = "";
    String allIds = "";
    String allMarksPF = "";
    String allMarksOOP = "";
    String allGradesPF = "";
    String allGradesOOP = "";
    int numberOfStudent = 0;
    int studentNumber = 0;
    int studentId = 1;

    home:
    while (true) {
        System.out.println(CLEAR_SCREEN);
        System.out.println("=============================================");
        System.out.println("        WELCOME TO STUDENT DB");
        System.out.println("=============================================");
        System.out.println("1. Add New Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Search Student");
        System.out.println("4. View All Student");
        System.out.println("5. Exit");
        System.out.println();
        System.out.print("Enter Your Command : ");

        switch (SCANNER.nextInt()) {
            case 1 -> {
                System.out.println(CLEAR_SCREEN);
                System.out.println("=============================================");
                System.out.println("            ADD NEW STUDENT");
                System.out.println("=============================================");

                addStudent:
                while (true) {
                    String newName = "";
                    int newMarksPF = 0;
                    int newMarksOOP = 0;


                    boolean isNameAdded = false;
                    boolean isMarksAddedPF = false;
                    boolean isMarksAddedOOp = false;
                    SCANNER.skip("\n");
                    addName:
                    while (!isNameAdded) {

                        System.out.print(STR."Enter Student Name(Enter \{RED}\"H\"\{RESET} to return home): ");
                        newName = SCANNER.nextLine();

                        if (newName.equalsIgnoreCase("H")) {
                            continue home;
                        }

                        if (newName.isBlank()) {
                            System.out.println("Invalid Name: ");
                            continue;
                        }

                        System.out.println("Name added Successfully");
                        isNameAdded = true;
                    }

                    addMarksPF:
                    while (!isMarksAddedPF) {

                        System.out.print("Enter Marks for PF: ");
                        newMarksPF = SCANNER.nextInt();

                        if (newMarksPF > 100 || newMarksPF < 0) {
                            System.out.println("Invalid Marks");
                            continue;
                        }

                        System.out.println("Marks added Successfully for PF");
                        isMarksAddedPF = true;
                    }

                    addMarksOOP:
                    while (!isMarksAddedOOp) {
                        System.out.print("Enter Marks for OOP: ");
                        newMarksOOP = SCANNER.nextInt();

                        if (newMarksOOP > 100 || newMarksOOP < 0) {
                            System.out.println("Invalid Marks");
                            continue;
                        }

                        System.out.println("Marks added Successfully for OOP");
                        isMarksAddedOOp = true;

                    }

                    // allIds += studentId++ + ",";
                    allIds += String.format("S%03d", studentId++) + ",";
                    allNames += newName + ",";
                    allMarksPF += newMarksPF + ",";
                    allMarksOOP += newMarksOOP + ",";
                    System.out.println("Student Created Successfully");

                    while (true) {
                        System.out.print("Do you want to add a another student ?  (Y / N)");

                        switch (SCANNER.next()) {
                            case "Y" -> {
                                continue addStudent;
                            }
                            case "N" -> {
                                continue home;
                            }
                            default -> {
                                System.out.println("Invalid Input");
                            }
                        }
                    }

                }

                //TODO : ADD NEW STUDENT;
            }

            case 2 -> {
                System.out.println(CLEAR_SCREEN);
                System.out.println("=============================================");
                System.out.println("                DELETE STUDENT");
                System.out.println("=============================================");

                deleteStudent:
                while (true) {
                    System.out.print(STR."Enter Student ID (Enter \\{RED}\\\"H\\\"\\{RESET} to return home): ");

                    String deleteStudent = SCANNER.next();

                    if (deleteStudent.equalsIgnoreCase("H")) {
                        continue home;
                    }

                    if (!allIds.contains(deleteStudent)) {
                        System.out.println("Invalid Student ID");
                        continue;
                    }

                    numberOfStudent = allIds.length() - allIds.replace(",", "").length();
                    System.out.println(STR."Nos Student \{numberOfStudent}");

                    String findId = "";
                    int commaIndexId = 0;
                    int count = 1;

                    for (int i = 0; i < numberOfStudent; i++) {
                        findId = allIds.substring(commaIndexId, allIds.indexOf(',', commaIndexId));
                        System.out.println(STR."Find id: \{findId}");
                        commaIndexId = allIds.indexOf(",", commaIndexId) + 1;


                        if (findId.equals(deleteStudent)) {
                            studentNumber = count;
                        } else {
                            count++;
                        }
                    }

                    commaIndexId = 0;
                    int startIndexId = 0;
                    for (int i = 0; i < studentNumber; i++) {
                        findId = allIds.substring(commaIndexId, allIds.indexOf(',', commaIndexId));
//                        System.out.println(STR."Find id: \{findId}");
                        commaIndexId = allIds.indexOf(",", commaIndexId) + 1;
                        startIndexId += findId.length();
                    }

                    startIndexId = startIndexId - findId.length();
                    allIds = allIds.substring(0, startIndexId) + allIds.substring(startIndexId + 1 + findId.length());


                    String findName = "";
                    int startIndexName = 0;
                    int commaIndexName = 0;
                    for (int i = 0; i < studentNumber; i++) {

                        findName = allNames.substring(commaIndexName, allNames.indexOf(',', commaIndexName));
//                        System.out.println(STR."Find Name: \{findName}");
                        commaIndexName = allNames.indexOf(",", commaIndexName) + 1;
                        startIndexName += findName.length();
//                        System.out.println(STR."Start Index: \{startIndexName}");
                    }


                    startIndexName = startIndexName - findName.length();
                    allNames = allNames.substring(0, startIndexName) + allNames.substring(startIndexName + 1 + findName.length());

                    String findMarksPf = "";
                    int commaIndexMarksPf = 0;
                    int startIndexMarksPF = 0;
                    for (int i = 0; i < studentNumber; i++) {

                        findMarksPf = allMarksPF.substring(commaIndexMarksPf, allMarksPF.indexOf(',', commaIndexMarksPf));
                        System.out.println(STR."Find Marks PF: \{findMarksPf}");
                        commaIndexMarksPf = allMarksPF.indexOf(",", commaIndexMarksPf) + 1;
                        startIndexMarksPF += findMarksPf.length();
                        System.out.println(STR."Start Index: \{startIndexMarksPF}");

                    }

                    startIndexMarksPF = startIndexMarksPF - findMarksPf.length();
                    allMarksPF = allMarksPF.substring(0, startIndexMarksPF) + allMarksPF.substring(startIndexMarksPF + 1 + findMarksPf.length());

                    String findMarkOOP = "";
                    int commaIndexMarksOOP = 0;
                    int startIndexMarksOOP = 0;

                    for (int i = 0; i < studentNumber; i++) {
                        findMarkOOP = allMarksOOP.substring(commaIndexMarksOOP, allMarksOOP.indexOf(',', commaIndexMarksOOP));
//                        System.out.println(STR."Finda marks OOP: \{findMarkOOP}");
                        commaIndexMarksOOP = allMarksOOP.indexOf(",", commaIndexMarksOOP) + 1;
                        startIndexMarksOOP += findMarkOOP.length();
                        System.out.println(STR."Start Index: \{startIndexMarksOOP}");
                    }

                    startIndexMarksOOP = startIndexMarksOOP - findMarkOOP.length();
                    allMarksOOP = allMarksOOP.substring(0, startIndexMarksOOP) + allMarksOOP.substring(startIndexMarksOOP + 1 + findMarkOOP.length());

                    System.out.println("Student Deleted Successfully");
                    while (true) {
                        System.out.println("Do you want to delete a another student? (Y / N)");
                        switch (SCANNER.next()) {
                            case "Y" -> {
                                continue deleteStudent;
                            }
                            case "N" -> {
                                continue home;
                            }
                        }
                    }

                }

            }

            case 3 -> {
                System.out.println("=============================================");
                System.out.println("                SEARCH STUDENT");
                System.out.println("=============================================");


                searchStudent:
                while (true) {

                    System.out.print(STR."Input Student ID to Search (Enter \{RED}\"H\"\{RESET} to return home)");
                    String searchStudent = SCANNER.next();

                    if (!allIds.contains(searchStudent)) {
                        System.out.println("Student ID not found :");
                        continue;
                    }

                    if (searchStudent.equals("H")) {
                        continue home;
                    }

                    numberOfStudent = allIds.length() - allIds.replace(",", "").length();
//                    System.out.println(STR."Nos Student \{numberOfStudent}");

                    String findId = "";
                    int commaIndexId = 0;
                    int count = 1;

                    for (int i = 0; i < numberOfStudent; i++) {
                        findId = allIds.substring(commaIndexId, allIds.indexOf(',', commaIndexId));
                        //  System.out.println(STR."Find id: \{findId}");
                        commaIndexId = allIds.indexOf(",", commaIndexId) + 1;


                        if (findId.equals(searchStudent)) {
                            studentNumber = count;
                        } else {
                            count++;
                        }
                    }

                    commaIndexId = 0;
                    for (int i = 0; i < studentNumber; i++) {
                        findId = allIds.substring(commaIndexId, allIds.indexOf(',', commaIndexId));
                        // System.out.println(STR."Find id: \{findId}");
                        commaIndexId = allIds.indexOf(",", commaIndexId) + 1;
                    }

                    String findName = "";
                    int commaIndexName = 0;
                    for (int i = 0; i < studentNumber; i++) {

                        findName = allNames.substring(commaIndexName, allNames.indexOf(',', commaIndexName));
//                        System.out.println(STR."Find Name: \{findName}");
                        commaIndexName = allNames.indexOf(",", commaIndexName) + 1;
//                        System.out.println(STR."Start Index: \{startIndexName}");
                    }

                    String findMarksPf = "";
                    int commaIndexMarksPf = 0;
                    for (int i = 0; i < studentNumber; i++) {

                        findMarksPf = allMarksPF.substring(commaIndexMarksPf, allMarksPF.indexOf(',', commaIndexMarksPf));
//                        System.out.println(STR."Find Marks PF: \{findMarksPf}");
                        commaIndexMarksPf = allMarksPF.indexOf(",", commaIndexMarksPf) + 1;
//                        System.out.println(STR."Start Index: \{startIndexMarksPF}");

                    }

                    String findMarkOOP = "";
                    int commaIndexMarksOOP = 0;

                    for (int i = 0; i < studentNumber; i++) {
                        findMarkOOP = allMarksOOP.substring(commaIndexMarksOOP, allMarksOOP.indexOf(',', commaIndexMarksOOP));
//                        System.out.println(STR."Find marks OOP: \{findMarkOOP}");
                        commaIndexMarksOOP = allMarksOOP.indexOf(",", commaIndexMarksOOP) + 1;
                    }

                    System.out.println(STR."Student ID: \{findId}\nStudent Name: \{findName}\nMarks PF: \{findMarksPf}\nMarks OOP: \{findMarkOOP}");
                    while (true) {
                        System.out.println("Do you want to Search another Student? (Y / N)");
                        switch (SCANNER.next()) {
                            case "Y" -> {
                                continue searchStudent;
                            }

                            case "N" -> {
                                continue home;
                            }

                            default -> {
                                System.out.println("Invalid Input: ");
                            }
                        }
                    }


                }

            }

            case 4 -> {
                //System.out.println(STR."IDs: \{allIds}\nNames: \{allNames} \nMarksPF: \{allMarksPF} \nMarkOOP: \{allMarksOOP}");

                int nameWidth = 0;
                int totalWidth = 6;
                int averageWidth = 8;

                numberOfStudent = allIds.length() - allIds.replace(",", "").length();
                String findName = "";
                int commaIndexName = 0;

                for (int i = 0; i < numberOfStudent; i++) {
                    findName = allNames.substring(commaIndexName, allNames.indexOf(',', commaIndexName));
                    commaIndexName = allNames.indexOf(",", commaIndexName) + 1;
                    nameWidth = findName.length() > nameWidth ? findName.length() : nameWidth;
                }

                String name = "";
                System.out.println("+".concat("-".repeat(5)).concat("+").concat("-".repeat(nameWidth+2)).concat("+").concat("-".repeat(totalWidth)).concat("+").concat("-".repeat(averageWidth)).concat("+").concat("-".repeat(5)).concat("+"));
                System.out.printf("|%-5s", " ID");
                System.out.printf(STR."|%-\{nameWidth + 2}s", " NAME");
                System.out.printf(STR."|%-\{totalWidth}s", " TOTAL");
                System.out.printf(STR."|%-\{averageWidth}s", " AVERAGE");
                System.out.printf("|%-5s", " STAT");
                System.out.println("|");
                System.out.println("+".concat("-".repeat(5)).concat("+").concat("-".repeat(nameWidth + 2)).concat("+").concat("-".repeat(totalWidth)).concat("+").concat("-".repeat(averageWidth)).concat("+").concat("-".repeat(5)).concat("+"));

                String findId = "";
                String findMarksPf = "";
                String findMarkOOP = "";
                int commaIndexId = 0;
                int commaIndexMarksPf = 0;
                int commaIndexMarksOOP = 0;
                commaIndexName = 0;
                int maxMarks = 0;
                int minMarks = 200;

                for (int i = 0; i < numberOfStudent; i++) {

                    findId = allIds.substring(commaIndexId, allIds.indexOf(',', commaIndexId));
                    findName = allNames.substring(commaIndexName, allNames.indexOf(',', commaIndexName));
                    findMarksPf = allMarksPF.substring(commaIndexMarksPf, allMarksPF.indexOf(',', commaIndexMarksPf));
                    findMarkOOP = allMarksOOP.substring(commaIndexMarksOOP, allMarksOOP.indexOf(',', commaIndexMarksOOP));

                    double average = (Integer.parseInt(findMarksPf) + Integer.parseInt(findMarkOOP)) / 2.;
                    int total = Integer.parseInt(findMarksPf) + Integer.parseInt(findMarkOOP);

                    maxMarks = total > maxMarks ? total : maxMarks;
                    minMarks = total < minMarks ? total : minMarks;

                    commaIndexId = allIds.indexOf(",", commaIndexId) + 1;
                    commaIndexName = allNames.indexOf(",", commaIndexName) + 1;
                    commaIndexMarksPf = allMarksPF.indexOf(",", commaIndexMarksPf) + 1;
                    commaIndexMarksOOP = allMarksOOP.indexOf(",", commaIndexMarksOOP) + 1;

                    System.out.printf("|%-5s", STR." \{findId}");
                    System.out.printf(STR."|%-\{nameWidth + 2}s", STR." \{findName}");
                    System.out.printf(STR."|%-\{totalWidth}s", STR." \{total}");
                    System.out.printf(STR."|%-\{averageWidth}s", STR." \{average}");
                    System.out.printf("|%-5s", average >= 75 ? " A" : average >= 65 ? " B" : average >= 55 ? " C" : average >= 45 ? " S" : " F");
                    System.out.println("|");

                }
                System.out.println("+".concat("-".repeat(5)).concat("+").concat("-".repeat(nameWidth + 2)).concat("+").concat("-".repeat(totalWidth)).concat("+").concat("-".repeat(averageWidth)).concat("+").concat("-".repeat(5)).concat("+"));
                System.out.println();

                System.out.println(STR."MAX: \{maxMarks}");
                System.out.println(STR."MIN: \{minMarks}");
                System.out.println(STR."Name Width: \{nameWidth}");

                while (true) {
                    System.out.print("Press \"H\" to return Home: ");

                    if (SCANNER.next().equals("H")) {
                        continue home;
                    }
                }

            }

            case 5 -> {
                //TODO : EXIST
            }

            default -> {
                System.out.println("Invalid Input");
            }
        }
    }

}