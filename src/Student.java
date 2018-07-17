public class Student extends  Person{

    private String name;
    private String lastName;
    private int age;
    private String hobby;
    private int pocketMoney;

    public Student(String name, String lastName, int age, String hobby, int pocketMoney) {
        super(name, lastName, age, hobby);
        this.pocketMoney = pocketMoney;
    }

    public int getPocketMoney() {
        return pocketMoney;
    }

    public void setPocketMoney(int pocketMoney) {
        this.pocketMoney = pocketMoney;
    }
@Override
    public void show(){
        super.show();
        System.out.println("Wysokość mojego kieszkonkowego to " +pocketMoney);
    }
}
