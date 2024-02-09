void main(){
    String data = """ 
            5-Kasun Sampath-Galle,
            2-Amil Shantha-Panadura,
            10-Pradeep Kumara-Kandy,
            250-Ruwani-Matara
            """;

    int count = data.isBlank() ? 0 :  data.length() - data.replace("," , "").length() + 1;
    int commaIndex = 0;
    System.out.println(count);

    for (int i = 0; i < count; i++) {

        if(i == (count -1)){
            commaIndex = data.indexOf(",");
            System.out.println();
        }

        String studentDetails = data.substring(commaIndex,data.indexOf(",",commaIndex));
        commaIndex = data.indexOf(",",commaIndex) + 1;
        System.out.println(studentDetails);
    }


}