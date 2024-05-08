import java.util.*;

class  NumberSet {
    private Set<Integer> numberSet;
    public NumberSet() {
        this.numberSet = new HashSet<>();
    }
    public void insertElement(Integer x) {
        numberSet.add(x);
    }

    public SortedSet getSumDigits() {
        SortedSet<Integer> set = new TreeSet<>();
        Integer sum = 0;
        for(Integer i : this.numberSet) {
            int n = i;
            while(n > 0) {
                sum += n % 10;
                n /= 10;
            }

            set.add(sum);
            sum = 0;
        }

        return set;
    }
}


class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of integers:");
        int len = sc.nextInt();
        NumberSet ns = new NumberSet();

        for(int i = 0; i < len; i++) {
            ns.insertElement(sc.nextInt());
        }

        SortedSet<Integer> ss = ns.getSumDigits();

        System.out.println("Unique digit sum");

        for(Integer i : ss) {
            System.out.println(i);
        }
    }
}