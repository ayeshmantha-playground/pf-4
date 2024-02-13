void main(){
    byte b = 10;
    int x = b; // Widening primitive conversion

    short s = b; // Widening primitive conversion

    int y = x; // Identity primitive conversion

    char c = 'c';
    x = c; // Widening primitive conversion

//    long l = y; // Widening primitive conversion
    long l2 = 20; // Widening primitive conversion


    float f = 10; // Widening primitive conversion

    long l = y;
    float f2 = l; // Widening primitive conversion
}