public class OOP_010 {
    public static void main(String arg[]) {
        int a = 20, b = 0;
        try {
            if (b == 0) {
                throw new NullPointerException();
                // Explicitly throwing
            }
        } catch (ArithmeticException e) {
            // Fails to enter this catch block
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("OTHER ERROR 1");
            // As NullPointerException is thrown so it cannot find any match catch block
        }
        try {
            // Without any code I can throw exception in try block
            throw new ArithmeticException();
            // Explicitly throwing

        } catch (NullPointerException e) {
            // Fails to enter this catch block
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("OTHER ERROR 2");
            // As ArithmeticException is thrown so it cannot find any match catch block
        }
        System.out.println("End of program");
    }
}