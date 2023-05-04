import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {
    private Student headman;
    private List<Student> students;
    private List<Task> tasks;

    public Group(Student headman) {  // constructor with only headman
        this.headman = headman;
        this.students = new ArrayList<>();
        this.students.add(headman);
        this.tasks = new ArrayList<>();
    }

    public Group(Student headman, Student... students) { // constructor with headman and several students
        this.headman = headman;
        this.students = new ArrayList<>();
        this.students.add(headman);
        this.students.addAll(Arrays.asList(students));
        this.tasks = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        if (student.equals(headman)) {
            System.out.println("Cannot remove headman from group!");
            return;
        }
        students.remove(student);
    }

    public void renameStudent(Student student, String newName) {
        student.setName(newName);
    }

    public void setHeadman(Student headman) {
        this.headman = headman;
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public Student getHeadman() {
        return headman;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student... students) {
        this.students = new ArrayList<>(Arrays.asList(students));
    }

    public void completeTask(Student student, Task task) {
        if (!students.contains(student)) {
            System.out.println("Student not found in group!");
            return;
        }
        if (!tasks.contains(task)) {
            System.out.println("Task not found in group!");
            return;
        }
        task.addCompletedBy(student.getId());
    }

    public void completeTask(List<Student> students, Task task) {
        for (Student student : students) {
            completeTask(student, task);
        }
    }

    public String toString() {
        return "Group{" + "headman=" + headman + ", students=" + students + ", tasks=" + tasks + '}';
    }
}
