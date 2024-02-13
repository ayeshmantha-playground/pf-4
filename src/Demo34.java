import java.util.Calendar;

void main() {
    short primitiveShort = 10; // narrowing primitive conversion
    Short wrapperShort = 10; // narrowing primitive conversion
    // optionally followed by boxing conversion

    Number number = 10; // Boxing conversion optionally followed by
    // widening reference conversion

    float f = wrapperShort; // Unboxing conversion optionally followed by
    // widening primitive conversion

}