import java.math.BigDecimal;
import java.util.Scanner;

void main () {
    int x =(int) 10; //Identity Conversion. Casting is optional.
    byte b1 = (byte) 10; //int->byte | Narrowing Primitive conversion. Casting is optional.
    byte b2 = (byte) x; //int-> byte | Narrowing Primitive conversion. Casting is mandatory.
    double d = (double) 10.25; //Identity Conversion. Casting is optional.
    double d2 = (double) x; // int -> double | Widening primitive Conversion, optional
    double d3 = (double) x / 3 * 3; // int -> double | Widening primitive Conversion, mandatory(to get the right result)
    byte b3 = (byte) 2.; // double -> byte |Narrowing Primitive conversion.mandatory.
    int y = (byte) 5.;
    // 1. double -> byte |Narrowing Primitive conversion.mandatory.
    // 2. byte -> int |Widening primitive Conversion, optional
    int a = (int) 3.;
    // 1. double -> int Narrowing Primitive Conversion, mandatory
    // 2. int -> int | Identity Conversion, optional
//
//    boolean flag1 = (boolean) 5.3;
//    boolean flag2 = (boolean) 1;
//
////    int myInt = (int) "ijse";
//    String str = "10";
//    int myInt2 = (int) str;
//    String str2 = (String) new Scanner(System.in);
//    Number n = 55;
//    Integer i = (Integer) n;
//    Number n2 = i;
//
//    Scanner scanner = null;
//    String str3 = (String) scanner;
//    BigDecimal bd = (BigDecimal) null;
//
//    byte b4 = 10;
//    long l = (byte) b4;
//
//    long l2 = 20;
//    int i3 = (long) 12;



}