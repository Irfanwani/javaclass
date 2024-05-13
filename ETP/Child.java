package ETP;

class Child extends Parent {
    public Child() {
        super();
    }

    public void setfromchild(int val) {
        super.setRecord(val);
    }

    public void getfromchild() {
        super.getRecord();
    }
}