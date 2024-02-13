void main(){
    int x = 10;
    int y = 20;
    byte b = 20;

    System.out.println(x + y); //Identity Conversion
    System.out.println(x + b); //Not an Identity Conversion
                                //Widening primitive conversion

    System.out.println(7 / 2 * 2.2);// Why end reuslt is 6.0 rather 7.0

    int x2 = 5;
    int y2 = 2;
    float f = x2 / y2 * 2.f;
    System.out.println(f);
    //what is the reason for the end result 4.0
}