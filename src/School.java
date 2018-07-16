public class School {
    public static void main(String[] args) {

        Student student1 = new Student("Jan", "Kowalski", 20, "modelarstwo", 2000);
        student1.show();
        Teacher teacher1 = new Teacher("Wiktor","Czaja", 50, "szydełkowanie", "fizyka");
        teacher1.show();

    }
}
