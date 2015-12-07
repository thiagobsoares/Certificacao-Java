class Sobrecarga_4_B{}
class Sobrecarga_4_C{}
class Sobrecarga_4_D extends B{}
class A {
    int a(D d) { return 1; }
    int a(C c) { return 2; }
    int a(B b) { return 3; }
    int a(A a) { return 4; }
    public static void main(String[] args) {
        System.out.println(a(new D()));
    }
}