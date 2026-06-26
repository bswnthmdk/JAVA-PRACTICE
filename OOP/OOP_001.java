class OOP_001 {
    public static void main(String[] args) {

        String str = "Hello, World!";
        System.out.println("Length: " + str.length());
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase: " + str.toUpperCase());
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase: " + str.toLowerCase());
        int indexOfW = str.indexOf('W');
        System.out.println("Index of 'W': " + str.indexOf('W'));
        String substring = str.substring(7, 12);
        System.out.println("Substring: " + str.substring(7, 12));

    }
}
