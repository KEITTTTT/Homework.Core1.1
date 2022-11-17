public class Human {
    String name;
    String town;
    int yearOfBirth;
    String jobTitle;

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (name == null || name.isEmpty()) {
            this.name = " Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null || town.isEmpty()) {
            this.town = " Информация не указана";
        } else {
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth ;
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = " Информация не указана";

        } else {
            this.jobTitle = jobTitle;
        }

    }

    void introduce() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году." +
                " Я работаю на должности " + jobTitle + ". Будем знакомы!");
    }
}

