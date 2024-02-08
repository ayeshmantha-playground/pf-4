import javax.print.attribute.standard.MediaSize;

void main() {
    String data = """ 
            5-Kasun Sampath-Galle,
            2-Amil Shantha-Panadura,
            10-Pradeep Kumara-Kandy,
            250-Ruwani-Matara
            """;

    data = data.replace("\n", "");
    int count = data.isBlank() ? 0 : data.length() - data.replace(",", "").length() + 1;

    String ids = "", names = "", addresses = "";
    int commaIndex = 0;
    for (int i = 0; i < count; i++) {


//            String studentDetail = data.substring(commaIndex);
//
//            int firstHyphenIndex = studentDetail.indexOf("-");
//            int lastHyphenIndex = studentDetail.lastIndexOf("-");
//            String id = studentDetail.substring(0, studentDetail.indexOf("-"));
//            String name = studentDetail.substring((firstHyphenIndex + 1), lastHyphenIndex);
//            String address = studentDetail.substring(lastHyphenIndex + 1);
//            commaIndex = data.indexOf(",", commaIndex) + 1;
//
//            ids += STR."\{id},";
//            names += STR."\{name},";
//            addresses += STR."\{address},";


            String studentDetail = data.substring(commaIndex,(i == count -1) ?data.length() : data.indexOf(",", commaIndex));

            int firstHyphenIndex = studentDetail.indexOf("-");
            int lastHyphenIndex = studentDetail.lastIndexOf("-");
            String id = String.format("S%03d" ,Integer.parseInt(studentDetail.substring(0, firstHyphenIndex)) ) ;
            String name = studentDetail.substring((firstHyphenIndex + 1), lastHyphenIndex);
            String address = studentDetail.substring(lastHyphenIndex + 1);
            commaIndex = data.indexOf(",", commaIndex) + 1;

            ids += STR."\{id},";
            names += STR."\{name},";
            addresses += STR."\{address},";

    }
    System.out.println(ids);
    System.out.println(names);
    System.out.println(addresses);

}