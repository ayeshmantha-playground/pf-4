void main(){
    boolean myPrimitiveBoolean = true;
//    Boolean myWrapperBoolean = new Boolean(true);
    Boolean myWrapperBoolean1 = Boolean.valueOf(myPrimitiveBoolean);

    byte myByte  = 10;
//    Byte myWrapperByte = Byte.valueOf(myByte);            boxing
    Byte myWrapperByte = myByte;                            // auto boxing

    short myShort = 20;
//    Short myWrapperShort = Short.valueOf(myShort);        boxing
    Short myWrapperShort = myShort;                         // auto boxing

    int myInt = 30;
//    Integer myWrapperInteger = Integer.valueOf(myInt);    boxing
    Integer myWrapperInteger = Integer.valueOf(myInt);      // auto boxing

    long myPrimitiveLong = 20;
//    Long myWrapperLong = Long.valueOf(myPrimitiveLong);   boxing
    Long myWrapperLong = Long.valueOf(myPrimitiveLong);     // auto boxing

    float myPrimitiveFloat = 2f;
//    Float myWrapperFloat = Float.valueOf(myPrimitiveFloat);   boxing
    Float myWrapperFloat = Float.valueOf(myPrimitiveFloat);     // auto boxing

    double myPrimitiveDouble = 23.;
//    Double myWrapperDouble = Double.valueOf(myPrimitiveDouble);   boxing
    Double myWrapperDouble = Double.valueOf(myPrimitiveDouble);     // auto boxing

}