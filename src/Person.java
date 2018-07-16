public class Person {
    private String name;
    private String lastName;
    private int age;
    private String hobby;

    public Person(String name, String lastName, int age, String hobby) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.hobby = hobby;
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

    public void show(){
        System.out.println("Nazywam się " + name + " " + lastName + " mam " + age + " lat, a moje hobby to " + hobby);
    }
}
