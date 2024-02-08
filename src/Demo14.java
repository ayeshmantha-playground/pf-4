import javax.print.attribute.standard.MediaSize;

void main(){
    final String NAMES = """ 
            5-Kasun Sampath-Galle,
            2-Amil Shantha-Panadura,
            10-Pradeep Kumara,
            250-Ruwani-Matara,
            """;

    String id;
    int numbersOfNames;

    String firstDetails = NAMES.substring(0,NAMES.indexOf(','));
    String names;
    String address = "";

    int firstIndex = 0;
    while (true){

        int lastIndex = 0;
        lastIndex = NAMES.substring(firstIndex,NAMES.indexOf(',')).length();

        String allDetials;
        String allDetailsSum = "";

        allDetials = NAMES.substring(firstIndex,lastIndex);
        allDetailsSum += allDetials;

        address += allDetials.substring(allDetials.lastIndexOf('-')+ 1);
        firstIndex += lastIndex;
        System.out.println(address);
        System.out.println("First Index: "+ firstIndex);
        System.out.println("Last Index:"+ lastIndex);

//        break;

        if(allDetailsSum.length() > NAMES.length()){
            break;
        }

    }

}