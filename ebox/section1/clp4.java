class Main {
    public static void main(String[] args) {
        try {
        int x = Integer.parseInt(args[0]);
        System.out.println("The given input is an integer");
        }catch(Exception e) {
        System.out.println("The given input is a string");

        }
    
    }
}