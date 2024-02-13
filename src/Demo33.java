void main(){
    Boolean myWrapperBoolean = true;
    boolean myPrimitiveBoolean = myWrapperBoolean.booleanValue();

    Byte myWrapperByte =  10;
//    byte myPrimitiveByte = myWrapperByte.byteValue();     Unboxing
    byte myPrimitiveByte = myWrapperByte;                   //Auto unboxing

    Short myWrapperShort =  20;
//    short myPrimitiveShort = myWrapperShort.shortValue();     Unboxing
    short myPrimitiveShort = myWrapperShort;                //Auto unboxing

    Character myWrapperCharacter = 'c';
//    char myPrimitiveChar = myWrapperCharacter.charValue();    Unboxing
    char myPrimitiveChar = myWrapperCharacter;              //Auto unboxing

    Integer myWrapperInteger = 10;
//    int primitiveInteger = myWrapperInteger.intValue();       Unboxing;
    int primitiveInteger = myWrapperInteger;    //Auto unboxing

    Long myWrapperLong = 10L;
//    long myPrimitiveLong = myWrapperLong.longValue();     Unboxing;
    long myPrimitiveLong = myWrapperLong;      //Auto unboxing

    Float myWrapperFloat = 2.f;
//    float myPrimitiveFloat = myWrapperFloat.floatValue();     Unboxing;
    float myPrimitiveFloat = myWrapperFloat;   //Auto unboxing

    Double myWrapperDouble = 2.;
//    double myPrimitiveDouble = myWrapperDouble.doubleValue()     Unboxing;
    double myPrimitiveDouble = myWrapperDouble.doubleValue(); //Auto unboxing;
}


