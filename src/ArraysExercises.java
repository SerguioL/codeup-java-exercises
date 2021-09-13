import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = {
                new Person("Bob"),
                new Person("Ron"),
                new Person("Joe")
        };

        Person person = new Person("Juan");

        for (int i =0; i< people.length; i++){
            System.out.println(people[i].getName());
        }

        addPerson(people,person);

    }

    public static void addPerson(Person[] people ,Person person){
        Person[] newArr = Arrays.copyOf(people,people.length + 1);

        newArr[people.length] = person;

        for (Person p: newArr){
            System.out.println(p.getName());
        }

    }

}
