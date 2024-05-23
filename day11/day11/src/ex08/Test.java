package ex08;

public class Test {
    public static void main(String[] args) {
        Person worker = new PersonA();
        Person worker2 = new PersonB();
        worker.setName("김땡땡");
        worker.setAge(32);
        worker2.setName("박땡땡");
        worker2.setAge(34);
        System.out.println(worker.getName());
        System.out.println(worker.getAge());

        Company company = new Company();
        company.setRetiree(worker2.getName());
        System.out.println(company.getRetiree());
    }
}
