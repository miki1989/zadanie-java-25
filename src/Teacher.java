public class Teacher extends  Person{


    private String faculty;

    public Teacher(String name, String lastName, int age, String hobby, String faculty) {
        super(name, lastName, age,hobby);
        this.faculty = faculty;
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
