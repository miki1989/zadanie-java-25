public class Teacher extends  Person{

    private String name;
    private String lastName;
    private int age;
    private String hobby;
    private String faculty;

    public Teacher(String name, String lastName, int age, String hobby, String faculty) {
        super(name, lastName, age,hobby);
        this.faculty = faculty;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Moja specjalność to " +faculty);
    }

}
