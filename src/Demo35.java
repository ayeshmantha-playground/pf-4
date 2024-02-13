import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Scanner;

void main (){
    //Assignment contexts
    // 1. Identity conversion
    int x = 10;
    x = 20 + 30;
    char c1 = 'c';
    Scanner scanner = new Scanner(System.in);
    String string = "IJSE";
    char c2 = 65; // This is not identity conversion | int => char
    byte b1 = 10; // This is not identity conversion | int => byte

    // 2. Widening primitive conversion
    int x2 = (byte) 10;
    int x3 = 'c';
    float f1 = x2;
    float f2 = 2l;

    // 3. Widening reference conversion
    Object o1 = "IJSE";
    CharSequence cs1 = "DEP";
    Serializable serial1 = "DEP-12";
    Object o2 = new Scanner(System.in);
    Number n1 = new BigDecimal("100.20");
    Object o3 = n1;


    // 4. Boxing conversion optionally followed by widening reference Conversion
    Integer i = Integer.valueOf(10);    //Explicitly Boxing
    Integer i2 = 10;                      //Implicitly Boxing (Auto Boxing)
    Character c3 = 'c';
    Float f3 = 2.35f;
//    Float f4 = 10;  //int -> float -> Float (Widening Primitive Conversion + Boxing Conversion)
                    // There is no such conversion method in assignment contexts. So we can't do that

//    Long l3 = 10; //int -> long -> Long
//    Double d2 = 2.2f; // float -> double -> Double

    Number n2 = 2.35f; // float -> Float (Boxing Conversion) + Float -> Number (Widening Reference Conversion)
    Object o4 = 1l;     // long -> Long (Boxing Conversion) + Long -> Object (Widening Reference Conversion)

    // 5. Unboxing conversion optionally followed by widening primitive conversion

    Integer i3 = Integer.valueOf(10);
    int i4 = i3.intValue(); //Explicitly Unboxing;
    int i5 = i3;    //Implicitly Unboxing;
    long l1 = i3; // Integer -> int (Unboxing Conversion) + int -> long (widening primitive conversion)

    Character c4 = Character.valueOf('c');
    char c5 = c4.charValue();   //Explicit Unboxing
    char c6 = c4;               //Implicit Unboxing
    int i6 = c4;    //Character -> char (Unboxing Conversion) + char -> int (widening primitive conversion)
    double d2 = c4; //Character -> char (Unboxing Conversion) + char -> double (widening primitive conversion)

    // 6. If the expression is compile-time constant and the type of the data is equal to byte, shot, int and char then
    // Narrowing conversion optionally followed by boxing conversion

    byte b2 = 10;   //narrowing primitive conversion
    Byte b3 = 10;   // int -> byte (narrowing primitive conversion) + byte -> Byte (Boxing Conversion)

    byte b4 = 'c'; // char -> byte (narrowing primitive conversion)
    Byte b5 = 'c'; // char -> byte (narrowing primitive conversion) + byte -> Byte (Boxing Conversion)

}