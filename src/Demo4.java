void main(){
    String firstName = "Kasun";
    String lastName = "Sampath";
    int age = 15;

    String str  = String.format("Fist Name: %3$s, Last Name: %1$s, Age: %2$s \n" , firstName, lastName, age);

    System.out.println(str);

    String.format("First Name: %s", firstName);
}