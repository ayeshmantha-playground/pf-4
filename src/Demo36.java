import java.math.BigDecimal;
import java.util.Scanner;

void main (){

    // 1. Identity Conversion
    myMethod1(10);
    myMethod2('a');
    myMethod3(new Scanner(System.in));
    myMethod4("IJSE");

    // 2. Widening Primitive Conversion
    myMethod5(10);  // int -> long
    myMethod6(10L); // long -> double
    myMethod6('c'); // char -> double

    // 3. Widening reference Conversion
    myMethod7(new BigDecimal(10));  //Widening reference Conversion
    myMethod8(new BigDecimal(10));  //Widening reference Conversion
    myMethod8("IJSE");
    myMethod8(new Scanner(System.in));

    // 4. Boxing Conversion optionally followed by Widening reference Conversion
    myMethod9('c'); // char -> Character (Boxing conversion)
    myMethod10(10.25); // double -> Double (Boxing conversion)
    myMethod7(10);  // int -> Integer -> Number (Boxing Conversion optionally followed by Widening reference Conversion)
    myMethod8(10.2f);   // float -> Float -> Object (Boxing Conversion optionally followed by Widening reference Conversion)

    // 5. Unboxing Conversion optionally followed by widening primitive Conversion
    myMethod1(Integer.valueOf(10)); //Unboxing Conversion
    myMethod2(Character.valueOf('c'));  //Unboxing Conversion;
    myMethod5(Integer.valueOf(20)); //Integer ->int -> long (Unboxing Conversion optionally followed by widening primitive Conversion)
    myMethod6(Character.valueOf('c')); //Character -> char -> double (Unboxing Conversion optionally followed by widening primitive Conversion)

    // Narrowing primitive conversion is not working with invocation contexts
//    myMethod0(10);
//    myMethod2(10);


}

void myMethod0(byte b){}
void myMethod1(int x){
}

void myMethod2(char c){}

void myMethod3(Scanner scanner){}

void myMethod4(String str){}

void myMethod5(long l){}

void myMethod6(double d){}

void myMethod7(Number number){}

void myMethod8(Object o){}

void myMethod9 (Character c){}

void myMethod10 (Double d){}
