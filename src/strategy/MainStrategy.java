package strategy;

public class MainStrategy {
    public static void main(String[] args) {
        Student student = new Student();

        student.setActivity(new Sleeping());
        student.executeActivity();
        student.setActivity(new Studying());
        student.executeActivity();
        student.setActivity(new Reading());
        student.executeActivity();


    }
}
