package ex08;

// 상속 불가능
public final class Company{
    private String retiree;

    public Company() {
    }

    public Company(String retiree) {
        this.retiree = retiree;
    }

    public String getRetiree() {
        return retiree;
    }

    public void setRetiree(String retiree) {
        this.retiree = retiree;
    }
}
