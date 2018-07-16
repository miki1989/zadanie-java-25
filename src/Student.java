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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
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
