class Main {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Invalid Input");
            return;
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum = x + y;
        System.out.println("The sum of " + x + " and " + y + " is " + sum );
    }
}