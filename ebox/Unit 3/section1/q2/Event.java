class Event {
    private String name;
    private String detail;
    private String type;
    private String organiserName;

    public Event(String name, String detail, String type, String organiserName) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiserName = organiserName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrganiserName() {
        return organiserName;
    }

    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }
}