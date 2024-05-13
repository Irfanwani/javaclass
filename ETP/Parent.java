package ETP;

import java.util.ArrayList;

class Parent {
    private ArrayList<Integer> list;
    public Parent() {
        list = new ArrayList<>();   
    }

    public void setRecord(int val) {
        this.list.add(val);
    }

    public void getRecord() {
        for(Integer i : this.list) {
            System.out.println(i);
        }
    }
}