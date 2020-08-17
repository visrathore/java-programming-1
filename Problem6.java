class Employee1{
    String name;
    int yoj;
    String address;
    Employee1(String name,int yoj,String address)
    {
        this.name = name;
        this.yoj = yoj;
        this.address = address;
    }
    void display()
    {
        System.out.println(name + String.format("%10d",yoj)+ "          " + address);
    }
}
public class Problem6{
    public static void main(String[] args) {
        Employee1 em1 = new Employee1("Vishal", 2020, "Rajasthan");
        Employee1 em2 = new Employee1("Nishant", 2019, "Rajasthan");
        Employee1 em3 = new Employee1("Anshul", 2021, "Rajasthan");
        System.out.println("Name" + "  " + "Year of Joining" + "     "+"Address");
        em1.display();
        em2.display();
        em3.display();
    }
}