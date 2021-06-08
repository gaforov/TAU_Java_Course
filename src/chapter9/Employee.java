package chapter9;

public class Employee extends Person{
    private String employeeeId;

    public String getEmployeeeId() {
        return employeeeId;
    }

    public void setEmployeeeId(String employeeeId) {
        this.employeeeId = employeeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;
}
