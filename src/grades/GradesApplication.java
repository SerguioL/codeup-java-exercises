package grades;

import java.util.*;

public class GradesApplication {

    public static Map<String,Student> createStudents(){

        // java generic
        Map<String,Student> students = new HashMap<>();
        //objects
        Student bob = new Student("Bob");
        bob.addGrade(50);
        bob.addGrade(75);
        bob.addGrade(100);

        Student joe = new Student("Bob");
        joe.addGrade(80);
        joe.addGrade(59);
        joe.addGrade(96);

        Student juan = new Student("Juan");
        juan.addGrade(70);
        juan.addGrade(85);
        juan.addGrade(90);

        Student ron = new Student("Ron");
        ron.addGrade(90);
        ron.addGrade(55);
        ron.addGrade(85);

        students.put("B0B!",bob);
        students.put("eoj", joe);
        students.put("0ne", juan);
        students.put("R0n1234", ron);

        return students;

    }


    public static void displayUsernames(List<String> usernames){
        System.out.println("Here are the GitHub usernames of our students:\n");

        String outputOfUsernames = "";
        for(String username : usernames){
            outputOfUsernames += String.format("| %s | ", username);//.format will return a string similar to the printf method
        }

        System.out.println(outputOfUsernames);
    }


    public static void  displayUser(Student student,String username){

        if(student != null) {
            System.out.printf("Name: %s- GitHub Username: %s%nCurrent Average: %f%n", student.getName(), username, student.getGradeAverage());
        }else {
            System.out.println("\nSorry, no student found with the GitHub username of \"" + username+ "\".");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome\n");

        Map<String,Student> students = createStudents();

        Scanner sc = new Scanner(System.in);
        String willContinue;

        do {
            // display all usernames from the map
            List<String> usernames = new ArrayList<>(students.keySet());

            displayUsernames(usernames);

            System.out.println("\nWhat student would you like to see more information on?\n");

            String username = sc.nextLine();
            Student student = students.get(username);
            displayUser(student, username);

            System.out.println("Would you like to see another student?(y for yes and n for no)\n");

             willContinue = sc.nextLine();
        } while (willContinue.equalsIgnoreCase("y"));

        System.out.println("\nGoodbye, and have a wonderful day!");






    }

}
