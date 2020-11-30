package lesson1;

public class Main {

    public static void main(String[] args) {
//        printHelloWorld();
//        testVars();
//        testInc();
//        int a = 1;
//        int b = 2;
//        int result = sumVarAandIncVarB(a, b);

        calculateSalary();
    }

    static void printHelloWorld() {
        System.out.println("Hello, world!");
    }



    private static void testVars() {
        int varA;
        int varB;
    }

    private static void testInc() {
        int c = 0;
//        c += 1;
        System.out.println(c++); // 0 > 0 > 1
        System.out.println(++c); // 2 > 2 > 2
        System.out.println(c--); // 2 > 2 > 1
        System.out.println(--c); // 1 > 0 > 0
        System.out.println(c + 1); // 0 > 1 > 0
        System.out.println(c); // 0 > 0 > 0
    }


    private static int sumVarAandIncVarB(int a, int b) {
        b++;
        System.out.println("b in method: " + b);
        return 0;
    }

    private static void calculateSalary() {
        final int TAX_RUSSIA = 13;
        System.out.println(calculateSalary);
    }
}
