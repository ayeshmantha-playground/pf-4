void main(){
    Boolean myWrapperBoolean = true;
    boolean myPrimitiveBoolean = myWrapperBoolean.booleanValue();

   // Byte myWrapperByte = (byte) 10; Narrowing Primitive Conversion + (Auto) Boxing Conversion
    Byte myWrapperByte =  10; //Narrowing Primitive Conversion optional followed by Boxing Conversion
    byte myPrimitiveByte = myWrapperByte.byteValue();

//    Short myWrapperShort = (short) 20; Narrowing Primitive Conversion + (Auto) Boxing Conversion
    Short myWrapperShort =  20; //Narrowing Primitive Conversion optional followed by Boxing Conversion
    short myPrimitiveShort = myWrapperShort.shortValue();

    Character myWrapperCharacter = 'c';
    char myPrimitiveChar = myWrapperCharacter.charValue();

    Integer myWrapperInteger = 10;
    int primitiveInteger = myWrapperInteger.intValue();

    Long myWrapperLong = 10L;
    long myPrimitiveLong = myWrapperLong.longValue();

    Float myWrapperFloat = 2.f;
    float myPrimitiveFloat = myWrapperFloat.floatValue();

    Double myWrapperDouble = 2.;
    double myPrimitiveDouble = myWrapperDouble.doubleValue();
}


