public class Student {
    
    private String surname;
    private String favoriteSubject;
    private String programsIn;
    private int age;
    private String firstName;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    public String getProgramsIn() {
        return programsIn;
    }

    public void setProgramsIn(String programsIn) {
        this.programsIn = programsIn;
    }

    @Override
    public String toString() {
        return "Estudante: " +
                "Nome: " + surname + 
                ", Estuda: " + favoriteSubject +
                ", Programa em: " + programsIn +
                ", Idade: " + age +
                ", Sobrenome: " + firstName;
    }
}
