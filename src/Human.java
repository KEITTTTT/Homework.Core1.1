public class Human {
    String name;
    String town;
    int yearOfBirth;
    String jobTitle;

    Human ( int yearOfBirth, String name, String town, String jobTitle){
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    void introduce(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году." +
                " Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}

