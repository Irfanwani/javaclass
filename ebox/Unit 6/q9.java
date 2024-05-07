import java.util.*;

class Card implements Comparable<Card> {
    private int num;
    private String symbol;

    public Card() {};
    public Card(String symbol, int num) {
        this.num = num;
        this.symbol = symbol;
    }

    public int getNumber() {
        return this.num;
    }

    public String getSymbol() {
        return this.symbol;
    }

    @Override
    public int compareTo(Card c) {
        if(this.num == c.getNumber()) {
            return this.symbol.compareTo(c.getSymbol());
        } 
        if(this.getNumber() > c.getNumber()) {
            return 1;
        }else {
            return -1;
        }
    }
};

class Main
{
    public static void main(String args[])
    {
        //Fill your code here
        Scanner input  = new Scanner(System.in);
        ArrayList<Card> m = new ArrayList<>();
         int count = 0; 
          String s = ""; 
           int re = 0; 
           do { 
            System.out.println("Enter a card :"); 
            String s1 = input.nextLine(); 
            Integer s2 = input.nextInt(); 
            input.nextLine(); 
            re++; 
            if (!(s.contains(s1))) { 
                s = s + s1; 
                count++; 
                m.add(new Card(s1, s2)); 
            } 
        }while(count < 4); 
        Collections.
      sort
(m); 
        System.out.println("Four symbols gathered in " + re + " cards."); 
        System.out.println("Cards in Set are :"); 
        Iterator it = m.
      iterator
(); 
        while (it.hasNext()) { 
            Card c = (Card) it.next(); 
            System.out.println(c.getSymbol() + " " + c.getNumber()); 
        } 
    } 
} 