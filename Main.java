// Basics + Command Line Arguments
public class Main {
    static void addnum(int arr[]) {
        arr[0] = 10;
    }

    static void display(int arr[]) {
        System.out.println(arr[0]);
    }
    public static void main(String[] args) {
        int arr[] = {23};
        addnum(arr);
        display(arr);
    }
}
