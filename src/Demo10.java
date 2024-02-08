void main() {
    String str = "";
    System.out.println("Is Empty: " + str.isEmpty());
    System.out.println("Is Blank: " + str.isBlank());

    String str1 = "ABCD";
    System.out.println(str1.length());
    System.out.println(STR."Is Empty: \{str1.isEmpty()}");
    System.out.println(STR."Is Blank: \{str1.isBlank()}");

    String str2 = " ";
    System.out.println(str2.length());
    // str2.strip().length() == 0 && str2.strip().length() == str2.length()
    // True: Empty
    // False: Blank
    System.out.println(STR."Is Empty: \{str2.isEmpty()}");
    System.out.println(STR."is Blank: \{str2.isBlank()}");
    System.out.println(str2.strip().length() == 0 && str2.strip().length() == str2.length() ? "EMPTY+BLANK":"BLANK");
}