public class Main {
    public static void main(String[] args) {

        // Create a new group with a headman and 2 students
        Student headman = new Student("John");
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        Group group = new Group(headman, student1, student2);

        System.out.println("Initial state : " + group); // Show group

        // Add a new student to the group
        Student student3 = new Student("Charlie");
        group.addStudent(student3);

        System.out.println("Add new student : " + group); // Show group

        // rename some of student
        group.renameStudent(student2, "Bobby");

        System.out.println("Rename Bob to Bobby : " + group); // Show group

        // remove some student
        group.removeStudent(student1);

        System.out.println("Remove Alice : " + group); // Show group

        // add one task
        Task task1 = new Task("Task 1");
        group.addTask(task1);

        // add second task
        Task task2 = new Task("Task 1");
        group.addTask(task2);

        System.out.println("Tasks: " + group); // Show group

        // assign Task 2 as completed by student2 - Bobby
        group.completeTask(student2, task2);

        System.out.println("Completed task2: " + group); // Show group

    }
}
