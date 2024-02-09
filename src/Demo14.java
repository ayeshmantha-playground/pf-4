void main() {

    String data = """ 
            5-Kasun Sampath-Galle,
            2-Amil Shantha-Panadura,
            10-Pradeep Kumara-Kandy,
            250-Ruwani-Matara,
            12-Buddika Senavirathne-Ambalalngoda
            """;

    int count = data.isBlank() ? 0 : data.length() - data.replace(",", "").length() + 1;

    int maxNameSize = 0, maxAddressSize = 0;

    String ids = "", names = "", addresses = "";
    int commaIndex = 0;

    for (int i = 0; i < count; i++) {


        String studentDetails = i == (count - 1) ? data.substring(commaIndex) : data.substring(commaIndex, data.indexOf(',', commaIndex));
        commaIndex = data.indexOf(",", commaIndex) + 1;

        int firstHyphenIndex = studentDetails.indexOf('-');
        int lastHyphenIndex = studentDetails.lastIndexOf('-');

        String id = String.format("S%03d", Integer.parseInt(studentDetails.substring(0, firstHyphenIndex).replace("\n", "")));
        String name = studentDetails.substring(firstHyphenIndex + 1, lastHyphenIndex);
        String address = studentDetails.substring(lastHyphenIndex + 1).replace("\n", "");

        maxNameSize = maxNameSize < name.length() ? name.length() : maxNameSize;
        maxAddressSize = maxAddressSize < address.length() ? address.length() : maxAddressSize;

        ids += STR."\{id},";
        names += STR."\{name},";
        addresses += STR."\{address},";

    }

    maxNameSize = maxNameSize == 0 ? 10 : maxNameSize + 2;
    maxAddressSize = maxAddressSize == 0 ? 10 : maxAddressSize + 2;

    System.out.println(ids);
    System.out.println(names);
    System.out.println(addresses);
    System.out.println(maxNameSize);
    System.out.println(maxAddressSize);


    System.out.println("+".concat("-".repeat(4)).concat("+").concat("-".repeat(maxNameSize)).concat("+").concat("-".repeat(maxAddressSize)).concat("+"));
    System.out.printf("|%s", " ID |");
    System.out.printf(STR."%-\{maxNameSize}s", "NAME");
    System.out.printf(STR."|%-\{maxAddressSize}s", "ADDRESS");
    System.out.print("|\n");
    System.out.println("+".concat("-".repeat(4)).concat("+").concat("-".repeat(maxNameSize)).concat("+").concat("-".repeat(maxAddressSize)).concat("+"));

    int commaIndexId = 0;
    int commaIndexName = 0;
    int commandIndexAddress = 0;
    for (int j = 0; j < count; j++) {

        System.out.printf("|%s", ids.substring(commaIndexId, ids.indexOf(",", commaIndexId)));
        System.out.printf(STR."|%-\{maxNameSize}s", names.substring(commaIndexName, names.indexOf(",", commaIndexName)));
        System.out.printf(STR."|%-\{maxAddressSize}s", addresses.substring(commandIndexAddress, addresses.indexOf(",", commandIndexAddress)));
        System.out.print("|\n");

        commaIndexId = ids.indexOf(",", commaIndexId) + 1;
        commaIndexName = names.indexOf(",", commaIndexName) + 1;
        commandIndexAddress = addresses.indexOf(",", commandIndexAddress) + 1;
    }
    System.out.println("+".concat("-".repeat(4)).concat("+").concat("-".repeat(maxNameSize)).concat("+").concat("-".repeat(maxAddressSize)).concat("+"));

}