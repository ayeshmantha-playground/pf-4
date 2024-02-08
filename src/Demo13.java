void main(){
    String str = "This is a String";
    System.out.println(str.startsWith("Th"));
    System.out.println(str.startsWith("ab"));

    System.out.println(str.endsWith("ing"));
    System.out.println(str.endsWith("ies"));

    System.out.println(str.startsWith("is"));
    System.out.println(str.startsWith("is",2));
}