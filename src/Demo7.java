import java.math.BigDecimal;

void main(){
    String str1;
    String str2 = null;
    BigDecimal bd = null;
    String str3 = "";

    System.out.println(str2);
    System.out.println(bd);
    System.out.println((Object) str2 == (Object) bd);
    System.out.println(str3);
}