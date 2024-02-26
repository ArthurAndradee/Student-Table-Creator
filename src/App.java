import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
Scanner read = new Scanner(System.in);

int NUM_STUDENTS = 10;

ArrayList<Student> students = new ArrayList<Student>();

for (int i = 0; i < NUM_STUDENTS; i++) {
    Student s = new Student();

    System.out.print("Nome: ");
    String surname = read.nextLine();

    System.out.print("Sobrenome: ");
    String fname = read.nextLine();

    System.out.print("Idade: ");
    int age = read.nextInt();

    System.out.print("Estuda: ");
    String favoriteSubject = read.next();

    System.out.print("Programa em: ");
    String programsIn = read.next();

    s.setSurname(surname);
    s.setFirstName(fname);
    s.setAge(age);
    s.setFavoriteSubject(favoriteSubject);
    s.setProgramsIn(programsIn);

    System.out.println("Estudante atual: \n" + s);
    students.add(s);
    read.nextLine(); // clear the buffer
}   
System.out.println("All players");
System.out.println(students);

}
}
