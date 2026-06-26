public class OOP_013 {
    public static int test() {
        try {
            System.out.println("Inside try block before return");
            return 10;
            System.out.println("Inside try block after return");
        } finally {
            // System.out.println("Finally block executed.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Returned value: " + test());
        for(int i = 0; i < 5; i++){
            try{
                if(i == 3){
                    System.out.println("Inside try block before break");
                    break;
                    System.out.println("Inside try block after break");
                }
            }
            finally{
                System.out.println("Value of i:"+i);
            }
        }
    }
}
