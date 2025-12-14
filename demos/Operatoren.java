void main() {

    IO.println("Hello World!");

    int a = 10;
    IO.println("a = " + a); // a = 10
    
    int b = ++a;
    System.out.println("b = " + b); // b = 11

    int c = a * b;
    IO.println("c = " + c); // c = 110

    int d = 12 % 5;
    IO.println("d = " + d); // d = 2

    boolean e = a != b;
    IO.println("e: " + e); // a > b: false

}