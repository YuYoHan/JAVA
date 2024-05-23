package ex09;

public class Student {
    private String name;
    private String addr;
    private String phoneNum;

    public Student() {
    }

    public Student(String name, String addr, String phoneNum) {
        this.name = name;
        this.addr = addr;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
